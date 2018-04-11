package co.edureka.packtwo;

//import co.edureka.packone.*; // Import All, not a great choice.
import co.edureka.packone.One;
import co.edureka.packone.Parent;

import static co.edureka.packone.One.PI;


//import co.edureka.packone.Two; // error, since Two is default it cannot be accessed outside the package

// Inheritance across packages

// private and default not inherited outside package
// Only public and protected is inherited
// protected once, inherited acts as private

class Child extends Parent{
	
	void show(){
		// Inherited and act as private. So indirect way of accessing it...
		protShow(); // Nesting of functions. Executing a function from a function
		
		// Not Inherited....
		//pvtShow();
		//defShow();
	}
}

public class Exe {

	public static void main(String[] args) {
		
		//One o = new One();
		
		//o.pvtShow(); // error -> private cannot be accessed outside the boundary
		
		// Limited within the package
		//o.defShow(); // error
		//o.protShow(); // error
		
		//o.pubShow();
		
		Child ch = new Child();
		ch.pubShow();
		//ch.protShow(); // error
		ch.show();
		
		System.out.println("PI is: "+PI);
	}

}
