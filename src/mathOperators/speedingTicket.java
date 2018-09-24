package mathOperators;
import java.util.Scanner;
public class speedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int speedlimit = 0;
int driversspeed = 0;
int ticket = 0;
System.out.println("What is the speed limit?");
speedlimit = input.nextInt();
System.out.println("What is the speed of the driver?");
driversspeed = input.nextInt();
driversspeed = driversspeed - 1;
ticket = 55 + 40*(driversspeed - speedlimit);
System.out.println("The price of the speeding ticket is $" + ticket + ".");


	}

}
