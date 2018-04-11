package co.edureka.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Started...");
		

		int[] arr = {10,20,30,40,50};
		
		try{
			System.out.println("arr[30] is: "+arr[30]);
		}catch(ArrayIndexOutOfBoundsException eRef){
			//System.out.println("Some Exception Occurred !!"); // For the User
			//System.out.println("Exception is: "+eRef);        // For the User
			eRef.printStackTrace(); // For Developer to Debug
		}
		
		int a = 10;
		int b = 3;
		int c = a/b;
		System.out.println("c is: "+c);
		
		//...
		
		System.out.println("Main Finished...");
	}

}
