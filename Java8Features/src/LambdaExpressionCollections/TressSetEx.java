package LambdaExpressionCollections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TressSetEx {
	public static void main(String[] args) {

		TreeSet<Integer> TS = new TreeSet<>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		TS.add(15);
		TS.add(20);
		TS.add(3);
		TS.add(99);
		TS.add(49);
		TS.add(9);
		TS.add(12);
		TS.add(11);

		System.out.println("Descending Order TreeSet: " + TS);

	}
}
