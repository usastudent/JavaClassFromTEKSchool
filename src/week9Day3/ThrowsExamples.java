package week9Day3;

public class ThrowsExamples {
	
	public static void main(String[] args) {
		
		for (int i = 10; i >= 0 ; i --) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			} 
			System.out.println(i);
		}
		
	}

}
