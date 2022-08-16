package week10Day1CollectionExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		// linked list
		// linkedList linke the notes.
		// singly LinkedList - every node knows the reference to the next node
		
		// double LinkedList - every node knows the reference to the next and the previous nodes
		// the LinkedList that you create in Java is a doubly linked list
		
		// LinkedLists are better with large data sets
		// LinkedLists are better with removal and change of data
		// LinkedLists are better with addition
		
		// ArrayList is better with retrieval of data
		// ArrayList is better with smaller data sets
		
		// you need to import the classes that you use, ctrl + shift + o
		
		List<String> data1 = new LinkedList<String>();
		data1.add("test1");
		data1.add("test2");
		data1.add("test3");
		data1.add("test4");
		
		System.out.println(data1);
		
		// stack - Last in / first out (LIFO) 
		// queue - first in / first out (FIFO)
		
		
		
		
		// ArraList of Strings called names // and add 5 names to it
		ArrayList<String> names = new ArrayList<String>();
		names.add("1");
		names.add("2");
		names.add("3");
		names.add("4");
		names.add("5");
		System.out.println(names);
		System.out.println(names.size());
		// create a linked list with data type integer and add 10 numbers in. called age
		LinkedList<Integer> age = new LinkedList<Integer>();
		age.add(1);
		age.add(2);
		age.add(3);
		age.add(4);
		age.add(5);
		age.add(6);
		age.add(7);
		age.add(8);
		age.add(9);
		age.add(10);
		System.out.println(age);
		System.out.println(age.size());
		// declare list and create an ArrayList with it with data type boolean. 
		// add 5 values to it
		List<Boolean> temp = new ArrayList<Boolean>();
		temp.add(true);
		temp.add(false);
		temp.add(true);
		temp.add(true);
		temp.add(false);
		System.out.println(temp);
		System.out.println(temp.size());
		// print the size of each 
		// print the values of each
		
		
		// will be back at 10:50PM EST Or 7:50PM PST.
		
		
	}
}
