package co.edureka.threads;



public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 10; // Primitive Type
		Integer iRef = new Integer(i); // Reference Type | BOXING
		//iRef is in stack and Integer Object gets created in the Heap with 10 as attribute value
		
		char ch = 'A';
		Character chRef = new Character(ch); // BOXING
		
		float f = 2.2f;
		Float fRef = new Float(f); // BOXING
		
		int j = iRef.intValue(); 		// UNBOXING
		char ch1 = chRef.charValue(); 	// UNBOXING
		float g = fRef.floatValue();	// UNBOXING
		
		String str1 = "Hello"; // Interned
		String str2 = new String("Hello"); // OBJECT (BOX)
		
		// Implict Way Below:
		
		Integer iRef1 = i;		 // AUTOBOXING -> Integer iRef1 = new Integer(i);
		Character chRef1 = ch;   // AUTOBOXING -> Character chRef1 = new Character(ch);
		Float fRef1 = f;         // AUTOBOXING -> Float fRef1 = new Float(f); 
		
		int i1 = iRef1;  		 // AUTOUNBOXING -> int i1 = iRef1.intValue();
		//....
	}

}
