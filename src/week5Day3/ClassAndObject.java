package week5Day3;

public class ClassAndObject {
	
	// title, author, price, pageCount

	// variables
	String title;
	String author;
	double price;
	int pageCount;

	// Constructors - Default constructor
	public void Book() {
		title = "";
		author = "";
		price = 0;
		pageCount = 0;
	}

	// Constructors - Parameterized Constructor
	public void Book(String t, String a, double p, int pc) {
		title = t;
		author = a;
		price = p;
		pageCount = pc;
	}

	// general functions
	// Access-Modifier Return-Type Name/Identifier(Args){body}
	// if you don't want any return, you can use "void"
	// if you have any return type beside void, you must have a return statement

	public void printBook() {
		System.out.println("**********************************************");
		System.out.println(
				  "Title: " + title 
				+ "  Author: " + author 
				+ "  Price: " + price 
				+ "  Page Count: " + pageCount);
		System.out.println("**********************************************");
	}

}
