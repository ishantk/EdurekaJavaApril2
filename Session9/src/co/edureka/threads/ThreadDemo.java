package co.edureka.threads;

class MyThread extends Thread{
	
	public void run(){
		State state = Thread.currentThread().getState();
		System.out.println("This is run method "+state);
		for(int i=1;i<=10;i++){
			System.out.println("==MyTherad=="+i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread mRef = new MyThread();
		System.out.println("State is: "+mRef.getState());
		mRef.start(); // start internally calls the run method. its state management due to which we call start and not run directly.
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("State is: "+mRef.getState());
	}

}
