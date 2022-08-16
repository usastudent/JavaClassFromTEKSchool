package week5Day2;

public class SecondDayKeywordBreakAndContinue {

	public static void main(String[] args) {
		
		// break
				// will basically stop the loop
		
		//break after n
		
//				for (char c = 'a'; c <= 'z'; c++) {
//				//	System.out.print(c+" "); // it is included 'n', because it if before conditon
//					if (c=='n') {
//						break;
//					}
//					System.out.print(c+" "); // it is not included
//				}

				
				/////
				
//				for (char c = 'a'; c <= 'z'; c++) {
//					//System.out.print(c+" "); // it is included 'n', because it if before conditon
//					if (c=='n') {
//						continue;
//					}
//					System.out.print(c+" "); // it is not included 'n' because it is after condition
//				}
				
				
				//System.out.println("-------------------------");
				// continue
				// it will skip to the next iteration of the loop

				for (int i = 1; i <= 10; i++) {
					if (i == 5) { // then I check
						continue;
					}
					System.out.print(i + ", ");  // print here after i check 
				}

	}

}
