package mathOperators;
import java.util.Scanner;
public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double radius = 0.0;
		double yardarea = 0.0;
		double fountainarea = 0.0;
		double cutarea= 0.0;
		double cost = 0.0;
		System.out.println("What is the length of the yard in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the yard in feet?");
		width = input.nextDouble();
		System.out.println("What is the radius of the fountain in feet?");
		radius = input.nextDouble();
		yardarea = length*width;
		fountainarea = Math.PI*radius*radius;
		cutarea= yardarea-fountainarea;
		cost = cutarea *1.25;
		System.out.println("The amount of money owed is " + cost);
		
		
		
	}

}
