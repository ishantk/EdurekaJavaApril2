
public class Loops {

	public static void main(String[] args) {
		
		int num = 5;
		int i = 1;
		
		/*System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i=i+1; // 2
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i=i+1; // 3
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i=i+1; // 3
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i=i+1; // 3
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i=i+1; // 3
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i=i+1; // 3
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i=i+1; // 3
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i=i+1; // 3
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // i=i+1; // 10
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		System.out.println("=====while demo=====");
		
		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++; 
		}
		
		System.out.println("=====do while demo=====");
		
		num = 7;
		i = 1;
		
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++; 
		}while(i<=10);
		
		/*char ch = 'y';
		do{
			// task
			
			// input asked at the end...
			
			// would you like to transact again (y/n)
			
		}while(ch=='y');*/
	
		System.out.println("=====for demo=====");
		for(num = 13,i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		
		for(int j=1;j<=5;j++){
			
		}

	}

}
