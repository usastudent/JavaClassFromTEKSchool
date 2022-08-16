package week3;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		// we create object of Scanner Class
		//.next() : this method accepts input until it sees space 
		//.nextLine(): this method accepts entire sentence and then move to next line
		
		Scanner input = new Scanner(System.in);
		String name; // .next() or nextline();
		int age; // .nextInt()
		double salary; // .nextDouble();
		String state;
		String city;

		System.out.print("please enter your name:");
		name = input.nextLine();
		System.out.print("Enter your age:");
		age = input.nextInt();
		System.out.print("Enter your salary:");
		salary = input.nextDouble();
		System.out.print("Enter your city:");
		city = input.next();
		System.out.print("Enter your state");
		state = input.nextLine();

		System.out.println(name+ " is "+age+" years old"+" Make "+salary+
				" and live in city of "+ city+" and "+state);
		
	}

}
