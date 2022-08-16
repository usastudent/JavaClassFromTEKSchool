package week5Day1;

public class ArrayRecapExamples {

	public static void main(String[] args) {
		
		// define arrays
		
				// Array is a single variable that can store multiple values in it
				// Array can only store values of the same data types.
				// collection of variables
				// its stored a contiguous block of memory
				// its fixed in size
				// arrays can have empty indexes
				// array indexes will be initialized to the default values
				// arrays can be multi dimensional collections
				// [] inside is clalled index

				// creating a variable
				// data-type name/identifier = value / new constructor();

				// declaration (assignment) initialization
				int x = 10;

				int[] arr = { 1, 2, 3 }; // declaration - // array initializer

				// declare and initialize the array
				int[] arr2 = new int[5];
				// int[] - single dimension array of int
				// reference data type variable

				arr2[0] = 10;
				System.out.println(arr2[0]);
				System.out.println(arr2); // print the add [I@15db9742

				// same ref arr2 now refers to a new location [I@6d06d69c
				arr2 = new int[8];
				System.out.println(arr2[0]);
				System.out.println(arr2); // we print the add

				System.out.println("-------------------------");
				int[] temp = { 1, 12, 13, 15, 85, 62, 15, 12, 15 };
//				System.out.println(temp[0]);
//				System.out.println(temp[1]);
//				System.out.println(temp[2]);
//				System.out.println(temp[3]);
//				System.out.println(temp[4]);
//				System.out.println(temp[5]);

				for (int i = 0; i < temp.length; i++) {
					System.out.println(temp[i]); // i is used as index number
				}
				// i as a counter
				// i as a pointer
				for (int i : temp) {
					System.out.println("foreach " + i); // i refers to the location
				}

				/*
				 * for(initialization ; conditions ; update) { // body of the loop }
				 */

				// String = reference data type variable
				// names = String[] / single dimension array of String
				// reference data type variable
				// String not same as String[]
				// int not same as int[]
				String[] names = new String[3];
				names[0] = "jack";
				names[1] = "david";
				names[2] = "anna";
				
				
				// name of the variable above ? names
				// whats the data type of names ? String[]
				// whats the data type inside array of names ? String
				
				
				System.out.println(names[0]);


	}

}
