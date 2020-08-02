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

import java.util.ArrayList;

public class Console {

	public Console() {
	}

	public void outputCustomerFromCreditCardRange(ArrayList<Customer> base, int beginOfRange, int endOfRange) {

		Logic logic = new Logic();

		for (int i = 0; i < base.size(); i++) {
			if (logic.checkRange(beginOfRange, endOfRange, base.get(i).getCreditCardNumber())) {
				System.out.println(base.get(i));
			}
		}
	}

	public void outputBase(ArrayList<Customer> base) {

		for (int i = 0; i < base.size(); i++) {
			System.out.println(base.get(i));
		}
	}
}
