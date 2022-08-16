package week5Day1;

public class TwoDimentionArray {

	public static void main(String[] args) {
	
		int[][] nums = { { 1, 3 }, { 4, 5, 6, 2 }, { 7 }, { 9, 3, 5, 8, 7 } };

		System.out.println("length of nums " + nums.length);
		System.out.println("nums[1].length " + nums[1].length);
		System.out.println("nums[2].length " + nums[2].length);

		System.out.println("length of the first index of the outer array " + nums[0].length);
		System.out.println("----------------------------------");
		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
//		for (int i = 0; i < temp.length; i++) {
//			System.out.print(temp[i] + " ");
//		}
//		System.out.println();



	}

}
