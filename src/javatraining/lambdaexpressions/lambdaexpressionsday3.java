package javatraining.lambdaexpressions;
@FunctionalInterface
interface Cab2
{
	public void bookCab(String source,String Destination);
}
//class ola implements Cab1{
//
//	@Override
//	public void bookCab(String source,String Destination) {
//		System.out.println("Ola cab is booked"+" "+"From"+" "+source+" "+"To"+" "+Destination);
//		
//	}
//
//	
	
//}
public class lambdaexpressionsday3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ola cab=new ola();
//Cab1 cab=new ola();
		Cab2 cab=(source,Destination)->System.out.println("Ola cab is booked"+" "+"From"+" "+source+" "+"To"+" "+Destination);
cab.bookCab("Guntur","Bangalore");
	}

}
