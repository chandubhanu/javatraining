package javatraining.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,9,10,11);
List<Integer> l2=	l1.stream().distinct().sorted().collect(Collectors.toList());
//ascending order
System.out.println(l2);
//descending Order
List<Integer> l3=l1.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println(l3);
//print the second max number
Optional<Integer> m1=l1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
System.out.println(m1.get());
//Strings order
List<String> names=Arrays.asList("Bhanu","Tim","David","kitty");
List<String> names1=names.stream().sorted().collect(Collectors.toList());
System.out.println(names1);
	
	}

}
