class Login{
	
	Login(){
		System.out.println("Login Object Constructed..");
	}
	
	void loginUser(){
		System.out.println("Login User with Email and Password");
	}
}

class FaceBookLogin extends Login{
	
	FaceBookLogin(){
		System.out.println("FaceBookLogin Object Constructed..");
	}
	
	void loginUser(){
		System.out.println("Login User with FaceBook");
	}
	
	void browseFacebook(){
		System.out.println("Facebook Browsing Started...");
	}
	
}

class GoogleLogin extends Login{
	
	GoogleLogin(){
		System.out.println("GoogleLogin Object Constructed..");
	}
	
	void loginUser(){
		System.out.println("Login User with Google");
	}
	
	void browseGmail(){
		System.out.println("GMail Brwsing Started...");
	}
	
}


public class RTP {

	public static void main(String[] args) {
		
		// Direct Object Construction
		/*Login lRef;
		lRef = new Login();
		lRef.loginUser();
		
		System.out.println("--------------------");
		
		FaceBookLogin fRef;
		fRef = new FaceBookLogin();
		fRef.loginUser();*/

		Login lRef; // Reference Variable of Parent
		
		lRef = new FaceBookLogin(); // lRef can point to the Object of Child
		lRef.loginUser(); // Due to Overriding, Child's Def will be executed
		
		//lRef.browseFacebook(); // error, Parent's Ref Variable can call only those methods which are redefined in the child
		
		System.out.println("--------------------"); 
		
		
		lRef = new GoogleLogin();
		lRef.loginUser();
	}

}
