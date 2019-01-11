package inheritance;

public class Parallelogram extends Quadrilateral {
	private double height;

	public Parallelogram() {
		super();
	}

	public Parallelogram(double x1, double x2, double h) {
		super(x1, x2, x1, x2);
		height = h;
	}

	public double area() {
		return super.getSide1() * height;
	}
}
