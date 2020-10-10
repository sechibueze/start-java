
public class VarNumArgs {
	
	static double findAverage(int ...numArgs){
		int sum = 0;
		for(int num : numArgs) {
			sum += num;
		}
		
		double average = sum/numArgs.length;
		return average;
	}
	public static void main(String args[]) {
		final double ave = findAverage(20, 30, 40, 50);
		System.out.println("The average : " + ave);
	}

}
