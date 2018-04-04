
public class IfElse {

	public static void main(String[] args) {
		
		boolean isInternetEnabled = true;
		boolean isGPSEnabled = false;
		
		if(isInternetEnabled){
			if(isGPSEnabled){
				System.out.println("You can search on google maps");
			}else{
				System.out.println("Please Connect to the GPS");
			}
		}else{
			System.out.println("Please Connect to the Internet");
		}
		
		int a = 100;
		int b = 20;
		int c = 300;
		
		if(a>b){
			if(a>c){
				System.out.println("a is greatest "+a);
			}else{
				System.out.println("c is greatest "+c);
			}
		}else{
			System.out.println("b is greatest "+b);
		}
		
		/*
		 * if else
		 * if(){
		 * 
		 * }else{
		 * 
		 * }
		 * 
		 * Nested if else
		 * if(){
		 * 	if(){
		 * 
		 * 	}else{
		 * 
		 *  }
		 * }else{
		 * 	if(){
		 * 
		 * 	}else{
		 * 
		 *  }
		 * }
		 */
		
		
		// Ladder if/else
		int ph = 60;
		int ch = 60;
		int mt = 80;
		
		int avg = (ph+ch+mt)/3;
		
		if(avg >= 80){
			System.out.println("Grade A is awarded");
		}else if(avg>=70 && avg<80){
			System.out.println("Grade B is awarded");
		}else if(avg>=60 && avg<70){
			System.out.println("Grade C is awarded");
		}else if(avg>=50 && avg<60){
			System.out.println("Grade D is awarded");
		}else if(avg>=40 && avg<50){
			System.out.println("Grade E is awarded");
		}else{
			System.out.println("Grade F is awarded");
		}

		if(isGPSEnabled){
			System.out.println("GPS is ON");
			System.out.println("Search Address on Google Maps");
		}
		else{
			System.out.println("GPS is OFF");
		}
		
	}

}
