package week5Day2;

public class SecondDayArray3D {

	public static void main(String[] args) {
		
		int[][][] nums = new int[2][5][6];

		int val = 1;
		
		for (int t = 0; t < nums.length; t++) {
			for (int row = 0; row < nums[t].length; row++) {
				for (int col = 0; col < nums[t][row].length; col++) {
					nums[t][row][col] = val++;
				}
			}
		}
		
		for (int t = 0; t < nums.length; t++) {
			for (int row = 0; row < nums[t].length; row++) {
				for (int col = 0; col < nums[t][row].length; col++) {
					System.out.print(nums[t][row][col]+ ", ");
				}
				System.out.println(); // next line
			}
			System.out.println("------------------"); // space between two tables
		}

	}

}
