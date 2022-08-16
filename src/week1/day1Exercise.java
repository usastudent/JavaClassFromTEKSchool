package week1;

public class day1Exercise {

	public static void main(String[] args) {
		//camel case and variable exercise
				//Create a variables for number of students with the appropriate datatype and assign it a value of 40
				/*
				 * Create a variable to hold the gpa of a student
				    Create a variable for average cost of gas and assign it a value of 4.1;
				    Create a variable to show if a person is underage or not and assign it the value of true;
				    Create a variable to show if it is raining outside
				    Create a variable to show hight of a person
				 */
				int numberOfStudents = 40;
				double averageCostOfGas = 4.1;
				boolean isUnderAge = true;
				boolean isRaining = false;
//				int height = 178;
				double height = 5.9;
				
			   // Write a Java program to print the sum of two numbers.
			    System.out.println(5+4);
			    //Write a Java program to divide two numbers and print on the screen.
			    System.out.println(10/2);
			    
			    //Write a Java program that display the product of two numbers
			    System.out.println(2*5);
			    
			    //Create a variable for days of the week
			    //Create a variable for the hours per day
			    //find the number of hours per week and store it in a new variable
			    
			    int daysOfWeek = 7;
			    int hoursPerDay = 24;
			    int hoursPerWeek = daysOfWeek * hoursPerDay;
			    
			    System.out.println(hoursPerWeek);
			    
			    //Haroon has 10 dollars. He spends 3  dollars on a pen and 2 on a notebook
			    //Calculate how much money does he have left?
			    
			    int totalDollar = 10;
			    int pensCost = 3;
			    int notebookCost = 2;
			    int totalCost = pensCost + notebookCost;
			    
			    int remainingMoney = totalDollar - totalCost;
			    System.out.println(remainingMoney);
			    
			    //Write a java program that finds the remainder of 19 divided by 3 and print the result
			    int remainder = 19 % 3;
			    System.out.println(remainder);
			    
			    //Write a Java program to print the area of a rectangle  ==>  width * height
			    
			    int recWidth = 5;
			    int recHeight = 4;
			    int area = recWidth * recHeight;
			    System.out.println(area);
			    
			    
			    /*
			     * Write a Java program to print the result of the following operations.
				   1.] 20 + -3*5 / 8
				   2.] -5 + 8 * 6
				   3.] (55+9) % 9
				   4.] 5 + 15 / 3 * 2 - 8 % 3
			     */
			    System.out.println(5 + 15 / 3 * 2 - 8 % 3);
			    
			    //Lisa is doing a fund raising. Mike donates 10 dollars. 
			    //Sam donates 12 dollars. Ali donates 18 dollars.
			   // How much money has Lisa raised so far?
//			    int mikesDonation = 10;
//			    int samsDonation = 12;
//			    int aliDonation = 18;
//			    int totalMoneyRaised = mikesDonation+samsDonation+aliDonation;
			    int totalMoneyRaised = 10+12+18;
			    System.out.println(totalMoneyRaised);
			    
			    //Anwar has 17 shirts. 9 shirts are black and the rest are white. 
			   // How many white shirts does Anwar have?
			    int totalShirts = 17;
			    int blackShirts = 9;
			    int whiteShirts = totalShirts-blackShirts;
			    System.out.println(whiteShirts);
			    
			    // There are 38 books on the shelf. Marta put 10 more books on the shelf.
			    //How many books are on the shelf now?
			    
			    int booksOnTheShelf = 38;
			    int booksAdded = 10;
			    int totalNumberOfBooks = booksOnTheShelf + booksAdded;
			    System.out.println(totalNumberOfBooks);
			    
			    //A bee has 6 legs. How many legs do 8 bees have in total?
			    
			    int beeLegs = 6;
			    int numberOfBees = 8;
			    int totalBeeLegs = beeLegs * numberOfBees;
			    System.out.println(totalBeeLegs);
			    
			    //You go to a resturant. Your bill is 24.8 dollars.
//				You want to pay 20% tip.
			    //Calculate how much in total you should pay?
			    
			    double bill = 24.8;
			    double tip = 0.2;
			    
			    double totalBill = (bill*tip) + bill;
			    System.out.println(totalBill);
			    

	}

}
