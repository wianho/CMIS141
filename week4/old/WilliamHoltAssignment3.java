package week2;

import java.util.Scanner;

public class WilliamHoltAssignment3 {

	public static void main(String[] args) {
		
		Scanner YesNo = new Scanner(System.in);
		String name;
		double L1 = 0.0,L2 = 0.0,L3 = 0.0,ES = 0.0;
		
			while(true){
		
				System.out.println("Welcome to the Total XP calculation program!");
				System.out.println("Do you want to enter gamer's data? Yes/No =>");
		
				String yesno = YesNo.next();
				if(yesno.equals("yes")){
					System.out.println("Enter gamer's name =>");
					System.out.println("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES =>");
				}
				else if(yesno.equals("no")) {
					System.out.println("Thank you for using the Total XP calculation program!");
				}
		
		System.out.println("Gamer Name:");
		
		
		
	}
	}
}