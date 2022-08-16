package week5Day2;

public class SecondDayFibonacciNumbers {

	public static void main(String[] args) {
	
		// write a function that return a sequence of fib
				// numbers based on the given value

				// fib Numbers =
				// 1 - we start with 0 1
				// 2 - every next number is the sum of the two previous numbers
				// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

				int count = 20;

				int[] fibNums = new int[count];// make the array
				fibNums[0] = 0; // assign the first value
				fibNums[1] = 1; // assign the second value

				for (int i = 2; i < fibNums.length; i++) {
					fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
					System.out.print(" "+fibNums[i]+",");
				}
				
//				for (int i : fibNums) {
//					System.out.print(i + ", ");
//				}
				

	}

}
