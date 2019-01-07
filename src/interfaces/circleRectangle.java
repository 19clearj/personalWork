package interfaces;

import java.util.ArrayList;

public class circleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		double total = 0;
		double smallest = 1000;
		Rectangle a = new Rectangle(5, 8);
		Circle b = new Circle(10);
		Rectangle c = new Rectangle(5, 9);
		Circle d = new Circle(11);
		Rectangle e = new Rectangle(5, 10);
		Circle f = new Circle(12);

		shapes.add(a);
		shapes.add(b);
		shapes.add(c);
		shapes.add(d);
		shapes.add(e);
		shapes.add(f);

		for (int x = 0; x < shapes.size(); x++) {
			total = total + shapes.get(x).area();
		}
		for (Shape p : shapes) {
			if (p.perimeter() < smallest) {
				smallest = p.perimeter();
			}
		}
		System.out.println(total);
		System.out.println(smallest);
		;
	}

}
