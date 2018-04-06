
public class StringMethods {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE. i.e. they cannot be changed
		// Any operation on Strings will result in a new String.
		
		String str1 = "This is Awesome";
		String str2 = new String(" Welcome to Java");

		String str3 = str1 + str2;  //str1.concat(str2); // appending str2 into str1
		
		String str4 = str2.toUpperCase();
		
		System.out.println("str1 is: "+str1); // No Appending happened
 		System.out.println("str2 is: "+str2);
 		System.out.println("str3 is: "+str3);
 		System.out.println("str4 is: "+str4);
 		
 		String str5 = "John, Jennie, Jim, Jack, Joe";
 		
 		String[] names = str5.split(",");
		for(String nm : names){
			System.out.println(nm.trim());
		}
		
		int len = str5.length();
		System.out.println("Length of str5 is: "+len);
		
		String str6 = str5.substring(5);
		System.out.println("str6 is: "+str6);
		
		String str7 = str5.substring(6,10); // 6 inclusive and 10 not inclusive >=6 <10
		System.out.println("str7 is: "+str7);
		
		int idx = str5.indexOf('J');
		idx = str5.lastIndexOf('J');
		
		idx = str5.indexOf("Jennie");
		
		System.out.println("idx is: "+idx);
		
		if(str5.contains("Jennie")){
			System.out.println("Jennie is in the names");
		}
		
		String str8 = str5.replace('J', 'K');
		System.out.println("str8 is: "+str8);
		
		char[] chArr = str8.toCharArray();
		for(char ch : chArr){
			System.out.print(ch+" - ");
		}
	
		System.out.println();
		
		byte[] arr = str8.getBytes();
		for(byte b : arr){
			System.out.print(b+" - ");
		}
		
		System.out.println();
		
		String str9 = "John is Well and John is Jennies Son";
		int jIdx = str9.lastIndexOf("John");
		System.out.println("jIdx is: "+jIdx);
		
		String str10 = str9.replace("John", "Jack");
		System.out.println("str10 is: "+str10);
	}

}
