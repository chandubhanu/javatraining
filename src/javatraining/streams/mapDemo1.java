package javatraining.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vehicles=Arrays.asList("Honda","TVS","Intercity","Volvo");
		List<String> vehiclesUppercase=new ArrayList<String>();
		//Convert vehicle into uppercae
		/*Before java 8
		for(String vehicle:vehicles) {
			String a=vehicle.toUpperCase();
			vehiclesUppercase.add(a);
		}
System.out.println(vehiclesUppercase);
*/
	//After Java 8
		vehiclesUppercase=vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
			System.out.println(vehiclesUppercase);
	}

}
