package co.edureka;

// private, default, protected, public

class Parent{
	public void purchaseBike(){
		System.out.println("Lets buy Bajaj Pulsar");
	}
}

class Child extends Parent{
	public void purchaseBike(){
		System.out.println("Lets buy Royal Enfield");
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.purchaseBike();

	}

}
