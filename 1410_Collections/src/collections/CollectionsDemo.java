package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<Double> numbers = new ArrayList<>();
		
		// Add two digit numbers multiples of 7
		for(double n = 14; n <= 99; n+=7 ) {
			numbers.add(n);
		}
		
		//print fancy _14.0 _21.0_ _28.0_
		System.out.print("numbers: ");
		numbers.forEach(el -> System.out.print("_" + el + "_ "));
		System.out.println("\n");
		
		//add two digit numbers that are multiples of 3
		for(double n = 12; n <= 99; n += 3) {
			numbers.add(n);
		}
		
		// sort numbers
		Collections.sort(numbers);
		
		//Print label then the numbers 15 numbers per line
		printNumbers(numbers, "numbers");
		
		//Remove multiples of 5
		numbers.removeIf(el -> el % 5 == 0);
		printNumbers(numbers, "numbers");
		
		//Remove duplicates
		Set<Double> suniqueNumbers = new HashSet<>(numbers);
		printNumbers(suniqueNumbers, "unique numbers");
		
		//remove duplicates from list
		Set<Double> uniqueNumbers = new HashSet<>(numbers);
		numbers = new ArrayList<Double>(uniqueNumbers);
		Collections.sort(numbers);
		printNumbers(numbers, "ordered unique numbers");
		
		// we need all numbers from the list but multiplied by 0.1
		//iterator does not let you change
		List<Double> smallNumbers = new ArrayList<>();
		numbers.forEach(el -> smallNumbers.add(el/10));
		printNumbers(smallNumbers, "small numbers");
		
	}

//	private static void printNumbers(List<Double> numbers) {
//		System.out.println("numbers: ");
//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.print(numbers.get(i) + " ");
//			if (i % 15 == 14) {
//				System.out.println();
//			}
//		}
//		System.out.println("\n");
//	}
	private static void printNumbers(Collection<Double> numbers, String label) {
		System.out.println(label + ": ");
		int count = 0;
		for (Double el : numbers) {
			System.out.print(el + " ");
			if (count++ % 15 == 14) {
				System.out.println();
			}
		}
		System.out.println("\n");
		
	}
}


