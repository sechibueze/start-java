
public class DataTypeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MAX BYTES : " + Byte.MAX_VALUE);
		System.out.println("NIN BYTES : " + Byte.MIN_VALUE);
		
		System.out.println("MAX SHORT : " + Short.MAX_VALUE); // 2^15 - 1 to - 2^15 
		System.out.println("NIN SHORT : " + Short.MIN_VALUE);
		
		System.out.println("MAX LONG : " + Long.MAX_VALUE); // 2^15 - 1 to - 2^15 
		System.out.println("NIN LONG : " + Long.MIN_VALUE);
		
		System.out.println("MAX Integer : " + Integer.MAX_VALUE);
		System.out.println("NIN Integer : " + Integer.MIN_VALUE);
		
		System.out.println("MAX CHAR : " + Character.MAX_VALUE + 0); //65535
		System.out.println("NIN CHAR : " + Character.MIN_VALUE + 0);
		
		System.out.println("MAX Double : " + Double.MAX_VALUE);
		System.out.println("NIN Double : " + Double.MIN_VALUE);
		
		System.out.println("MAX Float : " + Float.MAX_VALUE);
		System.out.println("NIN Float : " + Float.MIN_VALUE);
	}

}
