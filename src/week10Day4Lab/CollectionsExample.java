package week10Day4Lab;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		//we can add to Set and List with Collections.addAll method. 
		Collections.addAll(numbers, 231, 23,45,13,21,45,8,67,88,654);
		System.out.println(numbers);
		//Collections.sort method to sort in ascending order. 
		//Can we sort a set collections with this sort method ? No. 
		//Only List can be sorted.
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		
		//How to sort in descending order.
		//Only for List
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		int max = Collections.max(numbers);
		System.out.println(max);
		
		
		
	}

}

