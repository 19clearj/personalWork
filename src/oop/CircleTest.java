package oop;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleClass bob = new CircleClass();
		System.out.println("Ball raidus:" + bob.getRadius());
		System.out.println("Ball circumference:" + bob.circumference());
		System.out.println("Ball area:" + bob.area());
		bob.setRadius(7.2);
		System.out.println("Ball radius:" + bob.getRadius());
		
		//constructor that uses alternate constructor
		bob = new CircleClass(12.25);
		System.out.println("Ball radius:" + bob.getRadius());
		System.out.println("Ball circumference:" + bob.circumference());
		System.out.println("Ball area:" + bob.area());
		bob.setRadius(7.2);
		System.out.println("Ball radius:" + bob.getRadius());
		
		
		
		
	}

}
