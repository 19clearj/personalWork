package inheritance;

public class Rectangle extends Parallelogram implements Geo{

	public Rectangle() {
		super();

	}

	public Rectangle(double x1, double x2) {
		super(x1, x2, x1);

	}

	public double area() {

		return super.getSide1() * super.getSide2();
	}

}
