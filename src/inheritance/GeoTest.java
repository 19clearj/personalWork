package inheritance;

import java.util.ArrayList;

public class GeoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Geo> geo = new ArrayList<Geo>();
		for (int x = 0; x < 100; x++) {
			if (x < 50) {
				geo.add(new Rectangle());
			} else {
				geo.add(new Trapezoid());
			}
		}

	}

}
