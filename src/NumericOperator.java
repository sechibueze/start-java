
public class NumericOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, z;
		
		x = 2; y = 4; z = 7;
		
		int total = x + y + z;
		double product = x * y * z;
		double average =(double) total/3; //casting integer to double
		int remainder = total % 3 ; //get the remainder after division
		
		
		
		System.out.println("The total is : " + total );
		System.out.println("The avaerage is : " + average );
		System.out.println("The product is : " + product );
		System.out.println("The remaintder is : " + remainder );
		System.out.println("product minus total : " + (product - total) );
		
		

	}

}
