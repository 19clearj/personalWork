package oop;

import java.util.Scanner;

public class Home {
	
	public Home() {
	}
	public void sayArea (){
		Scanner input = new Scanner(System.in);
		 double length = 0.0;
		 double height = 0.0;
		 double area = 0.0;
		 double time = 0.0;
		System.out.println("What is the length of the wall?");
		length = input.nextDouble();
		System.out.println("What is the height of the wall?");
		height = input.nextDouble();
		area = length*height;
		time = (area/200);
		System.out.println("I will take " + time + " hours.");
	}

}
