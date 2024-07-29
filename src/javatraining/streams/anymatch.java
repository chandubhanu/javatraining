package javatraining.streams;

import java.util.HashSet;
import java.util.Set;

public class anymatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ANy Match
		
		Set<String> fruits=new HashSet<String>();
		fruits.add("One Apple");
		fruits.add("One Mango");
		fruits.add("Two Apples");
		fruits.add("More Grapes");
		fruits.add("Two Guavas");
	boolean result=	fruits.stream().anyMatch(e->e.startsWith("O"));
		System.out.println(result);
		//all match
		boolean result1=	fruits.stream().allMatch(e->e.startsWith("O"));
		System.out.println(result1);
		//None match
				boolean result2=	fruits.stream().noneMatch(e->e.startsWith("z"));
				System.out.println(result2);
	}

}
