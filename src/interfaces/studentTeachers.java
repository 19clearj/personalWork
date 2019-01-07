package interfaces;

import java.util.ArrayList;

public class studentTeachers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<School> school = new ArrayList<School>();
		Student a = new Student();
		Student b = new Student();
		Teacher c = new Teacher();
		Teacher d = new Teacher();
		a.setName("Billy Bobbby");
		b.setName("Joseph Cleary");
		c.setName("R");
		d.setName("B");
		school.add(a);
		school.add(b);
		school.add(c);
		school.add(d);
		for (School name : school) {
			System.out.println(name.getName());
		}
		System.out.println("Names with more than 10 letters:");
		for (School name : school) {
			if (name.getName().length() - 1 > 10) {
				System.out.println(name.getName());
			}
		}

		for (School x : school) {
			if (x instanceof Student) {
				Student bob = (Student) x;
				bob.outSick();

			}
			System.out.println(x);
		}

	}

}
