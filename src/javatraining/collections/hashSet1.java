package javatraining.collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet(); // default capacity is 16 and load rate is 0.75
		//HashSet hs=new HashSet(100,(float)0.95);
		//HashSet<Integer> hs=new HashSet<Integer>();
		hs.add("100");
		hs.add("C");
		hs.add("Bhanu");
		hs.add("0.90");
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		hs.remove("Bhanu");
		System.out.println(hs);
		System.out.println(hs.contains("Bhanu"));
		System.out.println(hs.isEmpty());
		//1)for each loop
		for(Object e:hs) 
		{
			System.out.println(e);
		}
		//2)iterator
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
