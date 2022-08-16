package week5Day2;

public class SecondDayTwoDArrayExample {

	public static void main(String[] args) {
		
		int[][] nums = { { 1, 2, 5 }, { 12, 76, 42, 1 }, { 32, 12, 12, -9 } };

		int sum = 0;
		int min = nums[0][0];
		int max = nums[0][0];
		double avg = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + ", ");
			
		
				sum += nums[i][j];
				// conditions ? true : false ;
				min = nums[i][j] < min ? nums[i][j] : min;
				max = nums[i][j] > max ? nums[i][j] : max;
			}
			count += nums[i].length;
		}
		System.out.println();
		System.out.println("Sum: " + sum);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Count: " + count);
		System.out.println("Ave: " + ((double) sum / count)); // average = sum / count

    

			
			
			}

}
