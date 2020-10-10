
/* Integer Data Type */
public class IntegerDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Max value : " + Integer.MAX_VALUE); // 2^31 - 1
		System.out.println("Min value : " + Integer.MIN_VALUE); // -2^31 
		
		//Typical Literals
		int count = 1, age = 30, century = 100, dozen = 12;
		
		//Operators => +, -, *, /, %
		System.out.println(" 5 + 6 = " + (5 + 6)); 
		System.out.println(" 5 - 6 = " + (5 - 6)); 
		System.out.println(" 5 * 6 = " + (5 * 6));
		System.out.println(" 6 / 2 = " + (6 / 2));
		System.out.println(" 6 / 5 = " + (6 / 5)); // Why ?
		
		System.out.println(" 6 % 5 = " + (6 % 5)); 
		
		System.out.println(" ----- ");
		//int add = "8" + 9; // error
		//To fix
		int add = Integer.parseInt("8") + 9;
		System.out.println("str + int = " + add);
		

	}

}
