package week2;

import java.util.Scanner;

public class ecercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter two integers separated by space:  ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		num1++;
		num2++;
		
		System.out.println("After increment current values are:");
		System.out.println(num1);
		System.out.println(num2);
		
		scan.close();
	}

}
