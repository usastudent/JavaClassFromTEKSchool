package week7Day2;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {

	public static void main(String[] args) {
		
		numberGame(1, 1000);

	}
	// code a static function numberGame - 2 inputs, start and end of the range    
    public static void numberGame(int start, int end) {
        // generate a random number - within the range that is provided       
    	Random r = new Random();
        // we store that number somewhere      
    	int randNumber = r.nextInt(end - start) + start;
        // we use scanner to ask the user to enter their guess      
    	Scanner sc = new Scanner(System.in);
        boolean match = false;
        int entryNumber = 0;
        int count = 0;
        while (match != true) {
            System.out.println("Please provide a number: ");
            entryNumber = sc.nextInt();
            // we compare the input to the random number          
            if(entryNumber == randNumber) {
                match = true; 
                System.out.println("The random number was " + randNumber +
                					" and you have guessed it in " + count + " guesses!");
                break;
            } else if(entryNumber > randNumber) {
                // if input is higher, print go down           
            	System.out.println("Go Down!");
            } else {
                // if input is lower, print go up             
            	System.out.println("Go Up!");
            }
            count++;
        }
        // count the number of guesses and print that as part of the result
    }
}
