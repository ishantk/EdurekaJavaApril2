abstract class Cab{
	
	// Executed when the object is created in the heap. This is the first execution in an object
	Cab(){
		System.out.println("Cab Object Constructed..");
	}
	
	// Its a kind of rule created by Parent. Children must defined it...
	abstract void bookCab();
	
	// All abstract methods must be defined by children
	//abstract void processPayment();
	
	void fun(){
		System.out.println("This is fun");
	}
}

class MiniCab extends Cab{
	MiniCab(){
		System.out.println("MiniCab Object COnstructed..");
	}
	
	void bookCab(){
		//...
		//...
		System.out.println("Mini Cab Booked....");
	}
}

class LuxuryCab extends Cab{
	LuxuryCab(){
		System.out.println("LuxuryCab Object COnstructed..");
	}
	
	void bookCab(){
		//...
		//...
		System.out.println("Luxury Cab Booked....");
	}
}


public class AbsDemo {

	public static void main(String[] args) {
		

		Cab cRef;
		//cRef = new Cab(); // error -> Abstract class cannot be instantiated...
		//cRef.bookCab();
		
		cRef = new MiniCab();
		cRef.bookCab();
		
		System.out.println("*************************");
		
		cRef = new LuxuryCab();
		cRef.bookCab();
		
		cRef.fun();
		
	}

}
