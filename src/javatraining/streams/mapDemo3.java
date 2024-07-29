package javatraining.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> Numbers=Arrays.asList(1,4,7,8);
		List<Integer> mulNumbers=new ArrayList<Integer>();
		/*
		for(int num:Numbers)
		{
			int n=num*3;
			mulNumbers.add(n);
		}
	System.out.println(mulNumbers);
	*/
		mulNumbers=Numbers.stream().map(mul->mul*3).collect(Collectors.toList());
	
		System.out.println(mulNumbers);
	}

}
