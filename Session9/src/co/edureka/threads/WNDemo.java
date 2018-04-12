package co.edureka.threads;

import java.util.Scanner;

// SingleTon...
class Message{
	
	String msg;
	
	private static Message m = new Message();
	
	private Message(){
		msg = "No Message Available !!";
		System.out.println("Meesage Object Created..");
	}
	
	public void writeMessage(){
		msg = "Search the Candle, rather than cursing the darkness!!";
		System.out.println("--Message Written--");
	}
	
	public void readMessage(){
		System.out.println("Message is: "+msg);
	}
	
	static Message getMessage(){
		return m;
	}
}

class ReaderThread extends Thread{
	
	Message m;
	
	ReaderThread(){
		m = Message.getMessage();
		//System.out.println("--Reader Thread Constructed--");
	}
	
	public void run(){
		
		synchronized (m) {
			
			//System.out.println("--Reader Thread Started--");
			
			try {
				m.wait();
				//m.wait(1000); // Timed Waiting
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			m.readMessage();
		}
	}
}

class WriterThread extends Thread{
	
	Message m;
	
	WriterThread(){
		m = Message.getMessage();
		//System.out.println("--Writer Thread Constructed--");
	}
	
	public void run(){
		
		synchronized (m) {
			
			//System.out.println("--Writer Thread Started--");
			
			m.writeMessage();
			//m.notify();
			m.notifyAll();
		}
		
	}
}

public class WNDemo {

	public static void main(String[] args) {
		
		ReaderThread rt1 = new ReaderThread();
		ReaderThread rt2 = new ReaderThread();
		WriterThread wt = new WriterThread();
		
		rt1.start();
		rt2.start();
		
		wt.start();
		
		//System.out.println(Math.sqrt(16));
		//System.out.println(Math.cos(90));
		
		System.out.println("");
		Scanner scanner = new Scanner(System.in);
		System.err.println(""); // printed as red in color

	}

}
