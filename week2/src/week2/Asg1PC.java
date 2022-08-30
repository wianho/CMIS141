/**
 * Asg1PC.java - A discount calculator, transaction receipt maker, 
 * @author William Holt
 * @date 301851Raug22 (DDHHMMZmmmYY)
 */
package week2;
import java.util.Scanner;
public class Asg1PC { // begin main class
	public static void main(String[] args) { // begin main method
	    // opens scan
		Scanner scan = new Scanner(System.in);
		// ask for customer id
		System.out.print("Enter customer ID: ");
		int customer_id = scan.nextInt();
		// ask for unit price as decimal
		System.out.print("Enter unit price as decimal (EXAMPLE 2.9): ");
		double unit_price = scan.nextDouble();
		// ask for quantity
		System.out.print("Enter quantity: ");
		int quantity = scan.nextInt();
		// new line
		scan.nextLine();
		// ask for product description
		System.out.print("Enter product description: ");
		String product_desc = scan.nextLine();
    	// ask for discount in decimal percentage form
		System.out.print("Enter discount as a decimal percentage (EXAMPLE .25): ");
		double discount = scan.nextDouble();
		// order before discount calculation
		double total_before_discount = unit_price * quantity;
		// order after discount calculation
		double total_after_discount = (unit_price * quantity) * 1 - (unit_price * quantity) * discount;
		// print customer id
		System.out.printf("\n\nCustomer ID: %d\n", customer_id);
		// print unit price
		System.out.printf("Unit Price: %.2f\n", unit_price);
		// print quantity
		System.out.printf("Quantity: %d\n", quantity);
		//print product description
		System.out.printf("Product Description: %s\n", product_desc);
		//print discount
		System.out.printf("Discount: %.2f\n", discount);
		// print total before discount
		System.out.printf("\nOrder Total Before Discount: %.2f\n", total_before_discount);
		// print order total after discount
		System.out.printf("Order Total After Discount: %.2f\n", total_after_discount);
		// closes scan
		scan.close();
	}// end main method
} // end main class
