package week5LabSession;

public class Customer {

	// variables
		String firstName;
		String lastName;
		int accountNumber;
		double balance;

		// constructor
		public Customer(int accNumber) {
			firstName = "";
			lastName = "";
			accountNumber = accNumber;
			balance = 0;
		}

		public Customer(int accNumber, String fn, String ln) {
			accountNumber = accNumber;
			firstName = fn;
			lastName = ln;
			balance = 0;
		}

		public Customer(int accNumber, String fn, String ln, double bal) {
			accountNumber = accNumber;
			firstName = fn;
			lastName = ln;
			balance = bal;
		}

		public boolean deposit(double amount) {
			// should not deposit zero or negative numbers
			// if amount is more than 10,000 = accept it, print "report to IRS"
			if (amount > 10000) {
				balance += amount;
				System.out.println("Amount more than max limit. Report to IRS!");
				return true;
			} else if (amount <= 0) {
				System.out.println("Can not deposit zero or negative amounts.");
				return false;
			} else {
				balance += amount;
				System.out.println("Amount added!");
				return true;
			}
		}

		public boolean withdraw(double amount) {
			// should not be able to withdraw more than the balance
			// should not be able to do zero or negative numbers
			if (amount <= 0) {
				System.out.println("Can not withdraw zero or negative amounts.");
				return false;
			} else if (balance < amount) {
				System.out.println("Amount requested $" + amount
						+ " is more than what you have with us. Your current balance is $" + balance);
				return false;
			} else {
				balance -= amount;
				System.out.println(
						"The amount of $" + amount + " withdrawn successfully! Your remaining balance is $" + balance);
				return true;
			}

		}

		public void printInfo() {
			System.out.println("Full Name: " + firstName + " " + lastName + "  Account Number: " + accountNumber
					+ "  Balance: $" + balance);
		}
	
}
