<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@page import="javax.ws.rs.client.ClientBuilder"%>
<%@page import="javax.ws.rs.client.Client"%>
<%@page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Web Service Client</title>
</head>
<body>

	<%
		// Jersey Client to Access the Web Service Running on the Server
		ClientConfig con = new ClientConfig();
		Client client = ClientBuilder.newClient(con);
		//WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session20B"));
		
		// target -> http://localhost:8080/Session20B/rest/hello
		// Consuming or Accessing the Web Service
		/*String plainRes = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		String htmlRes = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
		String xmlRes = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
		String jsonRes = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		out.print(plainRes+"<br/>");
		out.print(htmlRes+"<br/>");
		out.print(xmlRes+"<br/>");
		out.print(jsonRes+"<br/>");*/
		
		// Targetting a WebService already hosted on some other server
		WebTarget target = client.target(UriBuilder.fromUri("http://www.json-generator.com/api/json/get"));
		String books = target.path("chQLxhBjaW").queryParam("indent", 2).request().accept(MediaType.APPLICATION_JSON).get(String.class);
		out.print(books);
	%>

</body>
</html>