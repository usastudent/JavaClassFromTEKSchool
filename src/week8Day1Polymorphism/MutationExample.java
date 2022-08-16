package week8Day1Polymorphism;

public class MutationExample {

	public static void main(String[] args) {
		
		// mutation - 
//		String is immutable
		String name = "Jack"; // @123 address
		name = "DAVID"; // @234  address
		name = name.toLowerCase();
		System.out.println(name);
		
		
		
//		StringBuilder sb = new StringBuilder("test");
//		String str = "test";
//		// can you reverse string
//		sb.reverse();
//		
//		System.out.println(sb);
//		
//		// 1 option :
		//you could convert String to StringBuilder and reverse it , then -
		// convert it back to the String.
		
//		StringBuilder revTemp = new StringBuilder(name);
//		revTemp.reverse();
//		String revName = String.valueOf(revTemp);
//		System.out.println(revName);
//		
//		
//		// 2 option:
		// loop through it and then print one by one
		
//		String input = "this is a test string to reverse";
//		String rev = "";
////		System.out.println(input.length());
//		for (int i = input.length() - 1; i >= 0; i--) {
//			rev += input.charAt(i);
//		}
//		System.out.println(input);
//		System.out.println(rev);
//		

	}

}
