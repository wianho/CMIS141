package week2;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter two numbers separated by space:  ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		System.out.print(num1 + " * " + num2 + " = " + (num1*num2));
		
		scan.close();
	}

}
