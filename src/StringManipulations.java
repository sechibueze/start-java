
public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = new String("The quick brown fox jumped");
		String text2 = " over the lazy ";
		String text3 = text + text2;
		System.out.println("Length : " + text.length());
		System.out.println("Concatenate : " + text3);
		System.out.println("Is same : " + (text.equals(text2)));
		System.out.println("to uppercase: " + text.toLowerCase());
		System.out.println("to lower case : " + text.toLowerCase());
		System.out.println("charAt(5): " + text.charAt(5));
		System.out.println("text.indexOf(\"u\"): " + text.indexOf("u"));
		System.out.println("text.substring(5): " + text.substring(5,9));
		System.out.println("text.compareToIgnoreCase(text2): " + text.compareToIgnoreCase(text2));
		String arr[] = text.split(" ");
		for(String x:arr)
			System.out.println("el " + x);
		
		//System.out.println("text.split(\" \"): " + );
		
		
	}

}
