package javatraining.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //map
        List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> bl = al.stream().map(e -> e + 10).collect(Collectors.toList());
        
        System.out.println(bl);

//flatmap
        
        List<Integer> lst1=Arrays.asList(1,2);
        List<Integer> lst2=Arrays.asList(3,4);
        List<Integer> lst3=Arrays.asList(5,6);
        //now add all three into single collection
        List<List<Integer>> list=Arrays.asList(lst1,lst2,lst3);
       List<Integer> finallist= list.stream().flatMap(n->n.stream().map(e->e+10)).collect(Collectors.toList());
       System.out.println(finallist);
       Iterator a=finallist.iterator();
       while(a.hasNext())
       {
    	   System.out.print(a.next());
    	   if(a.hasNext())
    	   {
    		   System.out.print(",");
    	   }
       }
    }
}
