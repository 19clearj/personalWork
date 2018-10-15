package oop;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle bob = new Rectangle();
bob.setLength(8.0);
bob.setWidth(5.0);
System.out.println("Length: " + bob.getLength());
System.out.println("Width: " + bob.getWidth());
System.out.println("Perimeter: " + bob.perimeter());
System.out.println("Area: " + bob.area());

bob = new Rectangle(10, 20);
System.out.println("Length: " + bob.getLength());
System.out.println("Width: " + bob.getWidth());
System.out.println("Perimeter: " + bob.perimeter());
System.out.println("Area: " + bob.area());

	}
}
