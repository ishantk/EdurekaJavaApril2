package co.edureka;

public class ExcDemo {

	public static void main(String[] args) {
		
		System.out.println("App Started..");
		
		int[] arr = {10,20,30,40,50};
		int a = 10, b = 0, c = 0;
		
		try{
			System.out.println("arr[20] is: "+arr[20]); // if exception comes here at line 13, below statements in try block will not execute
			
			// Nested try catch
			/*try{
				c = a/b;
			}catch(ArithmeticException ae){
				System.out.println("Exception occurred "+ae);
			}*/
			
			c = a/b;
			System.out.println("c is: "+c);
			
			
			
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			//System.out.println("Some Exception");
			System.out.println("Some Exception "+aRef);
			//aRef.printStackTrace();
		}catch(ArithmeticException aRef){ // additional catch
			//System.out.println("Some Exception");
			System.out.println("Some Exception "+aRef);
			//aRef.printStackTrace();
		}*/
		catch(Exception e){ // RTP
			System.out.println("Some Exception "+e);
		}finally{
			System.out.println("This is Awesome !!");
		}
		
		
		/*try{
			c = a/b;
		}catch(ArithmeticException aeRef){
			System.out.println("Some Exception: "+aeRef);
		}
		System.out.println("c is: "+c);*/
		
		
		System.out.println("App Finished..");
	}

}
