package oop;

public class TrapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trap bob = new Trap();
bob.setBase1(10.0);
bob.setBase2(8.0);
bob.setHeight(5.0);
bob.setLeg(4.0);
System.out.println("Base one length:" + bob.getBase1());
System.out.println("Base two length:" + bob.getBase2());
System.out.println("Height:" + bob.getHeight());
System.out.println("Leg length:" + bob.getLeg());
System.out.println("Perimeter:" + bob.perimeter());
System.out.println("Area:" + bob.area());
	}

}
