
/**
 * CMIS 141/4025
 * WilliamHoltAssignment3.java
 * @author William Holt
 * @date 131821Rsep22 (DDHHMMZmmmYY)
 */

package week2;

import java.util.Scanner;

public class WilliamHoltAssignment3 
{

	public static void main(String[] args) 
	{
		
		Scanner YesNo = new Scanner(System.in); //Creates new scanner called YesNo
		String name; //Creates string name
		int L1 = 0,L2 = 0,L3 = 0,ES = 0; //Creates XP inputs for L1 L2 L3 L4
		
		System.out.println("Welcome to the Total XP calculation program!"); //Prints welcome to user
		System.out.println(""); //Creates a space for formatting
		System.out.print("Do you want to enter gamer's data? Yes/No => "); //Prompts user to begin
		
			while(true) //Creates infinite while loop
			{
		
				String yesno = YesNo.next(); //Looks for users input
				
				if(yesno.equalsIgnoreCase("Yes")) //Begins program without case limits
				{
					System.out.print("Enter gamer's name => "); //Prompts for name
					name = YesNo.next(); //Looks for first word
					name += YesNo.nextLine(); //Looks for after first word and adds it
					System.out.print("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES => "); //Prompts user to enter XP
					L1 = YesNo.nextInt(); L2 = YesNo.nextInt(); L3 = YesNo.nextInt(); ES = YesNo.nextInt(); //Reads and stores user input
					double score = L1+L1*0.20+L2+L2*0.30+L3+L3*0.50+ES+ES*0.60; //Calculates XP score after bonuses
					System.out.println(""); //Creates a space for formatting
					int realscore = (int) score; //Converts double score to int realscore to remove decimal
                    System.out.println("Gamer Name: " + name + " L1="+L1+" L2="+L2+" L3="+L3+" ES="+ES); //Prints results
                    
                    System.out.println("Final XP score with bonuses="+realscore); //Prints calculation that was converted
                    System.out.println(""); //Creates a space for formatting
                    System.out.print("Do you want to enter another gamer's data? Yes/No => "); //Prompts user to continue or end
                    System.out.print(""); //Creates a space for formatting
				}
				
					else if(yesno.equalsIgnoreCase("No"))  //Ends program without case limits
					{
					System.out.print("\n"); //Creates a newline for formatting
					System.out.println("Thank you for using the Total XP calculation program!");
					break;
					}
					else //Any output other than Yes/No restarts loop
					{
                    System.out.println("Wrong Input.");
					}
			}
	}
}