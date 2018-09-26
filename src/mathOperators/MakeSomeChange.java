package mathOperators;
import java.util.Scanner;
public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double initialvalue = 0.0;
		double newvalue = 0.0;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickles = 0;
		int pennies = 0;
		final int DOLLAR = 100;
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKLE = 5;
		final int PENNY = 1;
		System.out.println("How much money would you like to make change for?");
		initialvalue = input.nextDouble();
		newvalue = (initialvalue*100.0);
		dollars = (int)(newvalue/DOLLAR);
		newvalue = (newvalue-dollars*DOLLAR);
		quarters = (int)(newvalue/QUARTER);
		newvalue= (newvalue-quarters*QUARTER);
		dimes = (int)(newvalue/DIME);
		newvalue = (newvalue-dimes*DIME);
		nickles = (int)(newvalue/NICKLE);
		newvalue = (newvalue-nickles*NICKLE);
		pennies = (int)(newvalue/PENNY);
		System.out.println("You will have " + dollars + " dollar bill(s).");
		System.out.println("You will have " + quarters + " quarter(s).");
		System.out.println("You will have " + dimes + " dime(s).");
		System.out.println("You will have " + nickles + " nickele(s).");
		System.out.println("You will have " + pennies + " penny(s).");
		
		
		
		
	input.close();	
	}

}
