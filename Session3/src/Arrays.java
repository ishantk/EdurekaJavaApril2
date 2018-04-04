
public class Arrays {

	public static void main(String[] args) {
		
		int demArizona = 126; // Single Value Container
		int demFlorida = 32;
		int demTexas = 230;
		//....
		//..
		//....
		
		// Arrays
		
		// Implicit Way
		int[] demVotes = {126,32,230,21,200}; // Multi Value Container | Array
		
		// Explicit Way
		//int[] demVotes = new int[]{126,32,230,21,200};
		
		System.out.println("demArizona is: "+demArizona);
		System.out.println("demVotes is: "+demVotes);
		// demArizon is a SVC which is holding Value
		// demVotes is a MVC which is holding address value so we can call demVotes as a reference variable
		
		// Implicit Way
		//int repVotes[] = {152,85,121,215,13}; // Multi Value Container | Array
		
		// Explicit Way
		int repVotes[] = new int[]{152,85,121,215,13}; // Multi Value Container | Array
		
		repVotes[1] = 125;
		
		System.out.println("repVotes is: "+repVotes);
		
		// Read Data from Array
		System.out.println(demVotes[0]);
		System.out.println(repVotes[0]);
		
		System.out.println(demVotes.length);
		System.out.println(repVotes.length);
		
		
		int demCount=0,repCount=0;
		
		// Read entire array
		// 1. For Loop
		
		System.out.println("===demVotes===");
		for(int i=0;i<demVotes.length;i++){
			System.out.print(demVotes[i]+"  ");
			demCount = demCount + demVotes[i];
		}
		
		System.out.println();
		
		System.out.println("===repVotes===");
		for(int i=0;i<repVotes.length;i++){
			System.out.print(repVotes[i]+"  ");
			repCount = repCount + repVotes[i];
		}
		
		System.out.println();
		
		if(demCount > repCount){
			System.out.println("Democratic Party Won. Total Votes "+demCount);
		}else{
			System.out.println("Republican Party Won. Total Votes "+repCount);
		}
		
		//2. Enhanced For Loop
		System.out.println("===demVotes===");
		for(int elm : demVotes){
			System.out.print(elm+"  ");
		}
		
		System.out.println();
		
		System.out.println("===repVotes===");
		for(int elm : repVotes){
			System.out.print(elm+"  ");
		}
		
		
		int[] arr1 = new int[5]; // Array of 5 integers
		// 1. Fixed Size
		// 2. homogeneous
		
		int size = 5;
		double[] arr2 = new double[size];
		
		// Write data in Array
		arr1[0] = 10;
		arr1[2] = 100;
		arr1[4] = 500;
		
		arr2[0] = 3.5;
		arr2[4] = 80.80;
		
		
		arr1[0] = 300;
		
		System.out.println();
		System.out.println("==============");
		for(double elm : arr2){
			System.out.print(elm+"  ");
		}
		
		char[] chArr1 = new char[5];
		//char[] chArr2 = new char[]{'H','e','l','l','o'};
		
		char ch1 = ' ';
		int i = 0;
		double d = 0.0;
		
		for(char ch : chArr1){
			System.out.println(ch+"  ");
		}
		
		//int[] popState = {12345,98767,12345,456223,7894,12345};
		
		int a = 10;
		int b = 20;
		
		int[] arr = {a,b,(a+b),(a-b)};

		// Empty Arrays
		int[] arr3 = new int[]{}; // size of 0 means no data
		//arr3[0] = 10;
		System.out.println("arr3 before is: "+arr3);
		
		arr3 = new int[5]; // Array Resizing - Arrays cannot be Resized
		System.out.println("arr3 after is: "+arr3);
		
		//System.out.println("arr1[5] is: "+arr1[5]);
		
		int[] arr4;
		arr4 = new int[5];
		
		int x = 10;
		int y = x;     // Value Copy
		
		int[] a1 = {10,20,30,40,50};
		int[] a2 = a1; // Reference Copy
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		
		System.out.println("a2[1] is: "+a2[1]);
		
		a2[3] = 100;
		System.out.println("a1[3] is: "+a1[3]);
		
	}

}
