package LambdaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class DemoLambda {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		Collections.addAll(numbers, 1,2,3,4,5);
		System.out.println("original numbers  : " + numbers);
		
		Function<Integer, Integer> addThree = new AddThree();
		updateList(numbers, addThree);
		System.out.println("original (plus 3) : " + numbers);
		
		MinusTwo minusTwo = new MinusTwo();
		updateList(numbers, minusTwo);
		System.out.println("numbers (minus 2) : " + numbers);
		
		updateList(numbers, el -> 2 * el);
		System.out.println("numbers(times 2)  : " + numbers);
		System.out.println();
		
		List<Double> newList = createModifiedList(numbers,el -> el / 4d);
		System.out.println("new list (div 4)  : " + newList);
		System.out.println();
		 
		numbers.removeIf(el -> el % 5 == 0);
		System.out.println("numbers (no mult5): " + numbers);
		
		//add and sort
		Collections.addAll(numbers, 0, 4, 8, 12, 16);
		Collections.sort(numbers);
		System.out.println("numbers (+ extra ): " + numbers);
		
		//remove duplicates
		numbers = removeDuplicates(numbers);
		System.out.println("numbers(distinct): " + numbers);
		
		System.out.println("numbers (w/space): ");
		numbers.forEach(el -> System.out.println(el + ""));
	}
	private static void updateList(List<Integer> list, Function<Integer, Integer> function) {
		for(int i = 0; i < list.size(); i++){
			Integer el = list.get(i);
			list.set(i,  function.apply(el));
		}
	}
	
	private static List<Double> createModifiedList(List<Integer> list, Function<Integer, Double> function){
		List<Double> results = new ArrayList<>();
		for(Integer el : list) {
			results.add(function.apply(el));
		}
		return results;
	}
	
	private static List<Integer> removeDuplicates(List<Integer> list) {
		Set<Integer> set = new HashSet<>(list);
		return new ArrayList<>(set);
	
	}
}
