
public class DataTypes {

	// main is executed by the JVM when you  run the program
	public static void main(String[] args) {
		
		byte age = 8; // write data in storage container
		System.out.println("age is: "+age); // read data from storage container
		
		age = 12;
		System.out.println("age is: "+age); 
		
		age = (byte)256;
		System.out.println("age is: "+age);
		
		short s = (short)100000;
		
		int i = 100000;

		float f = 4.4f; // 32 bit storage container
		double d = 4.4; // 64 bit storage container
		
		double num = 10; // 10.0;
		
		char ch1 = 'A';
		char ch2 = '$';
		char ch3 = '1';
		char ch4 = 67; // ASCII Value
		char ch5 = '\u20b9'; // Unicode Value
		char ch6 = '\u0905';
		
		System.out.println("ch1 is: "+ch1);
		System.out.println("ch4 is: "+ch4);
		System.out.println("ch5 is: "+ch5);
		System.out.println("ch6 is: "+ch6);
		
		boolean bool = true;
		bool = false;
		
		boolean gpsStatus = false; // disabled
		boolean internetStatus = true; // enabled
		
		
		int iVar = 10;
		
		// int  -> data type
		// iVar -> storage container i.e. a Single Value Storage Container whose value can be modified anytime. (Variable)
		// 10   -> data or literal 
		
		//int j = 10,20; // error | More than 1 value  not allowed.
	}

}
