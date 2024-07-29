package javatraining.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class student {
	String sname;
	int sid;
	char sgrade;

	student(String sname, int sid, char sgrade) {
		this.sname = sname;
		this.sid = sid;
		this.sgrade = sgrade;
	}
}

public class flatmap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student> a = new ArrayList<student>();
		a.add(new student("smith", 1, 'A'));
		a.add(new student("Stefan", 2, 'B'));
		a.add(new student("Katerina", 3, 'C'));
		List<student> b = new ArrayList<student>();
		b.add(new student("elena", 4, 'A'));
		b.add(new student("Klaus ", 5, 'B'));
		b.add(new student("Bonnie", 6, 'C'));

		List<List<student>> studentlist = Arrays.asList(a, b);
//		//before java8
//		for(List<student> studentname:studentlist)
//		{
//			for(student details:studentname)
//			{
//				System.out.println(details.sname);
//			}
//		}

		// flatmap
		List<String> details = studentlist.stream().flatMap(e -> e.stream()).map(e -> e.sname)
				.collect(Collectors.toList());
		System.out.print(details);
	}

}
