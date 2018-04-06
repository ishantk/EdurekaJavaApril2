
public class Overloading {

	
	/*
	 * Overloading of a Method -> Use the same name, different inputs with different definition
	 * Rules to Overload
	 * 1. Function Name is Same
	 * 2. Inputs should be Unique
	 * 	2.1. Number of Inputs | Increasing/Decreasing
	 * 	2.2 Type of Inputs
	 * 	2.3. Sequence of Inputs
	 * 3.Return Type has no role to play
	 */
	
	void area(int side){
		int a = side * side;
		System.out.println("Area of square is: "+a);
	}
	
	// Return Type has no Role
	/*int area(int side){
		int a = side * side;
		System.out.println("Area of square is: "+a);
		return a;
	}*/
	
	void area(int l, int b){
		int a = l * b;
		System.out.println("Area of rectangle is: "+a);
	}
	
	void area(double side){
		double a = side * side;
		System.out.println("Area of square is: "+a);
	}
	
	void area(double l, double b){
		double a = l * b;
		System.out.println("Area of rectangle is: "+a);
	}
	
	void area(int l, double b){
		double a = l * b;
		System.out.println("Area of rectangle is: "+a);
	}
	
	void area(double l, int b){
		double a = l * b;
		System.out.println("Area of rectangle is: "+a);
	}
	
	void loginUser(long phoneNumber){
		//.....
	}
	
	void loginUser(String email, String password){
		//....
	}
	
	
	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		o.area(10);
		o.area(12,15);
		
		o.area(12,2.2);
		
		o.area(2.2);
		o.area(2.3, 3.1);
		
		o.area(10,2.2);
		o.area(3.3,12);

	}

}
