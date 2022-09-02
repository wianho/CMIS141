/**
 * CMIS141 Discussion 3
 * @version 1.0.0 2022-08-31
 * @author Michael Ragan
 * 
 * Java program that uses if-else statements to perform a basic banking transaction based on user input
 */

 import java.util.Scanner;

 public class Dsc3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //initialize bank account balances
        float currentBalance = 0;   // initial balance set to 0
        float newBalance = 0;       // final balance, after deposit or withdrawal, set to 0

        System.out.println("[+] Welcome to the Bank App!");
        System.out.println("[+] This program will accept your current balance and allow you to withdraw or deposit money into your account.");
        
        //obtain information from user, check for valid inputs
        System.out.printf("\t[-] What is your starting balance?\n\t  >> ");
        currentBalance = scanner.nextFloat();
        scanner.nextLine();     //throwaway scanner.nextLine() to avoid nextLine() trap

        //evaluate user input for currentBalance. If greater than 0, allow user to choose a transaction to make. Otherwise, inform user that they have insufficient funds
        if (currentBalance > 0) {
            System.out.printf("[+] Your starting balance is %.2f...\n", currentBalance);
            System.out.printf("\t[-] Would you like to deposit into or withdraw from your account (Please select withdraw or deposit)?\n\t  >> ");
            
            String transactionType = scanner.nextLine();
            transactionType = transactionType.toLowerCase(); // converts transactionType to lower case if the user did not enter it in all lowercase letters

            // evaluate transactionType to determine what type of transaction the user wants to make
            if (transactionType.equals("withdraw")) {
                    System.out.printf("\t[-] You have chosen to withdraw from your account. How much would you like to withdraw?\n\t  >> ");
                    float amtToWithdraw = scanner.nextFloat();
                    newBalance = (currentBalance - amtToWithdraw);
            } else if (transactionType.equals("deposit")){
                System.out.printf("\t[-] You have chosen to deposit into your account. How much would you like to deposit?\n\t  >> ");
                float amtToDeposit = scanner.nextFloat();
                newBalance = (currentBalance + amtToDeposit);
            } else {
                System.out.printf("\t[!] Sorry, %s is not a valid input!\n", transactionType);
            } 
            
            // check to make sure that balance is still greater than 0. If not, inform user that they have overdrafted
            if (newBalance > 0){
                System.out.printf("[+] Thank you for your transaction. Your current balance is %.2f!\n", newBalance);
            } else if (newBalance < 0){
                System.out.printf("[!] Oops! You've overdrafted! Your balance is now %.2f!\n", newBalance);
            } else {
                System.out.printf("[+] Your current balance is $0.00. Have a nice day!\n");
            }
        } else {
            System.out.println("[!] Insufficient funds!");
        }

        scanner.close();    //close scanner to avoid resource leaks

    }
 }