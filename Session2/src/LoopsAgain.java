
public class LoopsAgain {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
		
			if(i>5){
				System.out.println("Breaking the Loop");
				break;
			}
			
			System.out.println("i is: "+i);
			
		}
		System.out.println("===========================");
		
		for(int i=1;i<=10;i++){
			
			if(i<5){
				System.out.println("Continuing the Loop");
				continue;
			}
			
			System.out.println("i is: "+i);
		}
		
		/*while(true){
			
		}*/
		
		System.out.println("===Nesting of Loops===");
		
		// Nesting of Loops
		
		anyname:
		for(int i=1;i<=3;i++){ // 1 2 and 3 values of i
			System.out.println("i is: "+i);
			
			inner:
			for(int j=1;j<=5;j++){ // 1 2 3 4 and 5 values of j
				
				/*if(j>2){
					break outer;
				}*/
				
				if(j<2){
					continue anyname;
				}
				
				System.out.print(j+"  "); // print -> print in the same line
			}
			
			System.out.println(); // println -> print in a new line
			
			System.out.println("-----");
		}

	}

}
