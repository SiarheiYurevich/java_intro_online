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
	public String toString() {
		return "Bank [ clients " + clients + " ]";
	}
}
