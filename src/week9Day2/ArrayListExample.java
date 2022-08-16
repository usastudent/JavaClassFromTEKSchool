package week9Day2;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		// ArrayList - similar to arrays, its dynamic in size
		// <> Generic's - you can not put primitive data types inside generic's
		// reference data type variables

		// generic is idea of what type of you have in your collection. < >;
		
		ArrayList<String> data = new ArrayList<String>();
		
		data.add("Anna");
		data.add("Jack");
		data.add("David");
		data.add("Ahmad");
		data.add("something");
		
		System.out.println(data);
		
		// wrapper classes - we have a class for each primitive data type
		// 1. these classes will have functions we could use
		// 2. we could use these classes in generic's
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(15);
		numbers.add(10);
		numbers.add(5);
		numbers.add(50);
		numbers.add(77);
		numbers.add(41);
		System.out.println(numbers);
		
		// method add - is going to add an element to the list
		numbers.add(15);
		
		// method get - is going to return the value of a specific index
		System.out.println(numbers.get(3));
		
		// method addAll - is going to add an entire collection of compatible data type to another
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(155);
		num2.add(155);
		num2.add(155);
		
		numbers.addAll(num2);
		System.out.println(numbers);
	
		// method clear - is going to remove all of the data in the list
//		numbers.clear();
//		System.out.println(numbers);
		
		// method contains - is going to take a value and check to see if it can find it in the list. true if yes / false if no
		System.out.println(numbers.contains(7));
		
		// method size - is going to return the size of the list
		System.out.println(numbers.size());
		numbers.add(15487);
		System.out.println(numbers.size());
		
		System.out.println(numbers);
		System.out.println(numbers.get(10));
		
		
		// example
		ArrayList<Boolean> temp = new ArrayList<Boolean>();
		temp.add(true);
		temp.add(false);
		temp.add(true);
		System.out.println(temp);
		
		
		//example
		ArrayList<Object> generalList = new ArrayList<Object>();
		generalList.add(10);
		generalList.add(10.5);
		generalList.add("Name");
		generalList.add(false);
		generalList.add('c');
		
		System.out.println(generalList);
		
		
		// complexity - is referred to the amount of resource needed to do something
		// 1. time complexity - cpu power used to run your code
		// 2. space complexity - memory used to run your code
		
		// Storing / adding data
		// Retrieval of data
		// Searching
		// Sorting
		// modification/removal
		
		// ArrayList is good with,
		
		// - Retrieval : they are good because same location and same consequence. because=
		//- they are in the continiqeous block of code , accessibility is easier.
		
		// - Searching
		// - smaller data sets
		// - will not have empty indexes
		
		
		// - not good with adding data
		// - not good with removal of data
		
		
		// when to use ArrayList:
		// when you need a dynamic list
		// smaller data sets
		// you have more of addition and retrieval 
		// you have less of removing elements
		System.out.println("-----------------------------------");
		ArrayList<String> names = new ArrayList<String>();
		names.add("name1");
		names.add("name2");
		names.add("name3");
		names.add("name4");
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		
		
		// wrapper class:
		
	}
}
