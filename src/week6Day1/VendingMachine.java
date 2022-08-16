package week6Day1;

//VendingMachineexample;
// null mean there is not existed.

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

		// method - re-stock - increase the quantity of a specific location in the
		// machine

		// method sell item - it should take location of the product, quantity sold, one
		// boolean true/false for payment

		// method print receipt

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
