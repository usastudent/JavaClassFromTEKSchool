package week7Day1;

public class StaticClassOfJava {

	public static void main(String[] args) {
		
		// 2^3 = 2 * 2 * 2 = 8
				// 9^4 = 9 *9 *9 *9
				int num = 9;
				int pow = 4;
				
				System.out.println(power(num, pow));
				
				System.out.println(Math.pow(num, pow));
			}

				public static int power(int num, int pow) {
					int result = 1;
					for (int i = 0; i < pow; i++) {
						result *= num;
					}
					
					return result;

	}

}
