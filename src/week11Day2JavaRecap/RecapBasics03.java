package week11Day2JavaRecap;

public class RecapBasics03 {
	public static void main(String[] args) {

		// arrays

		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int[] nums = new int[5];
		
		System.out.println(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		for (int i : nums) {
			System.out.println(i);
		}

		
		int [][] temp = new int [3][2];
		temp[0][0] = 1;
		temp[0][1] = 2;
		temp[1][0] = 3;
		temp[1][1] = 4;
		temp[2][0] = 5;
		temp[2][1] = 6;
		
		System.out.println("---------------------------------");
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[row].length; col++) {
//				System.out.println("row   " + row + "   col   " + col);
				System.out.print(temp[row][col] + " ");
			}
			System.out.println();
		}
		
		
		
		int [][] notFixed = {{5,4,3,2,1},{8,5,2,6},{7,5,2}};
		
		for (int row = 0; row < notFixed.length; row++) {
			for (int col = 0; col < notFixed[row].length; col++) {
				System.out.print(notFixed[row][col] + " ");
			}
			System.out.println();
		}
		
		boolean x =false;
		while(x = true) {
			System.out.println("forever loop");
		}
	
	}

}

