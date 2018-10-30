package decisions;
import java.util.Scanner;
public class WhileLoopCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: (enter -1 to quit)");
		int number = input.nextInt();
	while	(number != -1){
		System.out.println(number*number*number);
		System.out.println("Enter an integer: (enter -1 to quit)");
		number= input.nextInt();
	}
	
	}

}
