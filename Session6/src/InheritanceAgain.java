
class Father{
	
	// Attributes | Non Static -> belongs to object
	String fname;
	String lname;
	int money;
	
	// static -> belongs to class
	static String homeAddress;
	
	Father(){
		fname = "John";
		lname = "Watson";
		money = 10000;
		System.out.println("Father Object Constructed..");
	}
	
	Father(String fn, String ln, int mn){
		fname = fn;
		lname = ln;
		money = mn;
		System.out.println("Father Object Constructed..");
	}
	
	Father(String fn, int mn){
		fname = fn;
		money = mn;
		System.out.println("Father Object Constructed..");
	}
	
	void showDetails(){
		System.out.println(fname+" "+lname+" has \u20b9"+money);
	}
	
	static void showHomeDetails(){
		System.out.println("Home Address: "+homeAddress);
	}
	
}

class Son extends Father{
	
	Son(){
		super("Jim",70000);
		//super("Jim","JJ",70000);
		//super();
		System.out.println("Son Object Construcetd..");
	}
	
}


public class InheritanceAgain {

	public static void main(String[] args) {
		
		//Father fRef = new Father("George","G",50000);
		//fRef.showDetails();
		
		Son sRef = new Son();
		sRef.fname = "Harry";
		sRef.showDetails();
		
		Son.homeAddress = "Redwood Shores";
		Son.showHomeDetails();

	}

}
