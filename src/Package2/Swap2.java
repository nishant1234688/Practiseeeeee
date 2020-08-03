package Package2;

public class Swap2 {


	public static void main(String[] args) {
		String x;
		String y;
		
		x= "firstName";
		y= "LastName";
		x= x+y; //FirstNameLastName
		y=x.substring(0,x.length ()- y.length());                             //FirstName
		x= x.substring(y.length()); // last name
		System.out.println("The value of x is  "+ x);
		System.out.println("The value of y is  "+ y);
		

	}

}
