package FunctionalInterface;

import java.util.function.Function;

public class FIIndentify {

	public static void main(String args[])
    {
        // Function which takes in a number and
        // returns it
        Function<Integer, Integer> i = Function.identity();

        System.out.println(i.apply(10));
    }
}
