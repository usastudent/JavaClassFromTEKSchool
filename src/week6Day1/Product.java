package week6Day1;

//vendingMachineExample;

public class Product {

		// holding ctrl+click on the word can take you to the original source
	// constructor chaining
		// it prevents form variable's repetition over and over in different constructor
		// is a method of calling another constructor at the beginning of your
		// constructor
		// 1. it must be the first statement of the constructor
		// this();   will reach the constructor of the top class ( included all the variables )
		// this keyword has two usages: 
		//1) you can refer to your variables of the class
		//2) you can refer to the constructor of the class.( constructor chaining )
		// variables
		String name;
		double price;
		int row;
		int col;
		int quantity;
		

		// default constructor - initialize all of the variables to the default value
		// this keyword is not working with static state.
		// this keyword means top class name
		
		
		public Product() {
			this.name = "";
			this.price = 0;
			this.row = 0;
			this.col = 0;
			this.quantity = 0;
		}

		// Parameterized constructor 1 - initialize all of the variables to default value
		// and
		// assign the values we get in as parameters to those variables
		public Product(String name) {
			this();  // it refers to Product default constructor (included all variables, no need to repeat them again
			this.name = name;
		}

		// Parameterized constructor 2
		public Product(String name, double price, int quantity) {
			this();
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}

		// Parameterized constructor 3
		public Product(String name, double price, int quantity, int row, int col) {
			this(); // if add any new variables, this will take care of them
			this.name = name;
			this.price = price;
			this.quantity = quantity;
			this.row = row;
			this.col = col;
		}

		// increase quantity will take a number and add to the quantity
		public void increseQty(int amount) {
			if (amount <= 0) {
				System.out.println("Can not increase the quantity by zero or negative numbers.");
			} else {
				quantity += amount;
				System.out.println("Quantity of the product (" + name + ") increased. New Quantity: " + quantity);
			}
		}

		// decrease quantity will take a number and subtract from the quantity
		public void decreseQty(int amount) {
			if (amount <= 0) {
				System.out.println("Can not decrease the quantity by zero or negative numbers.");
			} else {
				quantity -= amount;
				System.out.println("Quantity of the product (" + name + ") decreased. New Quantity: " + quantity);
			}
		}

		// Method "public String toString(){}"
		// this is a special method that comes with java.
		// this method defines what gets printed,
		// if you just print the name of the object
		
		// String toString method just print whatever we want instead of our object name
		// String toString method prints what should be printed instead of obj name , if wanted.

		@Override // it just make sure your method is correct one,( like spelling)
		public String toString() {           //exp: return"this is sample test"
			
			return "Product [name: " + name + ", price: " + price + ", quantity: " 
		+ quantity + ", row: " + row + ", col: "
					+ col + "]";
		}
}
