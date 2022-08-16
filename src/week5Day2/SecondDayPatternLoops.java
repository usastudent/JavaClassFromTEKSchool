package week5Day2;

public class SecondDayPatternLoops {

	public static void main(String[] args) {
		
		// for (starting point; stopping point; update)
		
				// label can be used to name a loop. 
				// the majority of the use case is if you like to break or continue 
				// any other loop beside the immediate loop
				outter: for (int i = 0; i < 10; i++) {
					for (int j = 0; j < i; j++) {
						if(i>5) {
							break outter;
						}
						System.out.print(j);
					}
					System.out.println();
				}
				
				for (int i = 10; i > 0; i--) {
					for (int j = 0; j < i; j++) {
					
						System.out.print(j);
					}
					System.out.println();
				}
				
				// scope: the area in the code that you access certain element/variable
				// 

	}

}
