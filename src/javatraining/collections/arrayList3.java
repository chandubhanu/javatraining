package javatraining.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr= {"Zebra","Elephant","Monkey","Donkey","cat"};
for(String a:arr) {
	System.out.println(a);
}
ArrayList al=new ArrayList(Arrays.asList(arr));
Collections.sort(al);
System.out.println(al);
	}

}
