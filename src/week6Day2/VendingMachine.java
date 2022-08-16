package week6Day2;

public class VendingMachine {

	// variables - we need an array to store these products in the machine
		Product[][] machine;

		// constructors - 1 default (3 rows * 4 columns)
		public VendingMachine() {
			machine = new Product[3][4];
		}

		// add product - add a product to a location in the machine
		public void addProduct(Product p) {
			machine[p.row][p.col] = p;
		}

		public void addProduct(String name, double price, int quantity, int row, int col) {
			Product temp = new Product(name, price, quantity, row, col);
			machine[row][col] = temp;
		}

	// method - re-stock - increase the quantity of a specific location in the machine
		public void restock(int row, int col, int amount) {
			if(machine[row][col] != null) {
				machine[row][col].increseQty(amount);
			} else {
				System.out.println("Re-Stock Failed! There is no item assigned to the location.");
			}
		}
		// method sell item - it should take location of the product, quantity sold, one
		// boolean true/false for payment
		public void sellProduct(int row, int col, int quantity, boolean payment) {
			if(machine[row][col] != null) {
				if(payment == true) {
					
					machine[row][col].decreseQty(quantity);
					
				} else {
					System.out.println("Payment failed!");
				}
				
			} else {
				System.out.println("Sale Failed! There is no item in that location.");
			}
		}

		// method print receipt
		public void printReceipt() {
			// this function is executed when we sell item
		}
		
		
		// print inventory - should print a list of all of the 
		// information about all of the items in the machine
		public void printInventory() {
			for (int row = 0; row < machine.length; row++) {
				// this is before every row
				System.out.println("********* Row " + (row + 1) + " *********");
				for (int col = 0; col < machine[row].length; col++) {
				// is going through the row	
					System.out.println(machine[row][col]);
				}
				// this is after every row
				System.out.println();
			}
		}
		
		
		
		
		
		// method print inventory - we will use the method toString
		public String toString() {
			String temp = "";

			// looping through the array of machine and adding the values to the string
			// escape sequences "\n" will take to the next line "\t" adding tab
			String spacer = "\t|\t";
			for (int row = 0; row < machine.length; row++) {
				temp += "|\t";
				for (int col = 0; col < machine[row].length; col++) {
					if (machine[row][col] != null) {
						temp += machine[row][col].name + spacer;
					} else {
						temp += "empty" + spacer;
					}
				}
				temp += "\n";
			}

			return temp;
		}	
	
}
