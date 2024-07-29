package javatraining.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findfirstfindlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find any
List<String> l1=Arrays.asList("4","Two","Three","Four");
Optional<String> ele=l1.stream().findAny();
	System.out.println(ele.get());
	//find first
	Optional<String> el=l1.stream().findFirst();
	System.out.println(el.get());
	}

}
