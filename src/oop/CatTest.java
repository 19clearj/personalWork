package oop;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat bob = new Cat();
		bob.setAge(7);
		bob.setSleep(8);
		System.out.println("Cat age:" + bob.getAge());
		System.out.println("Age after birthday:" + bob.birthday());
		System.out.println("Amount of sleep cat gets:" + bob.getSleep() + "hours");
		System.out.println("Cat sleep more:" + bob.sleepMore() + "hours");
		System.out.println("Cat sleep less:" + bob.sleepLess() + "hours");
		}

}
