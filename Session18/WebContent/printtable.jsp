<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String num = request.getParameter("num");
	
	try{
		
		int n = Integer.parseInt(num);
		for(int i=1;i<=10;i++){
			out.print(n+" "+i+"'s are "+(n*i)+"<br/>");
		}
	}catch(Exception e){
		out.print("Please Enter a suitable Number");
	}

%>	