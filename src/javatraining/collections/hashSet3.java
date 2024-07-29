package javatraining.collections;

import java.util.HashSet;

public class hashSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Union Intersection difference
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		System.out.println(hs);
		HashSet<Integer> hs1=new HashSet<Integer>();
		
		hs1.add(5);
		hs1.add(3);
		hs1.add(4);
		System.out.println(hs1);
		//union
//		hs.addAll(hs1);
//		System.out.println("Union:"+hs);
//		//Intersection
//		hs.retainAll(hs1);
//		System.out.println("Intersection:"+hs);
	//Difference
		//
		//SubSet

		System.out.println(hs.contains(hs1));
		
	
	}

}
