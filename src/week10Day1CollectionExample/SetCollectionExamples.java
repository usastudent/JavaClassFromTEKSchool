package week10Day1CollectionExample;

import java.util.HashSet;

public class SetCollectionExamples {

	public static void main(String[] args) {

		// HashSet
		// un-ordered collection
		// does not take duplicate values
		// hashsets do not work based on indexes
		// if you want to iterate through a set, you can use foreach loop
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(5);
		numbers.add(7);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(2);
		numbers.add(10);
		
		for (Integer i : numbers) {
			System.out.println(i);
		}
		
		System.out.println(numbers);
		
		// do we have duplicates in an array?
		String [] names = {"name1","name2","name3","name6","name4","name5"};
		System.out.println(hasDuplicates(names));
	}
	
	public static boolean hasDuplicates(String[] strs) {
		HashSet<String> temp = new HashSet<String>();
		
		for (int i = 0; i < strs.length; i++) {
			if(temp.add(strs[i]) == false) {
				// we have a duplicate
				System.out.println(strs[i] + " is duplicate");
				return true;
			}
		}
		return false;
	}
}
