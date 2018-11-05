package decisions;
import java.util.Scanner;
public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number = input.nextInt();
		double biggest = 0.0;
		System.out.println("Please enter another number to multiply by 2. (999 to quit)");
		number = input.nextInt();
		while (number != 999) {
			if(biggest> number){
		biggest = number *2;
		System.out.println("Please enter another number to multiply by 2. (999 to quit)");
		number = input.nextInt();
			}
			else 
				number = number *2;
			System.out.println("Your number times 2 is " + number);
			System.out.println("Please enter another number to multiply by 2. (999 to quit)");
			number = input.nextInt();
		}
		System.out.println("The largest number you entered is " + biggest);
		}
}
