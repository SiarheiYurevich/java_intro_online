package by.java_intro_online.mod04.task14_account;

import by.java_intro_online.mod04.task14_account.Account.State;

/* Create classes Account, Client and Bank.
 * Methods:
 * - locking and unlocking of accounts;
 * - search and sorting of accounts;
 * - count of accounts amount sum;
 * - count of amount sums for accounts with positive and negative balances separately. 
 */

public class Logic {

	Logic() {
	}

	public static void lockAccount(Bank bank, String clientName, int accountNumber) {

		for (Client client : bank.getClients()) {

			if (client.getName().equals(clientName)) {

				for (Account account : client.getAccounts()) {

					if (account.getNumber() == accountNumber) {

						account.setState(State.locked);
					}
				}
			}
		}
	}

	public static void unlockAccount(Bank bank, String clientName, int accountNumber) {

		for (Client client : bank.getClients()) {

			if (client.getName().equals(clientName)) {

				for (Account account : client.getAccounts()) {

					if (account.getNumber() == accountNumber) {

						account.setState(State.unlocked);
					}
				}
			}
		}
	}
	
	public static Account searchAccount(Bank bank, int accountNumber) {

		Account searchedAccount = null;

		for (Client client : bank.getClients()) {
			for (Account account : client.getAccounts()) {

				if (account.getNumber() == accountNumber) {
					searchedAccount = account;
				}
			}
		}
		return searchedAccount;
	}

	public static void sortAccounts(Bank bank, String clientName) {

		int amount1 = 0;
		int amount2 = 0;

		for (Client client : bank.getClients()) {

			if (client.getName().equals(clientName)) {

				for (int i = 1; i < client.getAccounts().size(); i++) {

					amount1 = client.getAccounts().get(i - 1).getAmount();
					amount2 = client.getAccounts().get(i).getAmount();

					if (amount1 < amount2) {
						swapAccounts(client, i - 1, i);
						i = 0;
					}
				}
			}
		}
	}

	private static void swapAccounts(Client client, int i, int j) {

		Account tempAccount = new Account();
		tempAccount = client.getAccounts().get(i);

		client.getAccounts().set(i, client.getAccounts().get(j));
		client.getAccounts().set(j, tempAccount);
	}

	public static int getClientBallance(Bank bank, String clientName) {

		int ballance = 0;

		for (Client client : bank.getClients()) {

			if (client.getName().equals(clientName)) {

				for (Account account : client.getAccounts()) {

					ballance += account.getAmount();
				}
			}
		}
		return ballance;
	}

	public static int getClientPositiveBallance(Bank bank, String clientName) {

		int ballance = 0;

		for (Client client : bank.getClients()) {

			if (client.getName().equals(clientName)) {

				for (Account account : client.getAccounts()) {

					if (account.getAmount() > 0) {
						ballance += account.getAmount();
					}
				}
			}
		}
		return ballance;
	}

	public static int getClientNegativeBallance(Bank bank, String clientName) {

		return getClientBallance(bank, clientName) - getClientPositiveBallance(bank, clientName);
	}

	public static void addAccount(Bank bank, String clientName, int accountNumber) {

		Account newAccount = new Account(accountNumber);

		if (isNewClient(bank, clientName)) {

			Client newClient = new Client(clientName);
			newClient.addAccount(newAccount);
			bank.addClient(newClient);

		} else {

			for (Client client : bank.getClients()) {

				if (client.getName().equals(clientName)) {
					client.addAccount(newAccount);
				}
			}
		}
	}

	private static boolean isNewClient(Bank bank, String clientName) {

		for (Client client : bank.getClients()) {

			if (client.getName().equals(clientName)) {
				return false;
			}
		}
		return true;
	}

	public static void closeAccount(Bank bank, int accountNumber) {

		int indexOfClient = 0;
		int indexOfAccount = 0;

		for (Client client : bank.getClients()) {
			for (Account account : client.getAccounts()) {

				if (account.getNumber() == accountNumber) {
					indexOfClient = bank.getClients().indexOf(client);
					indexOfAccount = client.getAccounts().indexOf(account);
				}
			}
		}
		bank.getClients().get(indexOfClient).getAccounts().remove(indexOfAccount);
	}

	public static void topUpAccountAmount(Bank bank, int accountNumber, int amount) {

		for (Client client : bank.getClients()) {
			for (Account account : client.getAccounts()) {

				if (account.getNumber() == accountNumber) {
					if (account.getState() == State.unlocked) {

						account.setAmount(account.getAmount() + amount);

					} else {
						System.out.println("Account " + accountNumber + " is locked");
					}
				}
			}
		}
	}

	public static void withdrawAccountAmount(Bank bank, int accountNumber, int amount) {

		int withdrawAmount = (-1) * amount;
		topUpAccountAmount(bank, accountNumber, withdrawAmount);
	}
}
