package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInnterfaceAndThenEx {
	public static void main(String[] args) {

		Consumer<List<Integer>> ModifyList = L -> {
			for (int i = 0; i < L.size(); i++) {
				L.set(i, 2 * L.get(i));
			}
		};

		Consumer<List<Integer>> DisplayList = L -> L.stream().forEach(T -> System.out.println("DisplayList :  " + T));

		List<Integer> L = new ArrayList<>();
		L.add(10);
		L.add(15);
		L.add(30);
		L.add(30);

		System.out.println("List Print : " + L);
		
		ModifyList.andThen(DisplayList).accept(L);
	}
}
