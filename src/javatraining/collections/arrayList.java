package javatraining.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ways to Declaring ArrayList
		// ArrayList al=new ArrayList(); **Hetrogenous data
		// ArrayList<String> al=new ArrayList<String>(); //Homogenous data
		// List al=new ArrayList();

		ArrayList al = new ArrayList();
		// add new elements
		al.add(100);
		al.add("Bhanu");
		al.add(13.4);
		al.add("A");
		al.add(true);
		System.out.println(al);
		// no of elements in arraylist
		System.out.println(al.size());
		// remove an element in arraylist
		al.remove(1);
		System.out.println(al);
		// Insert an new element in the middle
		al.add(3, "Bhanu");
		System.out.println(al);
//Retrieve a specific element from list
		System.out.println(al.get(3));
		// Replace/change element
		al.set(3, "Prakash");
		System.out.println(al);
		// Search an element
		System.out.println(al.contains("Prakash"));
		// Checks whether array is empty or not
		System.out.println(al.isEmpty());
		// How to read the data from arraylist
		// 1)using for loop

//		System.out.println("Reading elements using for loop ...............");
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
//		System.out.println("Reading elements using for Each loop ...............");
//		//2)using for each loop
//		for(Object e:al) {
//			System.out.println(e);
//		}

		System.out.println("Reading elements using iterator ...............");
		// 3)using iterator we have the iterator in collections
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
