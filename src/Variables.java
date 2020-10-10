/* Notes 
 * 
 * A variable is a name that refers to a value.
 * A literal is a programming language representation of a value
 * A declarative statement associates a variable to a type( datatype )
 * An assignment statement associates a variable to value;
 * 
 * Variable names 
 * 1. can start with letters, underscores or dollar sign
 * 2. must not be e reserved/keyword
 * 3. Is case-sensitive
 * 
 * 
 * ***/
public class Variables {
	public static void main(String args[]) {
		//Declare variable 
		int count, $counter;
		boolean isTired, isLeapYear; //multiple delaration
		char _grade;
		
		
		//Assignments
		count = 0;
		isTired = true; //no use of 0 afor false or 1 for true as in C++
		isLeapYear = false;
		
		//declare and assign values
		double price = 20.23;
		String firstName = "Samuel";
		int age = 12;
		float radius = 7.24f;
		
		//You can start with $ or _
		_grade = 'A';
		$counter = count + 1;
		float $score = 68.9F; //force to float
		
		
		System.out.print("My name is " + firstName );
		System.out.println(" and I am " + age + "years old");
		System.out.println("I will pay N" + price + "for the sweets");
		
		System.out.println(" -------- ");
		System.out.println("Are you tired ? " + isTired);
		System.out.println("Is 2019 a leap year ? " +  isLeapYear);
		System.out.println("What is the radius of the circle? " + radius);
		
		System.out.println("-------------");
		System.out.println("If your score is: " + $score);
		System.out.println("Then your grade is : " + _grade);
		System.out.println("You are now in LEVEL : " + $counter);
		System.out.println("---Thank You----");
	}
}
