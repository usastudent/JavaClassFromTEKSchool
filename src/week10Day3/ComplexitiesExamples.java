package week10Day3;

public class ComplexitiesExamples {
	public static void main(String[] args) {

		// Complexity
		// 1. Time complexity - O(n)
		// 2. Space Complexity
		
		// see how many times you have to perform something in the code
		// lets say n number of times
		// if you run one loop the n you run n number of functions
		// so its O(n)
		
		// if you have no loop, it means that you will run same code
		// run the code once
		// O(1)
		
		// if you have a nested loop, then you run n number of things 
		// for n number of times
		// so its n * n which is same as n ^2
		// O(n^2)
		
		//if you have a nested loop inside a nested loop and inside another loop
		// then you run n * n * n that is same as n^3 
		// O(n^3)
		
		
		
		
		

		int[] temp = { 1, 2, 5, 4, 8, 1, 5, 4, 8, 4, 5, 23, 1, 5 };
		System.out.println(temp.length);
		
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
		// 14 * 14
		// O(n^2)

		
		// ------------------------------------------
		
		
		for (int i = 0; i < temp.length; i++) {
			
		}
		// O(n)
		// ------------------------------------------
		
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				
			} // n
		} // n
		// n * n 
		// O(n^2)
		
		// ------------------------------------------
		
		for (int i = 0; i < temp.length; i++) {
			
		} // n
		for (int i = 0; i < temp.length; i++) {
			
		} // n
		
		// n + n
		// O(n)
		
		// ------------------------------------------
		
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				for (int j2 = 0; j2 < temp.length; j2++) {
					
				}
			}
		}
		for (int i = 0; i < temp.length; i++) {
			
		}
		// O(n^3)
		
		
		
		
		
		
		for (int i = 0; i < temp.length; i++) {
			
		}
		
		
	
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
	}
	
	
	public static void testExample() {
		System.out.println("Open browser");
		
		System.out.println("go to the URL");
		
		System.out.println("Click on user name and pass the user name");
		
		System.out.println("Click on pass name and pass the user pass");
		
		System.out.println("click on submit");
		
		System.out.println("see the dashboard");
		
		System.out.println("verify that account information is correct");
	}
	
	
}
