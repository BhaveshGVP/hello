# hello
# This is a Testing project with spring core,mvc with spring boot

#In this project you cat fetch contact from google using "localhost:8080/contact" url.

you have set your client id in contact.jsp file, contact.jsp file found uder webapp->WEB-INF->jsp folder

#How to Configure Client ID?

  Step 1: First of all goto Google Developers Console logged with our gmail account and we will create a new project.
  
  Step 2: After that, we have to add the ‘Google People API’ to our project. Search in Library & find it & Enable it.
  
  Step 3: Now you need to configure the OAuth 2 API credentials. So Let’s ‘Go to credentials’
          You’ll only need a Client ID OAuth credential here. Fill the name field and add our allowed domain and callback page urls (you             can add 
          
                'Authorized JavaScript origins'= http://localhost:8080 
                'Authorized JavaScript origins'= http://localhost:8090 
                'Authorized redirect URIs' = http://localhost:8080 ) then save it.
                
 Step 4: Client Id display in Credentials tab.
                
