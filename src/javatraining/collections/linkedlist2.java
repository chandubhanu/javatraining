package javatraining.collections;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlist2 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		LinkedList<String> al = new LinkedList<String>();
		al.addAll(l);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		// Shuffle
		Collections.shuffle(al);
		System.out.println(al);
		al.removeAll(l);
		System.out.println(al);

	}

}
