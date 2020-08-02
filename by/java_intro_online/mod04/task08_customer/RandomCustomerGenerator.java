package by.java_intro_online.mod04.task08_customer;

import java.util.ArrayList;

public class RandomCustomerGenerator {

	public RandomCustomerGenerator() {
	}

	public ArrayList<Customer> generateCustomerBase(int numberOfCustomers) {

		ArrayList<Customer> base = new ArrayList<Customer>();
		Customer customer;
		int idCounter = 1;

		for (int i = 0; i < numberOfCustomers; i++) {

			customer = new Customer();

			customer.setId(idCounter);
			idCounter++;
			customer.setSecondName(generateWord());
			customer.setFirstName(generateWord());
			customer.setMiddleName(generateWord());
			customer.setAddress(generateWord() + " " + (int) (Math.random() * 100));
			customer.setCreditCardNumber((int) (Math.random() * 100));
			customer.setBankAccountNumber((int) (Math.random() * 100));

			base.add(customer);
		}
		return base;
	}

	private String generateWord() {

		char[] nameInChar = new char[(int) (Math.random() * 4 + 4)];

		nameInChar[0] = generateCHAR();

		for (int i = 1; i < nameInChar.length; i++) {
			nameInChar[i] = generateChar();
		}
		String name = new String(nameInChar);
		return name;
	}

	private char generateCHAR() {
		char CH;
		CH = (char) (Math.random() * 25 + 65);
		return CH;
	}

	private char generateChar() {
		char ch;
		ch = (char) (Math.random() * 25 + 97);
		return ch;
	}
}
