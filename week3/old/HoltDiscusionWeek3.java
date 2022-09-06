/**
 * @date 021447Raug22 (DDHHMMZmmmYY)
 * @author William Holt
 * @version 1
 * Discussion 3 
 * Java Program that updates credit score based off made or missed payments.
 */


import java.util.Scanner;

public class HoltDiscusionWeek3 {

	public static void main(String[] args) {
		
		// Begin Scanner
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Credit Updating System.");
		System.out.println("Did you make your payment on time? (true/false)");
		
		//user inputs whether made payment or not
		boolean payment = scan.nextBoolean();
		
		if (payment == true)
			System.out.println("Your credit score went up.");
		else 
			System.out.println("Your credit score went down.");
		
		scan.close();
		

	}

}
