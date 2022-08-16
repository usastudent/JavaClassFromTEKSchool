package week2;

public class StringExcersise {

	public static void main(String[] args) {
		
		//Given a string name, e.g. "Bob", print a greeting of the form "Hello Bob!".
//		String name = "Bob";
//		String greeting = "Hello "+name+"!";
//		System.out.println(greeting);
		
		//Given two strings, a and b, print the result of putting them together in the order abba, e.g. "Hi" and "Bye" print "HiByeByeHi". 

//		String a = "Hi";
//		String b = "Bye";
//		String result = a+b+b+a;
//		System.out.println(result);
		
		//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
		//In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
		//Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
		
		//("i", "Yay") → "<i>Yay</i>"        <variableName>name</variableName>
		//("i", "Hello") → "<i>Hello</i>" 
		//("cite", "Yay") → "<cite>Yay</cite>" 
		
//		String tag = "i";
//		String content = "Yay";
//		
//		String result = "<"+tag+">"+content+"</"+tag+">";
//		
//		System.out.println(result);
		
		
//		String result = "<"+"cite"+">"+"Yay"+"</"+"cite"+">";
//		System.out.println(result);
		
		/*
		 * 
			Given an "out" string length 4, such as "<<>>", and a word, return a new string
			 where the word is in the middle of the out string, e.g. "<<word>>". 
			 Note: use str.substring(i, j) to extract the String starting at index i and going
			  up to but not including index j. 
			
			 
			("<<>>", "Yay") → "<<Yay>>" 
			("<<>>", "WooHoo") → "<<WooHoo>>" 
			("[[]]", "word") → "[[word]]"
		 */

//		String first = "<<>>";
//		String word = "Yay";
//		
//		String firstHalf = first.substring(0, 2);
//		String secondHalf = first.substring(2);
////		
//		String result = firstHalf+word+secondHalf;
////		
//		System.out.println(result);
//		
//		String first = "[[]]";
//		String substringOne = first.substring(0, 2);
//		String substringTwo = first.substring(2);
//		String word = "hi";
//		String result = substringOne+word+substringTwo;
//		System.out.println(result);
		
/*
 * ("Hello") → "lololo" 
("ab") → "ababab" 
"Hi") → "HiHiHi"
 */
		
//		String greeting = "Hello";
//		String lastTwoCharacter = greeting.substring(greeting.length()-2);
//		System.out.println(lastTwoCharacter.repeat(3));
		
		/*
		 * ("WooHoo") → "Woo" 
("HelloThere") → "Hello" 
("abcdef") → "abc" 
		 */
		
//		String word = "abcdef";
//		int middleIndex = word.length()/2;
//		String firstHalf = word.substring(0, middleIndex);
//		System.out.println(firstHalf);
		
//		
//		String greeting = "this is a very long string ending with Hello";
//		int index = greeting.length()-2;
//		String lasttwo = gree
//		System.out.println(greeting);
		
		
	//String name = "This is an example string";
//		int number = name.length();
//		System.out.println(number);
		
//		String sentence = "the quick brown fox jumped over the lazy dog";
//		int whloword =sentence.indexOf("lazy d");
//		System.out.println(whloword);
		
		
		String greeting = "Hello";
		String where = "There";
		String fourletter = greeting.substring(1);
		String SecondFour = greeting.substring(1);
		String result = fourletter.concat(SecondFour);
		System.out.println(result);
		
		
	// ("Hello", "Mike") → "loMi"
		
		
		
		
		
		
		
		
	}

}
