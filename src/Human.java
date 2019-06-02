public class Human {

	String name;

	public static void main(String[] args) {
		Computer computer = new Computer();

		computer.setKeyBoard("ASCII");
		String s = computer.getKeyBoard();
		System.out.println(s);
	}

}
