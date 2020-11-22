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

public class Bank {

	private List<Client> clients;
	
	{
		clients = new ArrayList<>();
	}

	public Bank() {
	}
	
	public List<Client> getClients() {
		return clients;
	}
	
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public void addClient(Client client) {
		clients.add(client);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clients == null) ? 0 : clients.hashCode());
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
		Bank other = (Bank) obj;
		if (clients == null) {
			if (other.clients != null)
				return false;
		} else if (!clients.equals(other.clients))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bank [ clients " + clients + " ]";
	}
}
