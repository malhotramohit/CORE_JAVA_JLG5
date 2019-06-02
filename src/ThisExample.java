
public class ThisExample {

	int age = 23;

	ThisExample() {
		this(45);
	}

	ThisExample(int age) {

		System.out.println("I am a one arg cons");
		this.age = age;
	}

	void test() {
	}

	public void setAge(int age) {
		this.age = age;
		this.test();
		System.out.println("age inside setAge method " + this.age);
	}

	public static void main(String[] args) {

		ThisExample obj = new ThisExample();

		obj.setAge(25);

		ThisExample obj1 = new ThisExample();

		obj1.setAge(26);

		obj.setAge(28);

		ThisExample obj2 = new ThisExample(2);

		// System.out.println(obj.age);

	}

}
