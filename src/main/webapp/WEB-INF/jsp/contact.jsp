<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://apis.google.com/js/client.js"></script>
<script type="text/javascript">
	function authClick() {
		// Your Client ID is retrieved from your project 
		//in the Developer Console => https://console.developers.google.com
		var CLIENT_ID = '<your Client_id>';
		var SCOPES = [ "https://www.googleapis.com/auth/contacts.readonly" ];

		gapi.auth.authorize({
			client_id : CLIENT_ID,
			scope : SCOPES,
			immediate : false
		}, authResult);

		return false;
	}

	/**
	 * Handle response from authorization server.
	 * @param {Object} authResult Authorization result.
	 */
	function authResult(_Result) {
		var _Div = document.getElementById('divauthresult');
		if (_Result && !_Result.error) {
			// Auth OK! => load API.
			_Div.style.display = 'none';
			loadPeopleApi();
		} else {
			// Auth Error, allowing the user to initiate authorization by
			_Div.innerText = ':( Authtentication Error : ' + _Result.error;
		}
	}

	/**
	 * Load Google People client library. List Contact requested info
	 */
	function loadPeopleApi() {
		gapi.client.load('https://people.googleapis.com/$discovery/rest', 'v1',
				showContacts);
	}
	
	/**
	* Show Contacts Details display on a table pagesize = 100 connections.
	*/
	function showContacts()
	{
	    var request = gapi.client.people.people.connections.list({
	        'resourceName': 'people/me',
	            'pageSize': 100,
	            'requestMask.includeField': 'person.phone_numbers,person.organizations,person.email_addresses,person.names'
	        });
	 
	    request.execute(function(resp) {
	        var connections = resp.connections;
	 
	        if (connections.length > 0)
	        {
	            var _Html = "<table><tr><th>Name</th><th>Email</th><th>Company</th><th>Phone</th></tr>";
	            var _EmptyCell = "<td> - </td>";
	 
	            for (i = 0; i < connections.length; i++)
	            {
	                var person = connections[i];
	                _Html += "<tr>";
	 
	                if (person.names && person.names.length > 0)
	                    _Html += "<td>" + person.names[0].displayName + "</td>";
	                else
	                    _Html += _EmptyCell;
	 
	                if (person.emailAddresses && person.emailAddresses.length > 0)
	                _Html += "<td>" + person.emailAddresses[0].value + "</td>";
	                else
	                    _Html += _EmptyCell;
	 
	            if (person.organizations && person.organizations.length > 0)
	            _Html += "<td>" + person.organizations[0].name + "</td>";
	            else
	            _Html += _EmptyCell;
	 
	            if (person.phoneNumbers && person.phoneNumbers.length > 0)
	            _Html += "<td>" + person.phoneNumbers[0].value + "</td>";
	        else
	            _Html += _EmptyCell;
	 
	            _Html += "</tr>";
	            }
	            divtableresult.innerHTML = "Contacts found : <br>" + _Html;
	        } else {
	            divtableresult.innerHTML = "";
	            divauthresult.innerText = "No Contacts found!";
	        }
	    }); 
	}
</script>
</head>

<body>
<body>
	<h3>Get your contacts using People API</h3>
	<p>
		Press button to Authorize and Download your Contacts in JSON <br /> <br />
		<button onclick="authClick(event)">Load Contacts</button>
	</p>
	<div id="divauthresult"></div>
	<div id="divtableresult"></div>
</body>
</body>

</html>