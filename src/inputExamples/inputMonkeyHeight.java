package inputExamples;
import java.util.Scanner;
public class inputMonkeyHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double height = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("How tall is the monkey in feet?");
		height = input.nextDouble();
		System.out.println("The height of the monkey is " + height + " feet" );
	}

}
