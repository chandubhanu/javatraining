package javatraining.lambdaexpressions;
@FunctionalInterface
interface Cab1
{
	public String bookCab(String source,String Destination);
}
//class ola implements Cab1{
//
//	
//	public String bookCab(String source,String Destination) {
//		System.out.println("Ola cab is booked"+" "+"From"+" "+source+" "+"To"+" "+Destination);
//		return ("Price is 10");
//	}
//
//
//	
//}
public class lambdaexpressionsday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ola cab=new ola();
//Cab1 cab=new ola();
		Cab1 cab=(source,Destination)->{
			System.out.println("Ola cab is booked"+" "+"From"+" "+source+" "+"To"+" "+Destination);
			return ("Price is 10");
		};
		System.out.println(cab.bookCab("Guntur","Bangalore"));
	}

}
