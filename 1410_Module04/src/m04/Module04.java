package m04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Module04 class contains the method transform which shows the functionality of
 * wrapper classes, uses generic collections, and the functionality provided for
 * generic collections.
 * 
 * @author melissamoffitt
 *
 */
public class Module04 {
	/**
	 * returns a list of doubles after after performing multiple functions on a
	 * given range
	 * 
	 * @param low
	 * @param high
	 * @return
	 */
	public static List<Double> transform(int low, int high) {
		List<Double> list = new ArrayList<Double>();

		// initialize with multiples of 4 from range low-high
		for (double i = low; i < high; i++) {
			if (i % 4 == 0) {
				list.add(i);
			}
		}
		System.out.println(list);

		// remove multiples of 12
		list.removeIf(el -> el % 12 == 0);
		System.out.println(list);

		// Add all prime numbers that are less than 10 to the list
		// prime only divisible by and itself
		Collections.addAll(list, 2.0, 3.0, 5.0, 7.0);
		System.out.println(list);

		// remove all duplicates from list
		// There will never be duplicates since we are providing a range of numbers that
		// would not overlap. Also, we are not converting negatives to positives
		Set<Double> set = new HashSet<>(list);
		list = new ArrayList<>(set);
		System.out.println(list);

		// rearrange the elements so they are sorted in ascending order
		Collections.sort(list);
		System.out.println(list);

		// Shift all elements one position to the right and the last to the front
		Collections.rotate(list, 1);
		System.out.println(list);

		// Change the list by dividing each of the list elements by 8
		for (int i = 0; i < list.size(); i++) {
			Double el = list.get(i);
			list.set(i, el / 8d);
		}
		System.out.println(list);

		return list;
	}
}
