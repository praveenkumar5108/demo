package test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   PriorityQueue<String> queue1 = new PriorityQueue<String> ();
	   queue1.add("name1");
	   queue1.add("name2");
	   queue1.add("name3");
	   queue1.add("name4");
	   
	   System.out.println(queue1);
	   System.out.println(queue1.peek());
	   //retreive and remove the value
	   System.out.println(queue1.poll());
	   System.out.println(queue1);
	   
	   
	   
       ArrayDeque<String> queue2 = new ArrayDeque<String>();  
	   
	   queue2.add("name5");
	   queue2.add("name6");
	   queue2.add("name7");
	   queue2.add("name8");
	   //queue never allow null values
	   //queue2.add(null);
	   
	   queue2.addFirst("sisira");
	   queue2.addLast("nani");
	   
	   System.out.println(queue2);
	   System.out.println(queue2.peekFirst());
       
	}

	
	
	   
}
