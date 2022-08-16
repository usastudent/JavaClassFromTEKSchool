package week9Day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		// We get 2 numbers and we try to divide.

		Scanner scanner = new Scanner(System.in);
		int result = 0;
		try {
			System.out.println("Enter a number");
			int numberA = scanner.nextInt();
			System.out.println("Enter another number");
			int numberB = scanner.nextInt();

			result = numberA / numberB;
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("Exception Happening " + e.getMessage());
		} finally {
			System.out.println("Finally block executed ");
			scanner.close();
		}

		System.out.println("Result is " + result);
		
	}

}

