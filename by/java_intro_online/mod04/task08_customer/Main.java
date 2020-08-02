package by.java_intro_online.mod04.task08_customer;

/* Create a class Customer whose specification is given below.
 * Write constructors, set- and get- methods, and toString method.
 * Write a class that aggregates an array of type Customer with appropriate constructors and methods.
 * Specify data selection criteria and output this data to the console.
 * Customer: id, second name, first name, middle name, address, credit card number, bank account number.
 * Find and output:
 * a) list of customer in alphabetical order;
 * b) list of customer whose credit card number is in the specified range.
 */

public class Main {

	public static void main(String[] args) {

		Logic logic = new Logic();
		Console console = new Console();
		RandomCustomerGenerator generator = new RandomCustomerGenerator();

		int numberOfCustomers = 10;

		CustomerBase base = new CustomerBase();

		System.out.println("Generated customer base:");
		base.addCustomerGroup(generator.generateCustomerBase(numberOfCustomers));
		console.outputBase(base.getCustomers());

		System.out.println("Customer base sorted by customer's second name:");
		console.outputBase(logic.sortBySecondName(base.getCustomers()));

		System.out.println("Customers from specified credit card number range (1-50):");
		console.outputCustomerFromCreditCardRange(base.getCustomers(), 1, 50);

	}

}
