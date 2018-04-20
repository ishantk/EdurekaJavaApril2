package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/Register", "/Resgistration.do" })
public class RegisterServlet extends HttpServlet {
	
	User user;
	
	// Acting as Constructor
	public void init(ServletConfig config) throws ServletException {
		System.out.println("==init executed==");
	}


	// Acting as Destructor
	public void destroy() {
		System.out.println("==destroy executed==");
	}


	// For Request coming from HTML Web Page (i.e. by user/client)
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==service executed==");
		
		user = new User();
		
		// Setting the data in Model
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(user);
		
		JDBCHelper helper = new JDBCHelper(); // 1. Load the Driver
		helper.openConnection(); // Connection Created
		int i = helper.registerUser(user); // SQL Executed
		helper.closeConnection(); // Connection Closed
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(i>0){
			out.print("<html><body>");
			out.print("User Registered Successfully");
			
			// SESSION TRACKING
			// 2. URL RE-WRITING
			//String url = "Home?name="+user.name+"&email="+user.email+"&age=30";
			//out.print("<a href='"+url+"'> Enter Home </a>");
			
			// SESSION TRACKING
			// 3. Hidden Form Fields
			
			/*String form = "<form action='Home' method='post'>"
						+ "<input type='hidden' name='txtName' value='"+user.name+"'/>"
						+ "<input type='hidden' name='txtEmail' value='"+user.email+"'/>"
						+ "<input type='hidden' name='txtAge' value='30'/>"
						+ "<input type='submit' value='Enter Home'/>"
						+ "</form>";
					
			
			out.print(form);*/
			
			// SESSION TRACKING
			// 4. HttpSession
			
			HttpSession session = request.getSession();
			session.setAttribute("keyName", user.name);
			session.setAttribute("keyEmail", user.email);
			session.setAttribute("keyAge", 30);
			
			out.print("<a href='Home'> Enter Home </a>");
			out.print("</body></html>");
			
			// SESSION TRACKING
			// 1. COOKIES
			
			/*Cookie ck1 = new Cookie("keyName", user.name);
			Cookie ck2 = new Cookie("keyEmail", user.email);
			Cookie ck3 = new Cookie("keyAge", String.valueOf(30));
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);
			
			*/
			
		
			
			
			
		}else{
			out.print("Error while Registering User");
		}
		
	}

}
