package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Contains 3 methods that will perform different functions using
 * GenericCollections.
 * 
 * @author melissamoffitt
 *
 */ 
public class GenericCollections {

	/**
	 * Creates a new list based on outlined rules 
	 * 
	 * @param list
	 * @return
	 */
	public static List<String> lettersAndNumbers(List<Character> list) {
		List<String> strList = new ArrayList<>();

		// Empty lists return empty strings
		if (list.isEmpty() == true) {
			return strList;
		}
		// Null should return null
		if (list.contains(null)) {
			return null;
		}

		// lowercase letters are appended a L() and uppercase a U()
		for (int i = 0; i < list.size(); i++) {
			// checks if character is a letter or a number
			if (Character.isLetterOrDigit(list.get(i))) {
				// checks if char is a letter
				if (Character.isLetter(list.get(i))) {
					// checks if letter is lowercase
					if (Character.isLowerCase(list.get(i))) {
						strList.add("L(" + list.get(i).toString() + ")");
					}
					if (Character.isUpperCase(list.get(i))) {
						String upperToLower = list.get(i).toString();
						strList.add("U(" + upperToLower.toLowerCase() + ")");
					}
				}
				// formats if number
				if (Character.isDigit(list.get(i))) {
					strList.add("N(" + list.get(i).toString() + ")");
				}
			}
		}
		// List is in reverse order
		Collections.reverse(strList);
		return strList;
	}

	/**
	 * changes the list by applying a number of changes based on set of rules
	 * 
	 * @param list
	 * @return
	 */

	public static int modify(List<Integer> list) {
		if (list.contains(null)) {
			throw new NullPointerException("list cannot be null");
		}

		// Add the first 5 multiples of 4,5, and 6
		for (int i = 4; i < 7; i++) {
			for (int j = 1; j <= 5; j++) {
				list.add(i * j);
			}
		}

		// Delete all multiples of 3
		list.removeIf(el -> el % 3 == 0);

		// Create set to remove duplicates
		Set<Integer> uniqueList = new HashSet<>(list);

		// Sort in ascending order
		list = new ArrayList<Integer>(uniqueList);

		Collections.sort(list);
		System.out.println(list);
		return list.size();
	}

	/**
	 * Removes every nth element
	 * 
	 * @param list
	 * @param n
	 */
	public static void removeEveryNthElement(List<?> list, int n) {
		List<Integer> index = new ArrayList<>();
		// n <= 0 IllegalArgumentException is thrown with message
		if (n <= 0) {
			throw new IllegalArgumentException("n must be greater than 0");
		}
		// if null NullPointerException is thrown with message
		if (list.contains(null)) {
			throw new NullPointerException("list cannot be null");
		}

		if (n <= list.size()) {
			// Remove object of specific position
			for (int i = n; i <= list.size(); i += n) {
				index.add(i);
			}
		}
		index.forEach(el -> list.remove(el));
	}
}
