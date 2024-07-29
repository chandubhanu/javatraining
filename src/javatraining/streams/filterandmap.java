package javatraining.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String name;
	int id;
	int sal;

	Employee(String name, int id, int sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
}

public class filterandmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emplist = Arrays.asList(new Employee("Bhanu", 1, 10000), new Employee("Chandu", 2, 20000),
				new Employee("Prakash", 3, 30000), new Employee("Gopi", 4, 40000), new Employee("Naidu", 5, 50000));
		List<Integer> updatedemplist = emplist.stream().filter(n -> n.sal > 20000).map(n -> n.sal)
				.collect(Collectors.toList());
		System.out.println(updatedemplist);
	}

}
