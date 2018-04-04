
public class MDArrays {

	public static void main(String[] args) {
		
		int[] a1 = {10,20,30,40,50};
		System.out.println("a1 is: "+a1);
		System.out.println("a1 length is: "+a1.length);
		
		// Multi Dimensional Array. Which is NOT A MATRIX !!
		// Multi Dimensional Array is Array of Arrays !!
		int[][] a2 = {
						{10,20,30}, 		//0
						{40,50}, 			//1
						{20,30,40,50}, 		//2
						{10}, 				//3
						{10,20,30,40,50} 	//4
					 };

		System.out.println("a2 is: "+a2);
		System.out.println("a2 length is: "+a2.length);
		
		System.out.println(a2[0][0]); // 10
		System.out.println(a2[4][4]); // 50
		
		// a2 is a reference variable
		for(int i=0;i<a2.length;i++){
			System.out.println(a2[i]+" and length: "+a2[i].length);
		}
		
		// Read all elements from Array
		for(int i=0;i<a2.length;i++){
			for(int j=0;j<a2[i].length;j++){
				System.out.print(a2[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("====Enhanced For Loop====");
		
		for(int[] a : a2){
			for(int elm : a){
				System.out.print(elm+"  ");
			}
			System.out.println();
		}
		
		
		int[][] popCountry ={
								{10023,12431,23454,1233456},
								{10023,12431,23454,12334,1234,53,5677,1341},
								{10023,12431,23454},
							};
		
		int[][]a3 = new int[5][3]; // 5 1-D Arrays, with each array having 3 elements
		
		int[][]a4 = new int[5][]; // 5 1-D Arrays
		a4[0] = new int[1];
		a4[3] = new int[10];
		a4[4] = new int[100];
		
		a4[0][0] = 100;
		a4[4][1] = 200;
		
		// Array of Array of Arrays
		int[][][] popWorld ={
								{
									{10023,12431,23454,1233456},
									{10023,12431,23454,12334,1234,53,5677,1341},
									{10023,12431,23454},
								},
								{
									{10023,12431,23454,1233456},
									{10023,12431,23454,12334,1234,53,5677,1341},
									{10023,12431,23454},
									{10023,12431,23454}
								}
							};
		
		System.out.println("popWord is: "+popWorld);
		System.out.println("popWord length is: "+popWorld.length);
		
		System.out.println("popWord[0] is: "+popWorld[0]);
		System.out.println("popWord[0] length is: "+popWorld[0].length);
		
		System.out.println("popWord[0][0] is: "+popWorld[0][0]);
		System.out.println("popWord[0][0] length is: "+popWorld[0][0].length);
		
		System.out.println("popWord[0][0][0] is: "+popWorld[0][0][0]);
		
		int[][] arr = new int[2][2];
		for(int[] ar : arr){
			System.out.println("-----------------");
			System.out.println(ar+" - "+ar.length);
			System.out.println("-----------------");
			for(int e : ar){
				System.out.print(e+"  ");
			}
			System.out.println();
			System.out.println("-----------------");
		}
		
	}

}
