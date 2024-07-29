package javatraining.streams;

import java.util.Arrays;
import java.util.List;

public class toArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringlist=Arrays.asList("Bhanu","Siwi","Diggy","1","2","3");
	Object arr[]=	stringlist.stream().toArray();
//	System.out.println(arr);
	for(Object a:arr)
	{
		System.out.println(a);
	}
	}

}
