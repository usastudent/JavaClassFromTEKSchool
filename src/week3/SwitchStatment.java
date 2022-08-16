package week3;

import java.util.Scanner;

public class SwitchStatment {

	public static void main(String[] args) {
		
		// conditional Operators
				/**
				 * == equal // primitive data types and string > greater than < less than >=
				 * greater than or equal <= less than or equal != not equal all of above
				 * operators return a boolean either true or false
				 */
				// Logical Operators
				/**
				 * && AND operator -- both conditions should be true || OR operator -- one of
				 * the conditions should be true
				 * 
				 */
				// if statement : if(codition) { } -- if we have one condition we can use this
				// if then else statement: if(condition){ }else -- if we have two conditions we
				// use this statment.
				// if we have more than two conditions then we can use below syntax:
				/**
				 * if(condition){ }else if(condition){ }else if (condition){ }else
				 * 
				 * 
				 */

				// we want to check if a person is eligible for voting ? voting age 18
				//Scanner  input= new Scanner (System.in);
//				int age = 16;
//				if (age >= 18) {
//					System.out.println(" you are eligible to vote");
//				}
				// we want to check what day of week is today?
				// if we start from Monday =1 and Sunday = 7
//				int dayofTheWeek = 5;
//				if (dayofTheWeek == 1) {
//					System.out.println("Today is Monday");
//				} else if (dayofTheWeek == 2) {
//					System.out.println("Today is Tuesday");
//				} else if (dayofTheWeek == 3) {
//					System.out.println("Today is Wednesday");
//				} else if (dayofTheWeek == 4) {
//					System.out.println("Today is Thursday");
//				} else if (dayofTheWeek == 5) {
//					System.out.println("Today is Friday");
//				} else if (dayofTheWeek == 6) {
//					System.out.println("Today is Saturday");
//				} else if (dayofTheWeek == 7) {
//					System.out.println("Today is Sunday");
//				} else
//					System.out.println("you enter wrong number of the day");

				/**
				 * write a program to print days of the week regardless of uppercase/lower case
				 * for example if user enter monday or Monday it should print today is Monday. 5
				 * min
				 */
				//equalsIgnoreCase this is string method it will ignore upper/lower case of 
				// each character in given string. 
				// input = WedNesDay  => wednesday

//				String input = "TuesDay";
//				if (input.equalsIgnoreCase("monday")) {
//					System.out.println("Today is " + input);
//				} else if (input.equalsIgnoreCase("tuesday")) {
//					System.out.println("Today is " + input);
//				} else if (input.equalsIgnoreCase("wednesday")) {
//					System.out.println("Today is  Wednesday");
//				} else if (input.equalsIgnoreCase("thursday")) {
//					System.out.println("Today is " + input);
//				} else if (input.equalsIgnoreCase("friday")||input.equalsIgnoreCase("funday")) {
//					System.out.println("Today is " + input);
//				} else if (input.equalsIgnoreCase("saturday")) {
//					System.out.println("Today is " + input);
//				} else if (input.equalsIgnoreCase("sunday")) {
//					System.out.println("Today is " + input);
//				} else
//					System.out.println("your entry is not matching");
		//	}
		//
//			// find if a number is even or odd 
		//
//			int number = 3;
//			if(number%2==0) {
//				System.out.println(number + " is even");
//			}else
//				System.out.println(number + " is odd");
				
			// In Java we have a class called Scanner and we can enter values 
		//using scanner class
			// in Java in order to create object of a class we follow below syntax
			// ClassName nameofObj = new ClassName(); // every class starts with Capital
//				Scanner input = new Scanner(System.in);
//				
//				System.out.print("Please enter your name: ");
//				String name = input.nextLine(); // .next() -- only accept one word -- nextline -- the entire name
//				System.out.println("your name is " + name);
			

	}

}
