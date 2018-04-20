package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/WelcomeServlet", "/Home" })
public class WelcomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//String email = request.getParameter("txtEmail");
		
		Date date = new Date();
		
		out.print("Welcome Home <br/><br/>");
		out.print("Today is: "+date+" <br/><br/>");
		
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		/*String name = request.getParameter("name");
		String email = request.getParameter("email");
		String age = request.getParameter("age");*/
		
		/*String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String age = request.getParameter("txtAge");*/
		
		HttpSession session = request.getSession();
		
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		int age = (Integer)session.getAttribute("keyAge");
		
		//session.invalidate();
		
		out.print(name+" - "+email+" - "+age);
	}

}
