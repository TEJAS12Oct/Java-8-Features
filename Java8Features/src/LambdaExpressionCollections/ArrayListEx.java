package LambdaExpressionCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListEx {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(20);
		al.add(3);
		al.add(99);
		al.add(49);
		al.add(9);
		al.add(12);
		al.add(11);

		System.out.println("Arrayslist Element : " + al);

		List<Integer> L3 = al.stream().filter(T -> T < 21).collect(Collectors.toList());
		System.out.println("Less Than 21 : " + L3);

		for (Integer integer : L3) {
			System.out.println("For Each Loop : " + integer);
		}

		Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		System.out.println("Elements of the ArrayList after" + " sorting : " + al);
	}
}
