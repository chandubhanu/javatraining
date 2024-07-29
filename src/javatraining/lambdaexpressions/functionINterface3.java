package javatraining.lambdaexpressions;

import java.util.function.Function;

/*
 * function chaining
 * AndThen()
 * Compose()
 * */



public class functionINterface3 {

	public static void main(String[] args){
		Function<Integer,Integer> f1=e->e*2;
		Function<Integer,Integer> f2=n->n*n*n;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
}
}
