package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

   
	public void destroy() {
		System.out.println("==Filter Destroy==");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// Pre-Processing
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("==Filter PreProcessing==<br/>");
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(!email.isEmpty() && !password.isEmpty()){
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}else{
			out.print("Please Enter Correct Details...<br/>");
		}
		
		out.print("==Filter PostProcessing==<br/>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("==Filter Init==");
	}

}
