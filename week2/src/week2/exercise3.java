package week2;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence and press enter:  ");
		String str = scan.nextLine();
		
		System.out.println("Your sentence is:");
		System.out.println("   " + str);
		
		scan.close();
	}

}
