package co.eureka.utilcollections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//Queue<Integer> queue = new PriorityQueue<Integer>(); // RTP
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); // Direct Object Construction
		
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		//         H 						   T
		// Queue : 10  9  8  7  6  5  4  3  2  1

		// PriorityQueue Sorts the data...
		//         H 						   T
		// Queue : 1  2  3  4  5  6  7  8  9  10
		
		// Read the Head of Queue
		//System.out.println(queue.peek());
		
		// Read the Head of Queue and remove it
		//System.out.println(queue.poll());

		for(int i=1;i<=10;i++){
			//System.out.println(queue.peek());
			System.out.println(queue.poll()+" size is: "+queue.size());
		}
		
	}

}
