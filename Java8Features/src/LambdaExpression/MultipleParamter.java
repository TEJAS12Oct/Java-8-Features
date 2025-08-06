package LambdaExpression;

public class MultipleParamter {
	public static void main(String[] args) {
		MultiparamterInterfce add = (a, b) -> a + b;
		MultiparamterInterfce multiply = (a, b) -> a * b;

		System.out.println("Add : " + add.operation(3, 5));
		System.out.println("Multiply : " + multiply.operation(3, 5));

	}
}

interface MultiparamterInterfce {
	int operation(int a, int b);
}
