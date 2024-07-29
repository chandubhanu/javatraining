package javatraining.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a=Arrays.asList("Sansa","jon","joffrey","Daenerys","Melisandre");
List<String> b=new ArrayList<String>();
b=a.stream().filter(n->n.length()>6 && n.length()<8).collect(Collectors.toList());
System.out.println(b);
a.stream().filter(n->n.length()>6 && n.length()<8).forEach(System.out::println);
a.stream().filter(n->n.length()>6 && n.length()<8).forEach(n->System.out.println(n));
	}

}
