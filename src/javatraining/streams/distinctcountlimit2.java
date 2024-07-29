package javatraining.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class distinctcountlimit2 {
//distnict()
	//limit()
	//count()
	public static void main(String[] args) {
		//evennnumber count
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		long evennumcount=num.stream().filter(e->e%2==0).count();
		System.out.println(evennumcount);
		//min
	Optional<Integer> minnumber=	num.stream().min((a,b)->a.compareTo(b));
			System.out.println(minnumber.get());
			//max
			Optional<Integer> maxnumber=	num.stream().max((a,b)->a.compareTo(b));
			System.out.println(maxnumber.get());
	}
	

}
