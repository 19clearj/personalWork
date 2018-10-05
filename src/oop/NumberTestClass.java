package oop;

public class NumberTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Numbers bob = new Numbers();
bob.sayNumber(7.5);
bob.sayNumberPlus2(7.5);
bob.saySum(1.5, 2.5);
double num = bob.returnSquare(4.0);
System.out.println("Your number is " + num);
double area = bob.returnArea(4.0, 5.0);
System.out.println("The area is " + area);
int round = bob.returnRoundUp(4.3);
System.out.println("Your number rounded is " + round);
	}

}
