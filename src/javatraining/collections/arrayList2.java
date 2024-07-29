package javatraining.collections;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add('X');
		al.add('Y');
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('Z');
		ArrayList AL_dup = new ArrayList();
		AL_dup.addAll(al);
		System.out.println(AL_dup);
		AL_dup.removeAll(al);
		System.out.println(AL_dup);
//Sort order Collections.sort()
		System.out.println("Elements without sort" + al);
		Collections.sort(al);
		System.out.println("Elements After sort" + al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Elements After reverse sort" + al);
//Shuffing elements
		Collections.shuffle(al);
		System.out.println("Elements after Shuffing" + al);
		
	

	}

}
