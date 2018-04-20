package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.model.User;

@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	User user;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("==doPost executed==");
		
		user = new User();
		
		// Setting the data in Model
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(user);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// DB operation
		
		if(user.email.equals("admin@example.com") && user.password.equals("password123")){
			
			out.print("User Login Success !!<br/>");
			//RequestDispatcher dispatcher = request.getRequestDispatcher("Home");
			//dispatcher.forward(request, response);
			
		}else{
			out.print("User Login Failure !!<br/>");
			//RequestDispatcher dispatcher = request.getRequestDispatcher("loginUser.html");
			//dispatcher.include(request, response);
			
			//response.sendRedirect("https://www.google.co.in");
		}
		
		
		
	}

}
