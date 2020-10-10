
public class BooleanDatatype {

	public static void main(String[] args) {
		boolean isTrue, isFalse;
		
		isTrue = true;
		isFalse = false;
		
//		boolean andOp, orOp, xorOp;
		boolean a, b;
		a = true;
		b = false;
		
		 System.out.println(" !a : " + !a);
		 System.out.println(" !b : " + !b);
		 
		 System.out.println(" a && b: " + (a && b));
		 
		 System.out.println(" a || b: " + (a || b));
		 //XOR is only true if EXACTLY ONE operand is true otherwise false
		 System.out.println(" (!a && b) || (a && !b) " + ((!a && b) || (a && !b) ));
		 
		 
		
		

	}

}
