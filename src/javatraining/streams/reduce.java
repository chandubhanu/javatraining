package javatraining.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reduce
		List<String> stringlist=Arrays.asList("Bhanu","Siwi","Diggy","1","2","3");
		Optional<String> reduced=stringlist.stream().reduce((value, combinedvalue)->
		{	
		return combinedvalue+value;
		});
		System.out.println(reduced.get());
	}

}
