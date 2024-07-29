package javatraining.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class concatenatingstreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> animals=Arrays.asList("Dog","Cat","Elephant");
List<String> Birds=Arrays.asList("Crow","Parrot","Hen");
Stream s1=animals.stream();
Stream s2=Birds.stream();
List<String> finallist=(List<String>) Stream.concat(s1, s2).collect(Collectors.toList());
System.out.println(finallist);
for(String names:finallist)
{
System.out.println(names);	
}
	}

}
