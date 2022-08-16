package week5Day2;

public class SecondDayTwoArraySum {

	// sum, min, max, avg

//			int[] numbers = { 1, 2, 15, 14, 4, 47, 0, -5, -1, 2, 10, 15, 18 };
//
//			int sum = 0;
//			int min = numbers[0];
//			int max = numbers[0];
//			double avg = 0;
//
//			for (int i = 0; i < numbers.length; i++) {
//				System.out.print(numbers[i] + ", "); // printing the values
//				sum += numbers[i]; // finding the sum
//
//				if (numbers[i] < min) {
//					min = numbers[i];
//				}
//				if (numbers[i] > max) {
//					max = numbers[i];
//				}
//
//			}
//			System.out.println();
//			System.out.println("Sum: " + sum);
//			System.out.println("Min: " + min);
//			System.out.println("Max: " + max);
//			System.out.println("Count: " + numbers.length);
//			System.out.println("Ave: " + ((double) sum / numbers.length)); // average = sum / count
//
//		
//	
//	
//	
//	System.out.println("-------- fibonacci nubmber----------");
//	
	
//		int count=10;
//	int [] fibNum = new int [count];
//	for (int i = 2; i < fibNum.length; i++) {
//		fibNum[i] = fibNum[i-1] + fibNum [i-2];
//	}
//	System.out.println(fibNum[i]);
//		
//		
//		//////////
//	
	int [] maryamLove = {2,5,6,8,7,9,4};
	
	double sum =0;
	double average = 0;
	int multi =1;
	int min = maryamLove[0];
	int max = maryamLove[0];
	
	
	for ( int i =0; i <maryamLove.length ;i++) {
		
		sum = sum+maryamLove[i];
		average = sum/maryamLove.length;
		multi = multi*maryamLove[i];
		if (maryamLove[i]< min ) {
			min = maryamLove[i];
		}
		if (maryamLove[i]>max) {
			max = maryamLove[i];
		}
	}

	System.out.println("sum is : "+sum);
	System.out.println("average is : " +average);
	System.out.println("multi is :"+ multi);
	System.out.println("min is :"+min);
	System.out.println("max is :"+ max);
		
		
		
		
		
		
	}

}
