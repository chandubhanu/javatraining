package javatraining.lambdaexpressions;
@FunctionalInterface
interface Cab
{
	public void bookCab();
}
//class ola implements Cab{
//
//	@Override
//	public void bookCab() {
//		System.out.println("Ola cab is booked");
//		
//	}
//	
//}
public class lambdaexpressionsday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ola cab=new ola();
Cab cab=()->System.out.println("Ola cab is booked");
cab.bookCab();
	}

}
