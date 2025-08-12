package FunctionalInterface;

public class FunctionalInterfaceEx {
	public static void main(String[] args) {

		new Thread(() -> System.out.println("New Thread Created")).start();

	}
}
