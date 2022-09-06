
// importing required classes
import java.util.Scanner;

// creating class named IfElse
public class IfElse {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // declare int variable n
        int n;
        // creating scanner object from class Scanner
        Scanner scanner = new Scanner(System.in);
        // display output for asking user input
        System.out.println("Enter Number : ");
        // getting user input and store it in n variable
        n = scanner.nextInt();
        // checks if n modulus 2 is equal to 0
        if (n%2==0)
        // display even output
            System.out.println("It's an Even number.");
        // otherwise
        else
        // display Odd output
            System.out.println("It's an Odd number.");
        //close scanner
        scanner.close();
    }
    
}
