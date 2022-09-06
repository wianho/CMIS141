import java.util.Scanner;

public class Asg2good {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);// to take user input
System.out.print("Enter two integer numbers separated by space: ");
String userInput = sc.nextLine();// store the user input in a String
// parse the userinput into numerical values
// we are splitting here by space and parsing them
int num1 = Integer.parseInt(userInput.split(" ")[0]);
int num2 = Integer.parseInt(userInput.split(" ")[1]);
int result = 0;// to store the result
System.out.print("Enter operation symbol (+, -, *, or /): ");
String operatorEntered = sc.nextLine();// store the operator entered by user
// check for valid operator entered by user
if (operatorEntered.equals("+") || operatorEntered.equals("-") || operatorEntered.equals("*")
|| operatorEntered.equals("/")) {
// do the operation and store the result
if (operatorEntered.equals("+")) {
result = num1 + num2;
} else if (operatorEntered.equals("-")) {
result = num1 - num2;
} else if (operatorEntered.equals("*")) {
result = num1 * num2;
} else {
result = num1 / num2;
}
} else {
// for an invalid operator entered
// display a message and exit
System.out.println("Not a valid operation symbol");
System.exit(0);
}
// display the evaluation done.
System.out.println("Evaluation: " + num1 + " " + operatorEntered + " " + num2 + " = " + result);
sc.close();
}
}