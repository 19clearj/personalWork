package inheritance;

public class Quadrilateral {
	private double side1;
	private double side2;
	private double side3;
	private double side4;

	public Quadrilateral() {
		side1 = 10.0;
		side2 = 10.0;
		side3 = 10.0;
		side4 = 10.0;
	}

	public Quadrilateral(double x1, double x2, double x3, double x4) {
		side1 = x1;
		side2 = x2;
		side3 = x3;
		side4 = x4;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getSide4() {
		return side4;
	}

	public void setSide1(double x1) {
		side1 = x1;
	}

	public void setSide2(double x2) {
		side1 = x2;
	}

	public void setSide3(double x3) {
		side1 = x3;
	}

	public void setSide4(double x4) {
		side4 = x4;
	}

	public double perimeter() {
		return side1 + side2 + side3 + side4;
	}

	public String toString() {
		return "Quadrilateral object: Side one: " + side1 + " Side two " + side2 + " Side three: " + side3
				+ " Side four: " + side4;
	}

	public boolean equals(Object otherObject) {
		return (this.toString().equals(otherObject.toString()));
	}
	public Object clone(){
		return new Quadrilateral(side1, side2, side3, side4);
	}
}
