package javatraining.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst1=Arrays.asList("Scotty","Mike","Rachel");
        List<String> lst2=Arrays.asList("Donna","Harvey","Louis");
        List<String> lst3=Arrays.asList("Howard","Robert","Jessica");
        List<List<String>> playersinworldcup=new ArrayList<List<String>>();
        playersinworldcup.add(lst1);
        playersinworldcup.add(lst2);
        playersinworldcup.add(lst3);
        
//        //before java8
//        for(List<String> team:playersinworldcup)
//        {
//        	for(String name:team)
//        	{
//        		System.out.print(name+",");
//        	}
//        }
	//using flatmap
      List<String> names=  playersinworldcup.stream().flatMap(m->m.stream()).collect(Collectors.toList());
	System.out.println(names);
	Iterator name=names.iterator();
	while(name.hasNext())
	{
		System.out.print(name.next());
		if(name.hasNext())
		{
			System.out.print(",");
		}
	}
	}

}
