package labCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a list of numbers to review
 * the forEach and lambda expressions.
 * @author melissamoffitt
 *
 */
public class Warmup {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		for (int i = 2; i <= 50; i += 2) {
			numbers.add(i);
		}
		printNumbers(numbers, "numbers");

		System.out.println("\nRemoving multiples of three...");

		numbers.removeIf(el -> el % 3 == 0);

		printNumbers(numbers, "numbers");
	}

	private static void printNumbers(List<Integer> numbers, String label) {
		System.out.print(label + ": ");
		numbers.forEach(el -> System.out.print(el + " "));
	}

}
