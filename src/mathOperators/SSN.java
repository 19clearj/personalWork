package mathOperators;
import java.util.Scanner;
public class SSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ssn = 0;
		int age = 0;
		int years = 0;
		int four = 0;
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("What is your social security number?");
		ssn = input.nextInt();
		four = (ssn%10000);
		years = (18-age);
		System.out.println("You are " + age + " years old.");
		System.out.println("In " + years + " years you will be 18 years old.");
		System.out.println("The last four digits of your SSN is " + four);
	}

}
