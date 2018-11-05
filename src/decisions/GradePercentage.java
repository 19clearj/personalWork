package decisions;

import java.util.Scanner;

public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What is the score of your first test");
		double test1 = input.nextDouble();
		System.out.println("What is the score of your second test?");
		double test2 = input.nextDouble();
		System.out.println("What is the score of your third test?");
		double test3 = input.nextDouble();
		double sum = test1+test2+test3; 
		double average = sum/3;
		System.out.println("did you do extra credit? (true or false)");
		boolean answer = input.nextBoolean();
		if (answer == true)
		{
			System.out.println("How many points did you earn for extra credit?");
			double extra = input.nextDouble();
			average = (sum+ extra)/3;
			System.out.println( "Your average score is" + average);
		}
	}


}
