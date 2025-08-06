package LambdaExpressionCollections;

import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {

		TreeMap<Integer, String> TM = new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		TM.put(8, "TEJAS");
		TM.put(6, "Aniket");
		TM.put(4, "Harsha");
		TM.put(2, "Nikita");
		TM.put(5, "Janhvi");
		TM.put(3, "Rutuja");
		TM.put(7, "Pallavi");
		TM.put(1, "Ashish");

		System.out.println("Descending Order TreeSet: " + TM);

	}
}
