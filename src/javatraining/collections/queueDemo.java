package javatraining.collections;

import java.util.PriorityQueue;

public class queueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue hs=new PriorityQueue();
//Adding elements
hs.add("A");
hs.add("B");
hs.add("C");
hs.offer("B");

System.out.println(hs);
//Get the Header element
System.out.println(hs.peek());
System.out.println(hs.element());
// if queue is empty
PriorityQueue ha=new PriorityQueue();
//System.out.println(ha.peek());
//System.out.println(ha.element());
//Return or remove element
System.out.println(hs.poll());
System.out.println(hs);
System.out.println(hs.remove());
System.out.println(hs);
System.out.println(ha.poll());
ha.remove();
	}

}
