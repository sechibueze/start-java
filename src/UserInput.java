import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		//Get user input and store it in price
		System.out.print("Enter the price for the goods : ");
		
		Scanner price = new Scanner(System.in);
		System.out.println("You entered : " + price.nextLine());
	}
}
