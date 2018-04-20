<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<h3>Welcome User</h3>
	
	<%
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		String name = (String)session.getAttribute("keyName");
		int age = (Integer)session.getAttribute("keyAge");
		
		out.print("Name is: "+name+" and age is: "+age);
		
		User user = new User();
		
		user.setName("John Watson");
		user.setEmail("john@example.com");
	%>
	
	<h3>User Name is: <%= user.getName() %></h3>
	<h3>User Email is: <%= user.getEmail() %></h3>
	
	
	<jsp:useBean id="user1" class="co.edureka.model.User"/>
	<jsp:setProperty property="name" name="user1" value="Jennie Watson"/>
	<jsp:setProperty property="email" name="user1" value="jennie@example.com"/>
	
	<h3>User Name is: <jsp:getProperty name="user1" property="name"/></h3>
	<h3>User Email is: <jsp:getProperty name="user1" property="email"/></h3>
	
</body>
</html>