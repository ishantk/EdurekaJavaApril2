
public class MutableStrings {

	public static void main(String[] args) {
		
		// IMMUTABLE
		String str = new String("Hello");
		
		// MUTABLE
		StringBuffer buffer = new StringBuffer("Hello");		// THREAD-SAFE
		StringBuilder builder = new StringBuilder("Hello");     // NOT THREAD-SAFE
		
		//StringBuffer buffer1 "Hello"; //error
		//StringBuilder builder1 "Hello"; //error
		
		str.concat(", Welcome to Edureka !!");
		buffer.append(", Welcome to Edureka");
		builder.append(", Welcome to Edureka");
		
		System.out.println("str is: "+str);
		System.out.println("buffer is: "+buffer);
		System.out.println("builder is: "+builder);

	}

}
