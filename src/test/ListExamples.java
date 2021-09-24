package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;


public class ListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("praveen");
		list.add("elon");
		list.add("kumar");
		list.add("jeff");
		list.add("praveen");
		
		System.out.println(list);
		System.out.println(list.get(list.size()-1));
		
		
		for(int i = 0; i <= list.size()-1;i++) {
			System.out.println(list);
		}
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			 System.out.println(itr.next());
		}
		
		for(String name: list) {
			System.out.println(name);    
		}
		
		//sorting in assending order
		Collections.sort(list);
		System.out.println(list);
		
		//reverse
		Collections.sort(list,Collections.reverseOrder());
		//Collections.reverse(list);
		System.out.println(list);
		
		LinkedList<String> list1 =  new LinkedList<String> ();
		
		list1.add("vijay");
		list1.add("prudvi");
		list1.add("pradeep");
		

		 list1.add(0,"siva");
		 System.out.println(list1);
		 
		 Iterator itr1 = list1.listIterator();
		 for(String data : list1) {
			 System.out.println(data);
		 }
		 
		 
		 Stack<String> stack = new Stack<String> ();
		 stack.push("lina");
		 stack.push("sonia");
		 stack.push("name3");
		 stack.pop();
		 stack.push("name4");
		 
		 //it will display top item
		 System.out.println(stack.peek());
		 
		 
		 Iterator itr2 = stack.listIterator();
		 for(String data : stack) {
			 System.out.println(data);
	}
		 
		Vector<String> vector = new Vector<String>();
		vector.add("name1");
		vector.add("name2");
		vector.add("name3");
		
		
		

	}
}
