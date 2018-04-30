package co.edureka.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path; // JAX-RS
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.servlet.ServletContainer;

@Path("/hello")
public class HelloService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlainResponse(){
		String res = "Hello, This is a plain Text !!";
		return res;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLResponse(){
		String res = "<html><body><b>This is a hello from HTML</b></body></html>";
		return res;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String getXMLResponse(){
		String res = "<hello>This is a hello from XML</hello>";
		return res;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getJSONResponse(){
		String res = "{"
						+ "price: 100 INR, "
						+ "name: Objective C, "
						+ "author: Steve Jobs"
					+ "}";
		return res;
	}
	
}
