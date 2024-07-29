package javatraining.collections;

import java.util.HashSet;

public class hashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> evenNumber=new HashSet<Integer>();
evenNumber.add(2);
evenNumber.add(4);
evenNumber.add(6);
evenNumber.add(8);

System.out.println("Hashset"+evenNumber);
HashSet<Integer> Numbers=new HashSet<Integer>();
Numbers.addAll(evenNumber);
Numbers.add(10);
System.out.println("New HashSet numbers are"+Numbers);
Numbers.removeAll(evenNumber);
System.out.println(Numbers);

}

}
