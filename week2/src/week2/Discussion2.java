package week2;

import java.util.Scanner;

public class Discussion2 {

	public static void main(String[] args) {
		// This code calculates days until Christmas
		
		Scanner scan = new Scanner(System.in);
		
		int today,xmas,daysleft;
		
		System.out.println("Enter current julian date:  ");
		
		today = scan.nextInt();
		
		System.out.println("The julian date for christmas is:  ");
		
		xmas = scan.nextInt ();
		
		daysleft = today - xmas;
		
		System.out.printf("The number of days until Christmas is %d - %d = %d days", today,xmas,daysleft);
		
		scan.close();

	}

}
