package decisions;
import java.util.Scanner;
public class DoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
System.out.print("Enter an integer number:");
int number = input.nextInt();
int largest = number;
int smallest = number;
int range = 0;
do {
	if(number> largest){
		largest = number;
	}
	else{
		if (number < smallest){
			smallest = number;
		}
	}
	
	System.out.println("Enter a number:(999 to quit)" );
	number = input.nextInt();
	}while (number != 999);
range = largest - smallest;
System.out.println("Range: " + range  );
	}
}
