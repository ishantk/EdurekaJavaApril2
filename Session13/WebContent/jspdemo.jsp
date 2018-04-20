<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%-- <%@ page import="java.util.Date" %>
<%@ page isThreadSafe="true" %>  --%>
<%@ include file="printdate.jsp" %>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	<h3>Welcome to JSP Demo</h3>
	
	<%-- <h3>Today is: <%= new Date() %></h3> --%>
	
	<i>Area of Circle with radius 5.5 is   <% out.print(area(5.5)); %> </i> 
	
	<h4>Scriptlet Demo</h4>
	<%
		int a = 10;
		int b = 20;
		int c = a+b;
		out.print("c is: "+c); // out is implict object of PrintWriter
	%>
	<br/>
	<b>a is: <% out.print(a); %></b>
	
	<h4>Declarative Demo</h4>
	<%!
		double pi = 3.14;
	
		double area(double radius){
			double area = pi * radius * radius;
			return area;
		}
	%>
	
	<h4>Expression Demo</h4>
	<br/>
	<b>a is: <%= a %></b>
	<br/>
	<b>area of circle with radius 10 is: <%= area(10) %></b>
	
	<br/>
	<h3>Arrays:</h3>
	<%
		int[] arr = {10,20,30,40,50};
		
		//try{
			out.print("arr[3] is: "+arr[3]);
		//}catch(Exception e){
		//	out.print("Exception is: "+e);
		//}
	
	%>
	
</body>
</html>