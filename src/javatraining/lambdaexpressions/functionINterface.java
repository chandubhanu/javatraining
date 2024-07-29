package javatraining.lambdaexpressions;

import java.util.function.Function;

public class functionINterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<Integer,Integer> f=n->n*n;
System.out.println(f.apply(3));


///Find the string length
Function<String,Integer> g =m->m.length();
System.out.println(g.apply("Bhanu"));
	
}
	}


