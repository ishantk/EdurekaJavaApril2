
import java.util.Scanner;

public class MethodDemo {

	
	void printArray(int[] arr){ // arr is a reference variable
		System.out.println("arr is: "+arr);
		System.out.println("----------");
		for(int num : arr){
			System.out.println(num);
		}
		System.out.println("----------");
	}
		
	void area(int side){
		int a = side*side;
		System.out.println("Area of Square with side "+side+" is "+a);
	} // execution is finished
	
	public static void main(String[] args) {
		//1.
		MethodDemo m = new MethodDemo();            // Object Construction Statement
		//2.
		Scanner scanner = new Scanner(System.in);   // Object Construction Statement
		//3.
		System.out.println("Enter the side of square");
		//4.
		int s = scanner.nextInt();
		//5.
		// Passing the Value
		m.area(s); // -> Control Transfers to the area method 
		
		//....
		
		int[] a1 = {10,20,30,40,50};
		int[] a2 = {12,23,12,45,768,12};
		
		// Passing a Reference
		System.out.println("a1 is: "+a1);
		m.printArray(a1); // a1 is a reference variable which is holding the address
		
		System.out.println("a2 is: "+a2);
		m.printArray(a2);
		
		//6.
		System.out.println("---Main Finished---");
	}

}
