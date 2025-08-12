package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfceAcceptEx {
	public static void main(String[] args) {

		Consumer<Integer> Display = a -> System.out.println("Display : " + a);
		Display.accept(333);

		Consumer<List<Integer>> ModifyList = L -> {
			for (int i = 0; i < L.size(); i++) {
				L.set(i, 4 * L.get(i));
			}
		};

		Consumer<List<Integer>> DisplayList = L -> L.stream()
				.forEach(T -> System.out.println("DisplayList After Mofication : " + T));

		List<Integer> L = new ArrayList<>();
		L.add(10);
		L.add(20);
		L.add(5);
		System.out.println("List Print : " + L);

		ModifyList.accept(L);
		DisplayList.accept(L);

	}
}
