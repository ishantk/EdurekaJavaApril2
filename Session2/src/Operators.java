
public class Operators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int c = a + b; // + is an operator which adds the data 
		System.out.println("c is: "+c);
		
		a = 9;
		b = 2;
		
		c = a % b; // Mod gives us remainder
		System.out.println("c is: "+c);
		
		c = 100;
		//c++;  //c = c + 1;	
		++c;    //c = c + 1;
		System.out.println("c is: "+c);
		
		a = 500;
		b = 300;
		c = 200;
		
		System.out.println("a != b : "+ (a != b) );
		System.out.println("a > b && a > c: "+ ( (a>b) && (a>c) ) );
		
		a = 10;
		//a+=5; // a = a+5;
		//a%=3; // a = a % 3;
		//a =+ 5; // not be evaluated as expression a = a + 5;
		System.out.println("a is: "+a);
		
		
		a = 10;
		int x = a++;
		
		System.out.println("x is: "+x); // 10
		System.out.println("a is: "+a); // 11
		
		System.out.println("--------------");
		
		a = 10;
		int y = ++a;

		System.out.println("y is: "+y); // 11
		System.out.println("a is: "+a); // 11
		
				
	}

}
