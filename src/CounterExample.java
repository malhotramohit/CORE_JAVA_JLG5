
public class CounterExample { // count = 3

	static int count = 0; // instance var

	void increment() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {

		CounterExample counterExample1 = new CounterExample(); // 
		counterExample1.increment();

		CounterExample counterExample2 = new CounterExample(); // 
		counterExample2.increment();

		CounterExample counterExample3 = new CounterExample(); // count = 0
		counterExample3.increment();

	}
}
