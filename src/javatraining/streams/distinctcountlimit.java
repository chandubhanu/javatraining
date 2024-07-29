package javatraining.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class distinctcountlimit {
//distnict()
	//limit()
	//count()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vehicles[]= {"Bus","Car","Lorry","Jet","Bus","Car","Lorry"};
		List<String> VehiclesList=Arrays.asList(vehicles);
		//distnict()
		VehiclesList.stream().distinct().forEach(value->System.out.print(value+","));
		VehiclesList.stream().distinct().forEach(System.out::println);

		//List<String> Updatedlist=VehiclesList.stream().distinct().collect(Collectors.toList());
		//System.out.println(Updatedlist);
		
		//count
	long count=	VehiclesList.stream().distinct().count();
System.out.println(count);
//limit()
List<String> Updatedlist=VehiclesList.stream().limit(3).collect(Collectors.toList());
System.out.println(Updatedlist);
//Print the second max number
List<Integer> num=Arrays.asList(1,2,3,4,5,6);
Optional<Integer> first=num.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst();
first.ifPresent(System.out::print);
	}
	

}
