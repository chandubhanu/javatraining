package javatraining.lambdaexpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

class employee1{
	String ename;
	int salary;
	int Experience;
	
	employee1(String name,int sal,int exp){
		ename=name;
		salary=sal;
		Experience=exp;
	}
}

public class predicateInterface2 {

	public static void main(String[] args) {
		//Ex1
		employee1 emp=new employee1("Bhanu",30000,2);
		// retrurn the name of employee if expeience is >3 and salary >30000
		Predicate<employee1> pr=e->(e.salary>30000&&e.Experience>3);
		//System.out.println(pr.test(emp));
		
		//Ex2
		ArrayList<employee1> al=new ArrayList<employee1>();
		al.add(new employee1("Bhanu",30000,2));
		al.add(new employee1("Prakash",55000,5));
		al.add(new employee1("Chandu",70000,6));
		al.add(new employee1("Teja",60000,7));
		al.add(new employee1("Munna",20000,2));
		for(employee1 e:al)
		{
			if(pr.test(e)) 
			{
				System.out.println(e.ename);
			}
		}
	}

}
