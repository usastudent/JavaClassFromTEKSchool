package week3;

import java.util.Scanner;

public class SwitchConcpet {

	public static void main(String[] args) {
		//Switch statement is same as if else if else statement
				//decision making statements
				//data types that are supported by switch statements are 
				/*
				 * int 
				 * byte
				 * short
				 * char
				 * String 
				 * enum-- dont worry 
				 */
				/*Syntax for switch statement
				 * switch(variable){
				 * case dataype: code to execute -- break
				 * default: == else in if else 
				 */
				
//				Scanner stateName = new Scanner(System.in);
//				
//				System.out.println("enter your state name");
//				String state = stateName.nextLine();
//			
//				switch(state) {
//				case "Virginia": 
//					System.out.println("you live in Virginia");
//					break;
//				case "California":
//					System.out.println("You live in California");
//					break;
//				case "New york":
//				System.out.println("you live in New york");
//				break;
//				default:
//					System.out.println("you live in another state");
//				}
				
//				Scanner speedInput = new Scanner(System.in);
//				
//				System.out.print("please enter your speed");
//				int speed = speedInput.nextInt();
//				
//				switch(speed) {
//				case 10: 
//					System.out.println("your speed is 10");
//					break;
//				case 20:
//					System.out.println("Your speed is 20");
//					break;
//				case 30:
//					System.out.println("Your speed is 30");
//					break;
//				default:
//					System.out.println("your speed does not match");
//				}
				
				// write a program that tell us what days left in this week.
				// today is Wednesday i wanna print 
				
				Scanner input = new Scanner(System.in);
				System.out.println("please select from 1 - 7 ");
				int days = input.nextInt();
				//char a = input.next();
				String message= "";
				
				switch(days) {
				case 1: message = "Monday";
				break;
				case 2: message = "Tuesday";
				break;
				case 3: message = "Wednesday";
				System.out.println(message);
				case 4: message = "Thursday";
				System.out.println(message);
				case 5: message = "Friday";
				System.out.println(message);
				case 6: message = "Saturday";
				System.out.println(message);
				case 7: message ="Sunday";
				break;
				default:
				System.out.println("none of the days");
				}
				System.out.println(message);
				
		
		
		
		
		
		
	}

}
