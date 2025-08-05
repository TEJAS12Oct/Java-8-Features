package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {

		// 1. From a Collection (like List)
		List<String> names = Arrays.asList("Tejas", "Amit", "Ravi");
		Stream<String> nameStream = names.stream();
		nameStream.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// 2. From an Array
		String[] arr = { "a", "b", "c" };
		Stream<String> arrStream = Arrays.stream(arr);
		arrStream.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// 3. Using Stream.of()
		Stream<Integer> numberStream = Stream.of(1, 2, 3, 4);
		numberStream.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// 4. Using Stream Builder
		Stream<String> builderStream = Stream.<String>builder().add("One").add("Two").add("Three").build();
		builderStream.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// 5. Infinite Streams
//		Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2);
//		evenStream.forEach(s -> System.out.print(s + " "));
//		System.out.println();
//
//		Stream<Double> randomStream = Stream.generate(Math::random);
//		randomStream.forEach(s -> System.out.print(s + " "));
//		System.out.println();
	}
}
