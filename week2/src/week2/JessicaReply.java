package week2;

import java.util.Scanner;

public class JessicaReply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int amount;
		
		System.out.println("Enter amount of dogs walked: ");
		int dogs1 = scan.nextInt();
		
		System.out.println("Enter price per dog walked: ");
		int price1 = scan.nextInt();
		
		amount= (dogs1*price1);
		
		System.out.printf("The amount earned from walking dogs is %d dollars", amount);
		
		scan.close();
	}

}
