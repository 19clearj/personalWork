package oop;

public class RightTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RightTriangle bob = new RightTriangle();
bob.setBase(3.0);
bob.setHeight(4.0);
System.out.println("Base:" + bob.getBase());
System.out.println("Height:" + bob.getHeight());
System.out.println("Hypot:" + bob.hypot());
System.out.println("Perimeter:" + bob.perimeter());
System.out.println("Area:" + bob.area());
	
	}

}
