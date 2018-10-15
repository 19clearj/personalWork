package oop;
import java.util.Scanner;
public class AreaConstructor {

public AreaConstructor() {
		
	}
public void area(){
 Scanner input = new Scanner(System.in);
 double length = 0.0;
 double height = 0.0;
 double area = 0.0;
System.out.println("What is the length of the wall?");
length = input.nextDouble();
System.out.println("What is the height of the wall?");
height = input.nextDouble();
area = length*height;
System.out.println("The area of the wall is " + area);

	}
public void areaWithDoor(){
Scanner input = new Scanner(System.in);
double length = 0.0;
double height = 0.0;
double dlength = 0.0;
double dheight = 0.0;
double darea = 0.0;
double area = 0.0;
System.out.println("What is the length of the wall?");
length = input.nextDouble();
System.out.println("What is the height of the wall?");
height = input.nextDouble();
System.out.println("What is the length of the door?");
dlength = input.nextDouble();
System.out.println("What is the height of the door?");
dheight = input.nextDouble();
area = length*height;
darea= dlength*dheight;
area = (area)-(darea);
System.out.println("The area of the wall without the door " + area);

}
}
