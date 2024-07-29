package lambdaexpressions2;

import java.util.function.Consumer;

public class consumerChain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<String> c=e->System.out.println(e+" "+"is white");
Consumer<String> c3=e->System.out.println(e+" "+"is having four legs");
Consumer<String> c2=e->System.out.println(e+" "+"is eating grass");
c.andThen(c2).andThen(c3).accept("Cow");
	Consumer<String> c4=c.andThen(c2).andThen(c3);
	c4.accept("Cow");
	}

}
