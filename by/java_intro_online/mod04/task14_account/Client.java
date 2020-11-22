package by.java_intro_online.mod04.task14_account;

import java.util.ArrayList;
import java.util.List;

/* Create classes Account, Client and Bank.
 * Methods:
 * - locking and unlocking of accounts;
 * - search and sorting of accounts;
 * - count of accounts amount sum;
 * - count of amount sums for accounts with positive and negative balances separately. 
 */

public class Client {

	private String name;
	private List<Account> accounts;

	{
		accounts = new ArrayList<>();
	}

	public Client() {
	}

	public Client(String name) {
		this.name = name;
	}
	
	public Client(String name, Account account) {
		this.name = name;
		accounts.add(account);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public void deleteAccount(int number) {
		
		for (Account a : accounts) {
			if (number == a.getNumber()) {
				accounts.remove(a);
			}
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Client other = (Client) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [ name " + name + ", accounts " + accounts + " ]";
	}
}
