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

public class Logic {

	public Logic() {
	}

	public boolean checkRange(int beginOfRange, int endOfRange, int number) {

		if (beginOfRange <= number && number <= endOfRange) {
			return true;
		}
		return false;

	}

	public ArrayList<Customer> sortBySecondName(ArrayList<Customer> base) {

		ArrayList<Customer> sortBase = new ArrayList<Customer>();
		sortBase.addAll(base);

		for (int i = 1; i < sortBase.size(); i++) {
			if (isWrongWordSequence(sortBase.get(i - 1).getSecondName(), sortBase.get(i).getSecondName())) {
				swapCustomers(sortBase, i - 1, i);
				i = 0;
			}
		}
		return sortBase;
	}

	private boolean isWrongWordSequence(String word1, String word2) {

		char[] wordChar1 = word1.toCharArray();
		char[] wordChar2 = word2.toCharArray();

		int i = 0;
		while (i < Math.min(wordChar1.length, wordChar2.length)) {
			if (wordChar1[i] > wordChar2[i]) {
				return true;
			}
			if (wordChar1[i] == wordChar2[i]) {
				i++;
			} else {
				return false;
			}
		}
		return false;
	}

	private void swapCustomers(ArrayList<Customer> base, int customer1, int customer2) {

		Customer tempCustomer = base.get(customer1);
		base.set(customer1, base.get(customer2));
		base.set(customer2, tempCustomer);
	}

}
