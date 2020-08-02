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

public class CustomerBase {

	private ArrayList<Customer> base;

	{
		base = new ArrayList<Customer>();
	}

	public CustomerBase() {
	}

	public ArrayList<Customer> getCustomers() {
		return base;
	}

	public void addCustomer(Customer customer) {
		base.add(customer);
	}

	public void addCustomerGroup(ArrayList<Customer> group) {
		base.addAll(group);
	}

	@Override
	public String toString() {
		return "Customer base [" + base + " ]";
	}
}
