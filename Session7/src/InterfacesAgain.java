interface Inf1{
	void show();
}

interface Inf2{
	void fun();
}

interface Inf3 extends Inf1,Inf2{ // Multiple Inheritance (Inf to Inf) is Supported here in case of Interfaces
	int i = 100; // public static final int i = 100;
}

// Multiple Implementation is Supported in Java, not Multiple Extension
class CA implements Inf3{//Inf1,Inf2{
	public void show(){
		System.out.println("This is show in CA");
	}
	
	public void fun(){
		System.out.println("This is fun in CA");
	}
}

class CB implements Inf3{//Inf1,Inf2{
	public void show(){
		System.out.println("This is show in CB");
	}
	
	public void fun(){
		System.out.println("This is fun in CB");
	}
	
	void hello(){
		System.out.println("This is hello of CB");
	}
}

public class InterfacesAgain {

	public static void main(String[] args) {
	
		//Inf1 i1 = new CA();
		//i1.show();
		//i1.fun(); // error
		
		//Inf2 i2 = new CA();
		//i2.fun();
		//i2.show(); // err
		
		Inf3 i3 = new CA();
		i3.show();
		i3.fun();
		
		
		System.out.println("*****************");
		
		i3 = new CB();
		i3.show();
		i3.fun();
		
		//i3.hello(); error
		
		/*CB cb = new CB();
		cb.show();
		cb.fun();
		cb.hello();*/
		
		System.out.println("********************");
		
		CB cb = (CB)i3; // Downcasting
		cb.show();
		cb.hello();
		cb.fun();
		
		//Inf3.i = 1000; //err
		System.out.println("i is: "+Inf3.i);
	}

}
