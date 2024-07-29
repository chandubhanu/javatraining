package javatraining.lambdaexpressions;

import java.util.function.Predicate;
//joining predicates and,or,negate
//p1-->check the number is even or not
//p2-->check number is greater then 50 or not




public class predicateInterface3 {

	public static void main(String[] args) {
		int[] a= {55,6,77,23,99,100,110,91,34,56};
		Predicate<Integer> pr1=e->(e%2==0);
		Predicate<Integer> pr2=e1->(e1>50);
		System.out.println("ANd Operator values are");
	for(Integer value:a)
	{
	//if(pr1.test(value)&&pr2.test(value))
		if(pr1.and(pr2).test(value))
	{
		System.out.println(value);
	}
	}
	System.out.println("OR Operator values are");
	for(Integer value:a)
	{
	//if(pr1.test(value)&&pr2.test(value))
		if(pr1.or(pr2).test(value))
	{
		System.out.println(value);
	}
	}
	System.out.println("Negate Operator values are");
	for(Integer value:a)
	{
	//if(pr1.test(value)&&pr2.test(value))
		if(pr1.negate().test(value))
	{
		System.out.println(value);
	}
	}
	}

}
