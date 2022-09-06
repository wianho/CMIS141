/**
 Developed by: Johnathan Pipes (Replied to by William Holt)
 Date: 5 SEP 2022
 Description: This program will determine how long you need to microwave a frozen burrito up to a maximum of 3 burritos.
 Assignment: Week 3 Discussion Post.
*/

import java.util.Scanner;// Importing the scanner class
public class ReplyToJohnathonPipes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Initializing the scanner
        System.out.println("Welcome to the burrito-matic. This calculator will determine how long you need to microwave a frozen burrito up to a maximum of 3 burritos. ");// Welcome statement for program.
        System.out.println("Do you like burritos? (true or false)"); 
        boolean enjoy = input.nextBoolean();        
        if (enjoy == true)
        	System.out.println("I enjoy burritos too!");
        if (enjoy == false)
        {	
        	System.out.println("Your cross to bear.");
        	System.exit(0);
        }	
        System.out.println("How many burritos do you have?"); 
        int burritoNum = input.nextInt();// Getting user inputs.        
        if (burritoNum == 1) {
            System.out.println("Put burrito on 50% power for 2 minutes. Flip and continue on high for 2 minutes. ");
        } else if (burritoNum == 2) {
            System.out.println("Put burrito on 50% power for 3 minutes. Flip and continue on high for 3 minutes 15 seconds. ");
        } else if (burritoNum == 3) {
            System.out.println("Put burrito on 50% power for 4 minutes. Flip and continue on high for 4 minutes 50 seconds. ");
        } else
            System.out.println("You have entered an invalid amount of burritos! ");// This line negates any inputs not between 1 & 3.
        input.close();        }
    }

