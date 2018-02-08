function setDefaultValue(url) {
	
	console.log("get url " + url);

	$.get(url, function(response) {
		obj = response;
		for (i = 0; i < obj.length; i++) {
				$("#leaveType").append(
						"<option  value='" + obj[i].id + "'>"
								+ obj[i].code + "</option>");
		}
	});
}