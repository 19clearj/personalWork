package inputExamples;

import java.util.Scanner;

public class InputVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean answer = false;
		Scanner input = new Scanner(System.in);
		System.out.println("True or false? Did you vote?");
		answer = input.nextBoolean();
		System.out.println( "Did you vote?" + '\n' + answer );
	

}
}