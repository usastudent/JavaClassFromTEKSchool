package week10Day2Collection;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		//Activity
		//Remove multiple value from array. 
		
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(30);  // index(0)
		numbers.add(45);  // index(1)
		numbers.add(12);  // index(2) => it removes immediately and replace by the next index
		numbers.add(21);  // index(3)
		numbers.add(50);  // index(4)
		numbers.add(10);  // index(5)
		
		//when we put two numbers less than 25 => 12 and 21, it doesn't work because-
		//- loop works by index and when we reomove one index , the next index immediately-
		// shift to the left and replace it by the same index number so loop pass by it and -
		// it is going to the next index
		
		//remove all number less than 25
		
		//Option One
//		for (int i = 0; i < numbers.size(); i ++ ) {
//			if (numbers.get(i) < 25) {
//				numbers.remove(i);
//				i--;
//			}
//		}
		
		//Option 2 for removing. 
		LinkedList<Integer> toBeRemoved = new LinkedList<>();
		for (int i = 0; i < numbers.size(); i ++) {
			if (numbers.get(i) < 25) {
				toBeRemoved.add(numbers.get(i));		
			}
		}
		
		numbers.removeAll(toBeRemoved);
		
		System.out.println(numbers);
	}

}