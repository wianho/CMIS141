
/**
 * CMIS 141/4025
 * Asg2good.java - Addition, subtraction, multiplication, division and error handling tool.
 * @author William Holt
 * @date 061312Rsep22 (DDHHMMZmmmYY)
 */
package week2;

import java.util.Scanner;

public class Asg2good {

	public static void main(String[] args) {
	
		    // Open Scanner as 'scan'
			Scanner scan = new Scanner(System.in);

			System.out.print("Enter two integer numbers between 200 and 1000\n");
			System.out.print("separated by space: ");
			
			// userInput is saved
			String userInput = scan.nextLine();
			
			int first = Integer.parseInt(userInput.split(" ")[0]);
			
			int second = Integer.parseInt(userInput.split(" ")[1]);
			
			int result = 0;
			
			System.out.print("Enter operation symbol (+, -, *, or /): ");
			
			// operatorEntered does what it sounds like, stores the operator which was entered
			String operatorEntered = scan.nextLine();
			
				// checks if + - * / are used, exits if not
				if (operatorEntered.equals("+") || operatorEntered.equals("-") || operatorEntered.equals("*")
				|| operatorEntered.equals("/")) {
					
				if (operatorEntered.equals("+")) {
				result = first + second;
				
				} else if (operatorEntered.equals("-")) {
				result = first - second;
				
				} else if (operatorEntered.equals("*")) {
				result = first * second;
				} else {
					
				result = first / second;
				}
				} else {
				
			System.out.println("Not a valid operation symbol");
			System.exit(0);
			
			}
			
			// prints final evaluation
			System.out.println("Evaluation: " + first + " " + operatorEntered + " " + second + " = " + result);

			scan.close();

	}
}