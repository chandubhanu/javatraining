package javatraining.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class mapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vehicles=Arrays.asList("Honda","TVS","Intercity","Volvo");
		//find length of every element
		//before java 8
//		int n=0;
//		for(String vehicle:vehicles)
//		{
//			int vehiclelen=vehicle.length();
//			n++;
//			System.out.print(vehiclelen);
//			if(n<vehicles.size())
//			{
//		System.out.print(",");
//			}
//		}
		vehicles.stream().map(vname->vname.length()).forEach(len->System.out.print(len));
					
		
	}

}
