package week2;

import java.util.Scanner;

public class Asg1PC {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Enter customer ID: ");
		int customer_id = scan.nextInt();

		System.out.print("Enter unit price as decimal (EXAMPLE 2.9): ");
		double unit_price = scan.nextDouble();
				
		System.out.print("Enter quantity: ");
		int quantity = scan.nextInt();
				
		scan.nextLine();
				
		System.out.print("Enter product description: ");
		String product_desc = scan.nextLine();

		System.out.print("Enter discount as a decimal percentage (EXAMPLE .25): ");
		double discount = scan.nextDouble();
						
		double total_before_discount = unit_price * quantity;
									
		double total_after_discount = (unit_price * quantity) * 1 - (unit_price * quantity) * discount;
							
		System.out.printf("\n\nCustomer ID: %d\n", customer_id);
				
		System.out.printf("Unit Price: %.2f\n", unit_price);
							
		System.out.printf("Quantity: %d\n", quantity);
								
		System.out.printf("Product Description: %s\n", product_desc);
							
		System.out.printf("Discount: %.2f\n", discount);
						
		System.out.printf("\nOrder Total Before Discount: %.2f\n", total_before_discount);
						
		System.out.printf("Order Total After Discount: %.2f\n", total_after_discount);
		
		scan.close();
	}

}
