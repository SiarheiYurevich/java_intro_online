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

public class Customer {

	private int id;
	private String secondName;
	private String firstName;
	private String middleName;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer() {
	}

	public Customer(int id, String secondName, String firstName, String middleName, String address,
			int creditCardNumber, int bankAccountNumber) {
		this.id = id;
		this.secondName = secondName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [ id " + id + ", secondName " + secondName + ", firstName " + firstName + ", middleName "
				+ middleName + ", address " + address + ", creditCardNumber " + creditCardNumber
				+ ", bankAccountNumber " + bankAccountNumber + " ]";
	}
}
