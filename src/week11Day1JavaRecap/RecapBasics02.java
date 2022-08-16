package week11Day1JavaRecap;

import java.util.Scanner;

public class RecapBasics02 {
	public static void main(String[] args) {

		// escape sequence
		String str = "this is \"test\"";
		System.out.println(str);

		// regex
		// regular expression

		System.out.println("13q4534t2342134e9(*&%&*^$*&*^(*&s1232131t#$@#@!#".replaceAll("[^a-zA-Z]", ""));

		// increment vs decrement
		// increase vs decrease by 1
		// pre vs post

		int x = 10;

		// ++x
		// whats the value of the variable? 10
		// increase that value by 1 ===== 10+1=11

		// x++
		// use the current value of x = 10
		// increase the value by 1 x+1=11
		// assign 11 to x.
		// so x from that point forward is increased

		int y = 10;
		System.out.println(y + 1); // 11
		System.out.println(y);// 10

//		System.out.println(x++);
//		System.out.println(x);

		// ==

		String str2 = 5 > 3 ? "yes" : "No";
		System.out.println(str2);
		
		if(5>3) {
			System.out.println("this is the true block");
		} else if (6>3){
			System.out.println("sdfsd");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine());
		
	}
}

