
public class Strings {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		// String is a Data Type : Reference Type
		// str1, str2, str3 and str4 shall hold the addresses and hence are the reference variables
		// but the magic is, if you print reference variables, they will show the value and not address
		
		// Interned Strings
		String str1 = "HeLlo"; // Literal Hello is a Constant and gets created in ConstantPool
		String str2 = "HeLlo";
		
		// String Objects
		String str3 = new String("Hello");
		String str4 = new String("Hello");

		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		// == -> Comparing references
		
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		if(str1 == str3){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}
		
		//if(str1.equals(str3)){
		if(str1.equalsIgnoreCase(str3)){
			System.out.println("str1 equals str3");
		}else{
			System.out.println("str1 not equals str3");
		}
		
		//if(str1.compareTo(str3) == 0){
		if(str1.compareToIgnoreCase(str3) == 0){
			System.out.println("str1 equals str3");
		}else{
			System.out.println("str1 not equals str3");
		}
		
	}

}
