package inheritance;

public class Parallelogram extends Quadrilateral {
	private double height;

	public Parallelogram() {
		super();
		height = 10;
	}

	public Parallelogram(double x1, double x2, double h) {
		super(x1, x2, x1, x2);
		height = h;
	}

	public double area() {
		return super.getSide1() * height;
	}

	public String toString() {
		return "Parallelogram Object: height : " + height + super.toString();
	}
	public boolean equals(Object otherObject) {
		return (this.toString().equals(otherObject.toString()));
	}
	public Object clone(){
		return new Parallelogram(super.getSide1(), super.getSide2(), height);
	}
}
