package keyValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClient {

	public static void main(String[] args) {
		//Part One
		System.out.println("Part 1:");
		System.out.println("---------");
		
		KeyValuePair<String, Integer> p1 = 
				new KeyValuePair<String, Integer>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = 
				new KeyValuePair<String, Integer>("NY", 8244910);
		KeyValuePair<String, Integer> p3 = p2;
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p1.equals(p2): " + p1.equals(p2) + "\n");
		System.out.println("p3: " + p3);
		System.out.println("p2.equals(p3): " + p2.equals(p3));
		
		//Part Two
		System.out.println("Part 2:");
		System.out.println("---------");
		
		KeyValuePair<String, Integer> p4 = 
				new KeyValuePair<String, Integer>("LA", 3819702);
		KeyValuePair<String, Integer> p5 = 
				new KeyValuePair<String, Integer>("SF", 812826);
		
		List<KeyValuePair<String, Integer>> cities = new ArrayList<>();
		Collections.addAll(cities, p1, p2, p3, p4, p5);
		System.out.println("Original List:");
		cities.forEach(el -> System.out.println(el.toString()));
		System.out.println("\nSorted List:");
		Collections.sort(cities);
		cities.forEach(el -> System.out.println(el.toString()));
	}
}
