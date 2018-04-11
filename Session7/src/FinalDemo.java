final class A{ // final class cannot be extended
	final void show(){ // final method cannot be overrided
		
	}
}

class B{ //extends A{ 
	/*void show(){
		
	}*/
}

// error
/*final interface Inf10{
	void show();
}*/

abstract class P{
	
}

abstract class Q extends P{
	
}


public class FinalDemo {

	public static void main(String[] args) {
		
		// Variable
		int i = 10;
		i = 100;
		
		// final variable is a constant
		final int j = 10;
		//j = 100; // error

	}

}
