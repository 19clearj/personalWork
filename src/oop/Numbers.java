package oop;

public class Numbers {
	

	public Numbers (){
	}
		public void sayNumber (double num){
			System.out.println("Your number is: " + num);
			
		}
		public void sayNumberPlus2(double num){
				num = num + 2;
				System.out.println("Your number + 2 is: " + num);
				}
		public void saySum(double num1, double num2){
			double numtotal = num1 + num2;
				System.out.println("The sum of your numbers is: " + numtotal);
				
			}
		public double returnSquare(double num){
			num = num*num;
			return num;
		}
		public double returnArea(double length, double width){
		double area = length*width;
		return area;
		}
		public int returnRoundUp(double num){
			int round = (int)Math.ceil(num);
			return round;
		}
			
		}
