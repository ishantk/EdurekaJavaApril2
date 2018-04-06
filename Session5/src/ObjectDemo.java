// Textual Representation of an Object
class User{
	
	// Attributes of an Object, Not of Class. Attributes are the Property of Object
	String name;
	private int age; // Data Hiding
	char gender;
	String email;
	private String address;
	
	
	// Special Method | Constructor
	// Default Constructor
	
	// If you dont create a constructor in your class, 
	//compiler will append such a constructor in class and will use it to give default or initial values to attributes of an object
	/*User(){
		name = null;
		age = 0;
		gender = ' ';
		email = null;
		address = null;
	}*/
	
	// If we create constructor compiler will not create one
	User(){
		name = "NA";
		age = 0;
		gender = 'U';
		email = "no email";
		address = "no address";
	}
	
	// Parameterized Constructor
	User(String n, int a, char g, String e, String ad){
		name = n;
		age = a;
		gender = g;
		email = e;
		address = ad;
	}
	
	User(String n, int a){
		name = n;
		age = a;
	}
	
	// Methods of an Object, Not of Class. Methods are the Property of Object
	
	// Setter Method, which writes the data in attribute of an object
	void setAge(int a){
		age = a;
	}
	
	void setAddress(String adrs){
		address = adrs;
	}
	
	// Getter Method, which reads the data of attribute of an object
	int getAge(){
		return age;
	}
	
	String getAddress(){
		return address;
	}
	
	// Business Method : Logic
	void showUserDetails(){
		if(age>18){
			System.out.println(name+" is an Adult with "+age+" years old");
		}else{
			System.out.println(name+" is not an Adult with "+age+" years old");
		}
	}
	
	void showUser(){
		System.out.println(name+" is "+age+" years old and lives in "+address+". You can email at "+email);
	}
}


public class ObjectDemo {

	public static void main(String[] args) {

		// Object Construction Statement
		
		// uRef1 is a Reference Variable, not an Object
		// new operator will create the Object dynamically i.e. at Run Time in the Heap
		
		User uRef1 = new User();
		User uRef2 = new User();
		
		User uRef3 = uRef1; // Reference Copy
		
		User uRef4 = new User();
		User uRef5 = new User("Fionna",19,'F',"fionna@example.com","Country Homes Nroth");
		User uRef6 = new User("Jack",23);
		
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		
		// Write data in Object
		uRef3.name = "John Watson";
		//uRef1.age = 24; // age is private, you cannot access it directly.
		uRef1.setAge(24);
		uRef1.gender = 'M';
		uRef1.email = "john@example.com";
		//uRef1.address = "Redwood Shores";
		uRef1.setAddress("Redwood Shores");
		
		uRef2.name = "Jennie Watson";
		//uRef2.age = 22;
		uRef2.setAge(17);
		uRef2.gender = 'F';
		uRef2.email = "jennie@example.com";
		//uRef2.address = "Country Homes";
		uRef2.setAddress("Country Homes");
		
		// Read the data from Object
		//System.out.println(uRef1.name+" is "+uRef1.age+" years old and lives in "+uRef1.address);		
		//System.out.println(uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		
		//System.out.println(uRef1.name+" is "+uRef1.getAge()+" years old and lives in "+uRef1.getAddress());		
		//System.out.println(uRef2.name+" is "+uRef2.getAge()+" years old and lives in "+uRef2.getAddress());
		
		//uRef1.showUserDetails();
		//uRef2.showUserDetails();
		//uRef3.showUserDetails();
		
		uRef1.showUser();
		uRef2.showUser();
		uRef3.showUser();
		
		uRef4.showUser(); // we didnt write the data and we are able to see the default values
		uRef5.showUser();
		uRef6.showUser();
	

	}

}
