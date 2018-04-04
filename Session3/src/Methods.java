
public class Methods {

	// non-static methods
	void addNums(int a, int b){
		int c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
	
	int mulNums(int a, int b){
		int c = a*b;
		return c;
	}
	
	// static methods
	static void addNumsAgain(int a, int b){
		int c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
	
	static int mulNumsAgain(int a, int b){
		int c = a*b;
		return c;
	}
	
	public static void main(String[] args) {
		
		// Execution of Methods
		
		// 1. For non-static methods, create an Object
		Methods m = new Methods(); // Object Construction Statement
		
		m.addNums(10, 20);
		m.addNums(30, 50);
		m.addNums(100, 200);
		
		int result = m.mulNums(10, 20);
		System.out.println("Result is: "+result);
		System.out.println("multiplication of 30 and 40 is : "+m.mulNums(30, 40));
		
		System.out.println("========================================");
		
		//2. static methods, use class name
		Methods.addNumsAgain(10, 20);
		result = Methods.mulNumsAgain(50, 60);
		System.out.println("Result is: "+result);
		
		
	}

}
