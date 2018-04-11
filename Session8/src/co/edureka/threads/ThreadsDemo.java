package co.edureka.threads;

/*class MyTask{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("**MyTask**"+i);
		}
	}
}*/

class MyTask extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000); // 1 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("**MyTask**"+i);
		}
	}
}

class YourTask extends Thread{
	public void run(){
		
		Thread.yield();
		
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(500); // .5secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("@@YourTask@@"+i);
		}
	}
}

class A{
	
}

class OurTask extends A implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(500); // .5secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("##OurTask##"+i);
		}
	}
}

public class ThreadsDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Started...");
		
		MyTask mRef = new MyTask();
		YourTask yRef = new YourTask();
		
		Runnable r = new OurTask(); // RTP
		Thread oRef = new Thread(r);
		
		mRef.setPriority(Thread.MIN_PRIORITY);  // 1
		yRef.setPriority(Thread.NORM_PRIORITY); // 5
		oRef.setPriority(Thread.MAX_PRIORITY);  // 10
		
		mRef.start();
		
		try {
			mRef.join(); // executed immediately after start
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} 
		
		
		yRef.start();
		try {
			yRef.join(); // executed immediately after start
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} 
		
		oRef.start();
		//mRef.executeTask();
		
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(500); // .5secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("==Main Thread=="+i);
		}
		
		mRef.setName("John");
		yRef.setName("Jennie");
		oRef.setName("Jim");
		Thread.currentThread().setName("Jack");
		
		System.out.println("mRef Name: "+mRef.getName());
		System.out.println("yRef Name: "+yRef.getName());
		System.out.println("oRef Name: "+oRef.getName());
		System.out.println("main Name: "+Thread.currentThread().getName());
		
		System.out.println("mRef Priority: "+mRef.getPriority());
		System.out.println("yRef Priority: "+yRef.getPriority());
		System.out.println("oRef Priority: "+oRef.getPriority());
		System.out.println("main Priority: "+Thread.currentThread().getPriority());
		
		System.out.println("Main Thread Finished...");
	}

}
