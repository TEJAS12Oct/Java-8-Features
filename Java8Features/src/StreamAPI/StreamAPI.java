package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		List<Integer> List1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 91, 92, 93, 94, 95);
		System.out.println("List Of Array : " + List1);

		List<Integer> List2 = List1.stream().filter(T -> T % 2 == 0).collect(Collectors.toList());
		System.out.println("EVEN NO : " + List2);

		List<Integer> List3 = List1.stream().map(T -> T * T).collect(Collectors.toList());
		System.out.println("Square : " + List3);

		List<String> List4 = Arrays.asList("Tejas", "Satish", "Jawale", "Aniket", "Harsha", "Janhvi", "Tanu");
		List<String> List5 = List4.stream().filter(S -> S.startsWith("T")).collect(Collectors.toList());
		System.out.println("Start With T : " + List5);

		List1.stream().map(s -> s + " ").filter(s -> s.startsWith("1")).forEach(System.out::println);

	}

}
