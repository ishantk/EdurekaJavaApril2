package co.edureka;

import java.util.Date;

// Web Service
public class Conversion {

	// Web Methods
	public int feetToInches(int feet){
		int inches = feet * 12;
		return inches;
	}
	
	
	public int mtrsToCms(int mtrs){
		int cms = mtrs * 100;
		return cms;
	}
	
	
	public String sayHello(String name){
		String str = "Hello, "+name+"\nIts"+new Date();
		return str;
	}
	
	public String register(String name, String email, String password){

		// JDBC operation...
	
		String str = "Hello, "+name+"\nRegistration is Finsihed! Please confirm you email "+email;
		return str;
		
	}
	
	
}
