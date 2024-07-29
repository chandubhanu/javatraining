package javatraining.lambdaexpressions;

import java.util.function.Predicate;

public class predicateInterface {

	public static void main(String[] args) {
		Predicate<Integer> p= (i)->(i>10);
		System.out.println(p.test(20));
		System.out.println(p.test(0));
		//Ex 2 check the length of given string is greater than 4 or not
		
		Predicate<String> c= (d)->(d.length()>4);
		System.out.println(c.test("BHanu"));
		System.out.println(c.test("CPB"));
		//EX3:print array elements those size is > 4 from array
		String[] names= {"Bhanu","Prakash","cbp","xyz"};
		for(String name:names){
			if(c.test(name))
			{
				System.out.println(name);
			}
		}
	}

}
