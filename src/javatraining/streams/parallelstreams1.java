package javatraining.streams;

import java.util.ArrayList;
import java.util.List;

class student6 {
	String name;
	int Score;

	student6(String name, int Score) {
		this.name = name;
		this.Score = Score;
	}

	public String getname() {
		return this.name;
	}

	public int getScore() {
		return this.Score;
	}
}

public class parallelstreams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<student6> details = new ArrayList<student6>();
		details.add(new student6("Bhanu", 88));
		details.add(new student6("Bob", 90));
		details.add(new student6("john", 65));
		details.add(new student6("kennedy", 55));
		details.add(new student6("eric", 85));
		details.add(new student6("Smith", 88));
		details.add(new student6("Scot", 50));

		//Sequential process
		details.stream().filter(e -> e.getScore() > 80).limit(3)
				.forEach(e -> System.out.println(e.getname() + " " + e.getScore()));
		
		//parallel stream
		details.parallelStream().filter(e -> e.getScore() > 80).limit(3)
		.forEach(e -> System.out.println(e.getname() + " " + e.getScore()));
		
		//Convert stream->parallel stream
		details.stream().parallel().filter(e -> e.getScore() > 80).limit(3)
		.forEach(e -> System.out.println(e.getname() + " " + e.getScore()));
		
	}

}
