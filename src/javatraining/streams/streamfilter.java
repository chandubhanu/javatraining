package javatraining.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a=Arrays.asList("abd",null,"bcu",null);
List<String> b=a.stream().filter(n->n!=null).collect(Collectors.toList());
System.out.println(b);
	}

}
