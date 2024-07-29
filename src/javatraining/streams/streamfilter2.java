package javatraining.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class product{
	int id;
	String name;
	double price;
	public product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class streamfilter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<product> a=new ArrayList<product>();
		a.add(new product(1,"HP",50000));
		a.add(new product(2,"Dell",60000));
		a.add(new product(3,"Lenovo",70000));
		a.add(new product(4,"Sony",80000));
		a.add(new product(5,"Mi",90000));
a.stream().filter(n->n.price>65000).forEach(n->System.out.println(n.price));
List<product> b=a.stream().filter(n->n.price>65000).collect(Collectors.toList());
b.forEach(n->System.out.println(n.price));

	}

}
