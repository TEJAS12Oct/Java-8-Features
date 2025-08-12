package FunctionalInterface;

public class FIAnnotationEx {
	public static void main(String[] args) {

		int b = 3;

		SquareEx S = (n -> n * n);

		int a = S.calculate(b);
		System.out.println(a);
	}
}

@FunctionalInterface
interface SquareEx {
	int calculate(int x);
}
