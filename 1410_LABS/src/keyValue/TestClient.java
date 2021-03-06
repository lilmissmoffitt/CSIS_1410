package keyValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The TestClient class adds key value pairs to their respective list or set. It
 * will then output the formatted KeyValuePairs. This tests the KeyValuePair class.
 * 
 * @author melissamoffitt
 *
 */
public class TestClient {

	public static void main(String[] args) {
		// Part One
		System.out.println("Part 1:");
		System.out.println("---------");

		KeyValuePair<String, Integer> p1 = new KeyValuePair<String, Integer>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair<String, Integer>("NY", 8244910);
		KeyValuePair<String, Integer> p3 = p2;

		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p1.equals(p2): " + p1.equals(p2) + "\n");
		System.out.println("p3: " + p3);
		System.out.println("p2.equals(p3): " + p2.equals(p3));

		// Part Two
		System.out.println("\n\nPart 2:");
		System.out.println("---------");

		KeyValuePair<String, Integer> p4 = new KeyValuePair<String, Integer>("LA", 3819702);
		KeyValuePair<String, Integer> p5 = new KeyValuePair<String, Integer>("SF", 812826);

		List<KeyValuePair<String, Integer>> cities = new ArrayList<>();
		Collections.addAll(cities, p1, p2, p3, p4, p5);
		System.out.println("Original List:");
		cities.forEach(el -> System.out.println(el.toString()));
		System.out.println("\nSorted List:");
		Collections.sort(cities);
		cities.forEach(el -> System.out.println(el.toString()));

		// Part Three
		System.out.println("\n\nPart 3:");
		System.out.println("---------");
		System.out.println("Cities with margin 5:");
		printWithMargin(cities, 5);

		Set<KeyValuePair<Integer, String>> countryCodes = new HashSet<KeyValuePair<Integer, String>>();
		KeyValuePair<Integer, String> p6 = new KeyValuePair<Integer, String>(30, "Greece");
		KeyValuePair<Integer, String> p7 = new KeyValuePair<Integer, String>(33, "France");
		KeyValuePair<Integer, String> p8 = new KeyValuePair<Integer, String>(43, "Austria");
		Collections.addAll(countryCodes, p6, p7, p8);

		System.out.println("\nCountry codes with margin 3:");
		printWithMargin(countryCodes, 3);
	}

	/**
	 * Prints out each element in the provided collection with the provided margin
	 * spacing
	 * 
	 * @param <T>
	 * @param collection
	 * @param indentation
	 */
	public static <T> void printWithMargin(Collection<T> collection, int indentation) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < indentation; i++) {
			sb.append(" ");
		}
		collection.forEach(el -> System.out.println(sb.toString() + el));
	}

}
