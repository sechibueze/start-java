
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[5];
		String numStr[] = {"12", "13", "14"};
		String[] strArr = {"one", "two", "three", "four"};
		String str1 = strArr[0];
		strArr[1] = "2";
		int sum = 0;
		for(String str : numStr) {
			sum += Integer.parseInt(str);
		}
		
		System.out.println("Sum of string nums: " + sum);

	}

}
