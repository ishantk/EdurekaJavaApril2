package co.edureka;

import java.io.IOException;

// CHECKED - User Defined
class MyBankingException extends Exception{
	MyBankingException(String message){
		super(message);
	}
}

// UNCHCECKED - User Defined
class YourBankingException extends RuntimeException{
	YourBankingException(String message){
		super(message);
	}
}

class Banking{
	
	int balance = 10000; 
	int minBal = 3000;
	int attempts = 0;
	
	void withdraw(int amt){
		
		balance = balance - amt;
		
		if(balance<=3000){
			balance = balance + amt;
			System.out.println("Withdrawl Failure !! Balance is LOW: \u20b9"+balance);
			
			attempts++;
			
			if(attempts == 3){
				// UNCHECKED EXCEPTION
				ArithmeticException ae = new ArithmeticException("Illegal Attempts: "+attempts);
				throw ae;
			}
			
		}else{
			System.out.println("Withdrawl Success !! New Balance is: \u20b9"+balance);
		}
		
		
	}
	
	void withdrawAgain(int amt) throws MyBankingException{//IOException{
		
		balance = balance - amt;
		
		if(balance<=3000){
			balance = balance + amt;
			System.out.println("Withdrawl Failure !! Balance is LOW: \u20b9"+balance);
			
			attempts++;
			
			if(attempts == 3){
				// CHECKED EXCEPTION
				//IOException io = new IOException("Illegal Attempts: "+attempts);
				//throw io;
				MyBankingException mb = new MyBankingException("Illegal Attempts: "+attempts);
				throw mb;
			}
			
		}else{
			System.out.println("Withdrawl Success !! New Balance is: \u20b9"+balance);
		}
		
		
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		
		System.out.println("Banking Started...");
		
		Banking bRef = new Banking();
		
		/*for(int i=1;i<=100;i++){
			bRef.withdraw(3000);
		}*/
		
		try {
			for(int i=1;i<=100;i++){
				bRef.withdrawAgain(3000);
			}
		}catch(MyBankingException mb){
			System.out.println("Some Exception :"+mb);
		} /*catch (IOException e) {
			System.out.println("Some Exception :"+e);
		}*/
		
		System.out.println("Banking Finished...");
		
	}

}
