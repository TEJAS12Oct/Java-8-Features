package LambdaExpression;

import java.util.ArrayList;

public class SingleParamterClass {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(15);
		al.add(17);
		al.add(20);
		al.add(23);
		al.add(25);
		al.add(30);

		System.out.println("Array List : " + al);

		al.forEach(n -> System.out.println(n));

		al.forEach(n -> {
			if (n % 2 == 0)
				System.out.println("EVEN NO : " + n);
		});
	}
}
