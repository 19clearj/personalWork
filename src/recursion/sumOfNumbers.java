package recursion;

public class sumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNumbers(10));
	}

	public static int sumOfNumbers(int num) {
		if (num > 0) {
			return num + sumOfNumbers(num - 1);

		}
		return 0;
	}
}

