package javatraining.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapDemo {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> a= new HashMap<Integer,String>();
//HashMap<String> a= new HashMap<String>();
a.put(101, "john");
a.put(102, "david");
a.put(103, "scott");
a.put(104, "lang");
a.put(105, "robert");
a.put(103, "Bhanu");
System.out.println(a);
System.out.println(a.get(104));
a.remove(105);
System.out.println(a);
System.out.println(a.containsKey(105));
System.out.println(a.containsValue("Bhanu"));
System.out.println(a.isEmpty());
for(int i:a.keySet()) 
{
System.out.println(i);
}
for(Object value:a.values()) {
System.out.println(value);
}
for(Object j:a.keySet())
{
	System.out.println(j+" "+a.get(j));
	}
//Entry interface methods
//capture the entry from hashmap
for(Map.Entry entry:a.entrySet()) {
	System.out.println(entry.getKey()+"  "+entry.getValue());
}
Set s=a.entrySet();
Iterator it=s.iterator();
while(it.hasNext()) {
	Map.Entry entry=(Entry) it.next();
	System.out.println(entry.getKey()+"   "+entry.getValue());
}
	}

}
