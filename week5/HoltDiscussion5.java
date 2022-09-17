/**
 * @date 170717Rsep22 (DDHHMMZmmmYY)
 * @author William Holt
 * @version 1
 * Discussion 5
 * Java Program that prompts the user for two numbers between 1 & 10,
 * adds them together and counts down from the sum
 */


import java.util.Scanner;

public class HoltDiscussion5 {

	public static void main(String[] args) {
		// scanner use & user input 

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number between 1 & 10\n");

		System.out.print("Enter your first number: ");

		int num1 = scan.nextInt();

		System.out.print("Enter your second number: ");

		int num2 = scan.nextInt();

		// output Display 

		if(num1 > 10 || num2 > 10) {

			System.out.print("Please restart program,\n"

					+"Then enter numbers between 1 & 10.\n");

		} // end if

		else {

			int answer = num1 + num2;

			System.out.println("...adding the two numbers together...");

			System.out.println(num1 + " + " + num2 + " = " + answer);

			// if statement for negative numbers

			if (answer < 0) {

				System.out.println("n"+ answer + " is not a real number.");

				System.out.println("Ending the program");

			} // end nested if statement 

			else 

			System.out.println("Counting down from " + answer + "...");

			// for loop to count down from the the answer.

			for(answer = (num1 + num2) ; answer >= 0; answer --) {

				System.out.println(answer);

				if (answer == 0) {

				System.out.println("Goodbye!");

				} // end super nested if 

			} // end for loop

		} // end else

		scan.close(); // close scanner 
	
	}

}
