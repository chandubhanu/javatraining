package javatraining.collections;

import java.util.LinkedList;

public class linkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList a=new LinkedList();
a.add("dog");
a.add("dog");
a.add("cat");
a.add("horse");
System.out.println(a);
a.addFirst("Tiger");
System.out.println(a);
a.addLast("Lion");
System.out.println(a);
System.out.println(a.getFirst());
System.out.println(a.getLast());
a.removeFirst();
a.removeLast();
System.out.println(a);
	

	}

}
