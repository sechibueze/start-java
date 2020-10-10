
public class ComparisonOp {

	public static void main(String[] args) {
		int fNum, sNum;
		
		fNum = 5;
		sNum = 6;
		
		System.out.println(" fNum > sNum : " + (fNum > sNum));
		System.out.println(" fNum < sNum : " + (fNum < sNum));
		System.out.println(" fNum >= sNum : " + (fNum >= sNum));
		System.out.println(" fNum <= sNum : " + (fNum <= sNum));
		System.out.println(" fNum == sNum : " + (fNum == sNum));
		System.out.println(" fNum 1= sNum : " + (fNum != sNum));
		
//		Use case => checkMonth
		int month = 4;
		boolean isValid;
		
		isValid = (month >= 1) && (month <= 31);
		System.out.println("A month value of : " + month + " is " + isValid);
		

	}

}
