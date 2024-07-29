package javatraining.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedList1 {

	public static void main(String[] args) {
		// Declare of linkedlist
		//LinkedList al=new LinkedList();//Hetrogenous data
		//LinkedList<String> al=new LinkedList<String>();//Homogenous data
		//List<String> bl=new LinkedList<String>();
		LinkedList al=new LinkedList();
		al.add("100");
		al.add("Bhanu");
		al.add("11.90");
		al.add("C");
		al.add(true);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		al.remove(2);
		System.out.println(al);
		al.remove("C");
		System.out.println(al);
		//Insert
		al.add(3, "C");
		System.out.println(al);
		//Retrievingor getting the value
		System.out.println(al.get(3));
		//Change the value
		al.set(3, "H");
		System.out.println(al);
		// Check whether a obj is present or not
		System.out.println(al.contains("H"));
		//Is Empty
		System.out.println(al.isEmpty());
		//TO read the value in linked list
		//For loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	//For Each loop
		for(Object e:al) {
			System.out.println(e);
		}
		//Iterator
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
