package week6Day2;

public class Book {
	// encapsulation in java:
		//limit the access or gain control over the variable
		// we need to make the variable to be private. 
		//and then it will be accessible only in the same class, not in other classes
	
	// Bean class
		// 1. make the variables private
		// 2. make getter and setter methods also called (accessor's and mutator's)
		// Benefits:
		// 1. we limit the unwanted access to the variables of the class from other classes
		// 2. we define a way to access the variables for other classes
		
		
		
		
		// variables
		// private access modifier: only accessible in the same class
		private String name;
		private String isbn;
		private String publisher;
		private int numOfPages;
		private String author;

		// default constructor
		public Book() {
			this.name = "";
			this.isbn = "";
			this.publisher = "";
			this.numOfPages = 0;
			this.author = "";
		}

		// Parameterized constructor
		public Book(String name, String isbn, String publisher, int numOfPages, String author) {
			this();
			this.name = name;
			this.isbn = isbn;
			this.publisher = publisher;
			this.numOfPages = numOfPages;
			this.author = author;
		}
		
		// public Return-type = variable type get Name of the variable (){ return variable}
		public String getName() {
			return name;
		}


       // public void setNameOfTheVariable(data-type of the variable name) 
		// {this.variable = name;} 
          public void setName(String name) {
	      this.name = name;

			
		}
		public String getIsbn() {
			return isbn;
		}
		
		public void setisbn(String isbn) {
			this.isbn=isbn;
		}
			public String getPublisher() {
				return publisher;
			}
		public void setPublisher(String publisher){
			this.publisher=publisher;
		}
		public int getumOfPages() {
			return numOfPages;
		}
		public void setnumOfPages(int numOfPages) {
			this.numOfPages=numOfPages;
		}
		public String getAuthor () {
			return author;
		}
		public void setAuthor (String author) {
			this.author=author;
		}
		// example of hidding isbn by putting password on int in getIsbn mehtod
		
		/*
		 * public String getIsbn(String pass) {
			 if (pass.equals("1234")) {
			 return isbn;
		 } else {
			 return "wrong Password";
		 }
		 }
		 */
		
		// to String method
		public String toString() {
			return "Book [name=" + name + ", isbn=" + isbn + ", publisher=" + publisher + ", numOfPages=" + numOfPages
					+ ", author=" + author + "]";
		}

}
