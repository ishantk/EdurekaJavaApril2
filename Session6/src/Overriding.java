class Parent{
	
	String bike;
	
	static String car = "Maruti Swift";
	
	Parent(){
		bike = "Bajaj Pulsar";
		System.out.println("Parent Object Constructed..");
	}
	
	void purchaseBike(){
		System.out.println("Lets buy "+bike);
	}
	
	static void purchaseCar(){
		System.out.println("Lets buy "+car);
	}
	
}

class Child extends Parent{
	
	Child(){
		bike = "Royal Enfield";
		System.out.println("Child Object Constructed..");
	}
	
	// Overriding in Object Level
	void purchaseBike(){
		super.purchaseBike(); // super as ref variable can execute the method of parent in the child object
		System.out.println("I wish to buy "+bike);
	}
	
	// Hiding in Class Level
	static void purchaseCar(){
		Parent.purchaseCar();
		System.out.println("I wish to buy "+car);
	}
	
}

public class Overriding {

	public static void main(String[] args) {
		
		Child cRef = new Child();
		cRef.purchaseBike();
		
		Child.car = "Honda City";
		Child.purchaseCar();

	}

}
