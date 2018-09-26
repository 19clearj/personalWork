package mathOperators;
import java.util.Scanner;
public class MoreCuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double mowerdeck = 0.0;
		double yardarea = 0.0;
		double cost = 0.0;
		double mph = 0.0;
		final int COST = 12;
		double feetperhour = 0.0;
		double time = 0.0;
		double money = 0.0;
		System.out.println("What is the length of the yard in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the yard in feet?");
		width = input.nextDouble();
		System.out.println("What is the width of the mowerdeck in inches?");
		mowerdeck = input.nextDouble();
		System.out.println("What is the speed of the mower in MPH?");
		mph = input.nextDouble();
		yardarea = length*width;
		feetperhour = (mph*5280.0)*(mowerdeck/12.0);
		time = yardarea/feetperhour;
		money= COST*time;
		System.out.println("The time it will take to mow the lawn is " + time + " hours.");
		System.out.println("The amount of money owed is " + money + " dollars.");
		
		
		
	}

}

