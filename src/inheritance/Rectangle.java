package inheritance;

public class Rectangle extends Parallelogram implements Geo {

	public Rectangle() {
		super();

	}

	public Rectangle(double x1, double x2) {
		super(x1, x2, x1);

	}

	public double area() {

		return super.getSide1() * super.getSide2();
	}

	public String toString() {
		return "Rectangle Object: " + super.toString();
	}
	public boolean equals(Object otherObject) {
		return (this.toString().equals(otherObject.toString()));
	}
	public Object clone(){
		return new Rectangle(super.getSide1(), super.getSide2());
	}

}
