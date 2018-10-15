package oop;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee bob = new Employee();
bob.getWage();
bob.setWage(14.35);
System.out.println(bob.getWage());
bob.getExperience();
bob.setExperience(5);
System.out.println("The amount of experience bob has is " + bob.getExperience() + " years.");
bob.giveRaise();
System.out.println( "The new wage is $" + bob.getWage());
	}

}
