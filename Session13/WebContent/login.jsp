<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Email is: ${param.txtEmail}</h3>
	
	<!-- Action Tags -->
	<jsp:include page="printdate.jsp"/>

	<%
		User user= new User();
		
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		if(user.email.equals("admin@example.com") && user.password.equals("pass123")){
			out.print("Login Success !!");
			
			String name = "John Watson";
			int age = 30;
			
			//1. Cookies
			/*
			Cookie ck1 = new Cookie("keyName",name);
			Cookie ck2 = new Cookie("keyAge",String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);*/
			
			//2. HttpSession
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", age);
			
			pageContext.setAttribute("keyName", name, PageContext.SESSION_SCOPE);
			//pageContext.setAttribute("keyName", name, PageContext.REQUEST_SCOPE);
			
	%>
		<!-- <br/>
		<a href="welcome.jsp">Enter Home</a>
		<br/> -->
		
		<jsp:forward page="welcome.jsp"/>	
	<%	
		}else{
			response.sendRedirect("https://www.google.com");
		}
	%>
		

</body>
</html>