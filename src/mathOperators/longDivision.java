package mathOperators;
import java.util.Scanner;
public class longDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int dividend = 0;
		int divider = 0;
		int answer = 0;
		int remainder = 0;
		System.out.println("What is the dividend?");
		dividend = input.nextInt();
		System.out.println("What is the divider?");
		divider = input.nextInt();
		answer = dividend/divider;
		remainder = dividend % divider; 
		System.out.println("The answer is " + answer + "r" + remainder + ".");
	}

}
