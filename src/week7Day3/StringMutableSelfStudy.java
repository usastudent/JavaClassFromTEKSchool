package week7Day3;

public class StringMutableSelfStudy {

	public static void main(String[] args) {
		
		// MUTAION : is the idea of object being able changed in the same place or not ;
		
		// S
	
			/*
			 * Strings are immutable object: 
			 * it means it can not change the value, it can not changed in the same place but
			 * it will make a new object and then you can refer to it.
			 * 
			 * which means when you assign a value to a string variable and try to change it,
			 * it will create the new object.
			 * exp: String name="Jack:; // @12
			 * name = "David"; // @234
			 */

			// I want a string variable where the value of the variable should changed.
			// it should not give me a new object.
		
		// Char Sequence:
		/* 
		 * we have 2 types of CharSequnece:
		 * 1) String    ( immutable )
		 * 2) AbstractStringBuilder => 1.StringBuilder      2. StringBuffer  (mutable)
		 * 
		 * all three types are String : they are classes that you can store text in them.
		 * String is more popular : it has more optional implementation 
		 */
		
		/*
		 * with StringBuilder and Buffer you can't use literal value
		 * and you need to use constructor
		 */
		 /*
		  * StringBuilding is not thread safe but StringBuffer is thread safe
		  */
		// StringBuffer and StringBuilder method are used to mutable the String.
		//A thread-safe, mutable sequence of characters.A string buffer is like a String
		
//		StringBuffer s = new StringBuffer("Navin");
//		
//		s.append(" Ready"); // append means; add it at the end of previous string.
//		s.replace(0, 5, "Ali");
//		System.out.println(s);
		
		
		// StringBuilder is the same as StringBuffer but it is not thread safe so it is better
		// to use StringBuffer most of the time. and you have to use constructor,
		//you can not use literal value 
		
		
		// immutable String
//		String s1 = new String("Rahim");
//		System.out.println(s1.length());
		
		//  the difference between StringBuffer and StringBuilder:
		// we can assume thread is like pipeline which is used like tunnel or path-
		// to communicate between codes and CPU , 
		
		// we call single thread as a thread-safe
		// we call multi-threading when they are many path between cods and CPU.
		
		// StringBuffer is a thread - safe ; means it makes all the multi-threading into one-
		// thread and then connected it to the CPU. 
		
		// StringBuilder uses many paths or tunnels to communicate between codes and CPU.
		
		// if you buffer the string , it merge all the threads in one thread and then -
		// communicate with CPU.
		
		// Stringbuilder is better regarding to the efficiency than StringBuffer but -
		// in some cases it is better to merge all the thread to one thread so the StringBuffer-
		//- is better in this situation
		
		
		StringBuilder sb = new StringBuilder("test");
		
		sb.append("is fun");
		System.out.println(sb);
		
		
	}

}
