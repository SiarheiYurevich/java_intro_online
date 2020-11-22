package by.java_intro_online.mod04.task14_account;

/* Create classes Account, Client and Bank.
 * Methods:
 * - locking and unlocking of accounts;
 * - search and sorting of accounts;
 * - count of accounts amount sum;
 * - count of amount sums for accounts with positive and negative balances separately. 
 */

public class Account {

	private int number;
	private int amount;
	private State status;

	enum State {
		locked, unlocked
	};
	
	{
		status = State.unlocked;
	}

	public Account() {
	}

	public Account(int number) {
		this.number = number;
	}
	
	public Account(int number, int amount) {
		this.number = number;
		this.amount = amount;		
	}

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public State getState() {
		return status;
	}
	
	public void setState(State status) {
		this.status = status;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + number;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (amount != other.amount)
			return false;
		if (number != other.number)
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [ number " + number + ", amount " + amount + ", state " + status + " ]";
	}

}
