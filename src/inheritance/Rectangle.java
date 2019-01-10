package inheritance;

public class Rectangle extends Quadrilateral {

	public Rectangle() {
		Quadrilateral bob = new Quadrilateral();
		bob.setSide1(10.0);
		bob.setSide2(10.0);
		bob.setSide3(20.0);
		bob.setSide4(20.0);
	}

	public Rectangle(double x1, double x2) {
		Quadrilateral bob = new Quadrilateral();
		if (x1 != x2) {
			bob.setSide1(x1);
			bob.setSide2(x1);
			bob.setSide3(x2);
			bob.setSide4(x2);

		}
	}

	public double area() {
		Quadrilateral bob = new Quadrilateral();
		return bob.getSide1() * bob.getSide3();
	}
}
