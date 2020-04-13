package prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Module04Prep {
	
	public static void main(String[] args) {
		transform(5.6);
	}
	
	public static void transform(double multiplier) {
		List<Double> list = new ArrayList<>();
		
		//initialize the list with 21 numbers from -10 to 10 each multiplied
		//by the number
		for(int n = -5; n<= 5; n++) {
			list.add(n * multiplier);
		}
		
		//remove all elements greater 5
		list.removeIf(el -> el > 5);
		
		//for each of the elements in the list add an element 
		// that is 10 times as big
		//list.forEach(el -> list.add(el * 10)); forever loop constantly growing
		for(int i = list.size(); i >= 0; i--) {
			list.add(list.get(i) * 10);
		}
		
		//change all negative elements to positive elements
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < 0) {
				//double el = list.get(i) * -1;
				//list.set(i, el);
				list.set(i,  list.get(i)*-1);
			}
		//remove all duplicates
		Set<Double> set = new HashSet<>(list);
		list = new ArrayList<>(set);
		
		// rotate all elements one to the left and first to last
		// 2 4 6 8 ... 4 6 8 2
		Collections.rotate(list, -1);
			
		//print the elements of the list
		System.out.println(list);
		
		}
		
		

	}
	
	/**Test Data: multiplier 1 ... easy to check, no elements removed
			      multiplier 2 ... 3 elements will be removed transform_Multiply_Remove3Elements
			      multiplier 0.1.. easy to check once elements are multiplied. no elements removed
			      multiplier -1 .. same output as 1, no elements removed
			      multiplier 0.5.. 
			      multiplier 10... 
			      mulitplier 5.... give duplicates 
			      each test target instruction
			   
	**/
	
	
		

}
