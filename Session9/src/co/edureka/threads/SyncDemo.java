package co.edureka.threads;

// SingleTon Design Pattern. Only One Object per Class
class Table{
	
	private static Table tRef = new Table();
	
	private Table(){
		System.out.println("Table Object Constructed...");
	}
	
	public static Table getTable(){
		return tRef;
	}
	

	//synchronized public void printTable(int num){
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	void fun(){
		System.out.println("This is fun...");
	}
}

class MyTask extends Thread{
	
	Table t;
	
	MyTask(){
		t = Table.getTable();
		System.out.println("t in MyTask: "+t);
	}
	
	public void run(){
		
		synchronized (t) {
			
			try {
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			t.printTable(5);
			t.fun();
		}
		
	}
}

class YourTask extends Thread{
	
	Table tRef;
	
	YourTask(){
		tRef = Table.getTable();
		System.out.println("tRef in YourTask: "+tRef);
	}
	
	public void run(){
		synchronized (tRef) {
			tRef.printTable(7);
			tRef.notify();
		}
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		
		//Table tRef = new Table(); // error, constructor is private
		//Table tRef1 = Table.getTable();

		MyTask mRef = new MyTask();
		YourTask yRef = new YourTask();
				
		mRef.start();
		/*try {
			mRef.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		yRef.start();
		
	}

}
