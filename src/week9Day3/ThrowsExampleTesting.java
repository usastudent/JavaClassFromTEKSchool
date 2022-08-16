package week9Day3;

public class ThrowsExampleTesting {

	public static void main(String[] args) {
		UtilityClass utility = new UtilityClass();
		try {
			utility.doDivision(20, 0);
		} catch (ArithmeticException e) {
			System.out.println("Exception Happened.");
		}

		
		
		try {
			utility.readFromFile("");
		} catch (Exception e) {
			System.out.println("Can not locate the file");
		}

	}

}

