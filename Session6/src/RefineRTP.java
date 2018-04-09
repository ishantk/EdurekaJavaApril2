/*class Shape{
	
	Shape(){
		System.out.println("Shape Object Constructed...");
	}
	
	void draw(){
		System.out.println("Drawing a Shape...");
	}
	
}*/

/*abstract class Shape{
	
	Shape(){
		System.out.println("Shape Object Constructed...");
	}
	
	abstract void draw();
	
}*/

// Shape as in Interface CANNOT HAVE OBJECTS....
interface Shape{
	
	/*Shape(){ // Constructors cannot be a part of interfaces
		System.out.println("Shape Object Constructed...");
	}*/
	
	void draw(); // public abstract void draw(); 
}

class Rectangle implements Shape{//extends Shape{
	
	Rectangle(){
		System.out.println("Rectangle Object Cnstructed...");
	}
	
	public void draw(){
		System.out.println("Drawing a Rectangle...");
	}
	
}

class Triangle implements Shape{//extends Shape{
	
	Triangle(){
		System.out.println("Triangle Object Constructed...");
	}
	
	public void draw(){
		System.out.println("Drawing a Triangle...");
	}
	
}

class Circle implements Shape{//extends Shape{
	
	Circle(){
		System.out.println("Circle Object Constructed...");
	}
	
	public void draw(){
		System.out.println("Drawing a Circle...");
	}
	
}

public class RefineRTP {

	public static void main(String[] args) {
		
		Shape sRef;
		
		sRef = new Rectangle();
		sRef.draw();
		
		System.out.println("*******************");
		
		sRef = new Triangle();
		sRef.draw();
		
		System.out.println("*******************");
		
		sRef = new Circle();
		sRef.draw();
		
		System.out.println("*******************");
		//sRef = new Shape(); err. Abstract Class Cannot Be Instantiated
		//sRef.draw();
		
	}

}
