/**
* CMIS 141/4025
* Discussion4
* @date 101514Rsep22 (DDHHMMZmmmYY)
* @author William Holt
* Java program that illustrates while loop
*/

import java.util.*;

public class HoltWilliamDiscussion4A 
{

	public static void main(String[] args) 
	{
		// open scanner named scan
		Scanner scan = new Scanner(System.in); // standard input	
		int n,i=0;	
		// prints statement
		System.out.print("Print from 1 to number entered here -> ");
		// reads input from user
		n = scan.nextInt();
		// while loop
		while(i<n)
		{
			// prints number from 1 to n
			System.out.println(i+1);
			//increment of i
			i++;
		}
		
	scan.close();
	} // end main()

} // end class 