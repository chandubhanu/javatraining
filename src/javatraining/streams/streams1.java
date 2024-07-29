package javatraining.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> b=Arrays.asList(10,15,20,25,30);
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> b=new ArrayList<Integer>();
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);	
		a.add(30);
		b=a.stream().filter(n->n%2==0).collect(Collectors.toList());
		a.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		a.stream().filter(n->n%2==0).forEach(System.out::println);
		System.out.println(b);
		//without using streams
//		for(int e:a)
//		{
//			if(e%2==0) 
//			{
//				b.add(e);
//			}
//			
//		}
//		System.out.println(b);
		}

}
