package javatraining.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashtable a=new Hashtable();//intial capacity is 11 and fill ratio is 0.75
		//HashTable a=new Hashtable(13,0.90);
		Hashtable<Integer,String> t=new Hashtable<Integer,String>();
		t.put(101, "Bhanu");
		t.put(102, "Prakash");
		t.put(103, "Chandu");
		t.put(104, "Galli");
		t.put(105, "Sakhi");
		t.put(106, "Sakhi");
		//t.put(null, "suthi");nulls are not allowed in hashtable
		//t.put(109, null);
		System.out.println(t);
		System.out.println(t.get(103));
t.remove(106);
System.out.println(t);
System.out.println(t.containsKey(104));
System.out.println(t.containsValue("chandu"));
System.out.println(t.isEmpty());
System.out.println(t.keySet());
System.out.println(t.values());
//for(Object a:t.keySet()) {
//	System.out.println(a+" "+t.get(a)+" ");
//}
//	//Entry specific method entry is  a combination ofkey and value pair
//	for(Map.Entry K:t.entrySet()) {
//		System.out.println(K.getKey()+"  "+K.getValue());
//	}
	Set s=t.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext()) {
//		System.out.println(it.next());
		Map.Entry b=(Entry) it.next();
		System.out.println(b.getKey()+"  "+b.getValue());
	}
}
	}


