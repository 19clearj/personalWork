package mathOperators;

import java.util.Scanner;

public class mathOperatorsAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = -999;
int future = -999;
Scanner input = new Scanner(System.in);
age = input.nextInt();
System.out.println("What is your age?");
future = age + 7; 
System.out.println("In seven years you will be " + future + " years old.");

	}

}
