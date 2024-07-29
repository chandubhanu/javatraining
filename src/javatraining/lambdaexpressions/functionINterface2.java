package javatraining.lambdaexpressions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;

	public Employee(String Ename, int salary) {
		this.ename = ename;
		this.salary = salary;
	}
}

public class functionINterface2 {

	public static void main(String[] args){
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("Bhanu",30000));
		emp.add(new Employee("Prakash",50000));
		emp.add(new Employee("Chandu",20000));
		Function<Employee,Integer> f=n->{
			int sal=n.salary;
			if(sal>=10000 && sal<=20000) {
				return (sal*10/100);
			}
			else if(sal>20000 && sal<=30000) {
				return (sal*20/100);
			}
			else if(sal>30000 && sal<=40000) {
				return (sal*30/100);
			}
			else if(sal>40000 && sal<=50000) {
				return (sal*40/100);
			}
			return sal;
		};
		Predicate<Integer> pr=n->n>7000;
		for(Employee e:emp)
		{
			
			int bonus=f.apply(e);
			int newsal=e.salary+bonus;
			if(pr.test(bonus))
			{
		System.out.println(e.ename+"  "+e.salary);
		System.out.println("Bonus is"+" "+bonus);
		System.out.println("Updated sal is"+" "+newsal);
			}
		
		}

}
}
