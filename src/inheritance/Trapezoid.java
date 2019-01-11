package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
	private double height;

	public Trapezoid() {
		super();
		height = 10;

	}

	public Trapezoid(double s1, double s2, double s3, double s4, double h) {
		super.setSide1(s1);
		super.setSide2(s2);
		super.setSide3(s3);
		super.setSide4(s4);
		height = 5;

	}

	public double area() {
		return (((super.getSide4() * super.getSide2())/ 2) * height);
	}
}
