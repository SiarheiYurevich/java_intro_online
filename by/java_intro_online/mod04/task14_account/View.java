package by.java_intro_online.mod04.task14_account;

/* Create classes Account, Client and Bank.
 * Methods:
 * - locking and unlocking of accounts;
 * - search and sorting of accounts;
 * - count of accounts amount sum;
 * - count of amount sums for accounts with positive and negative balances separately. 
 */

public class View {
	
	public View(){
	}
	
	public static void outputBankDatabase(Bank bank) {
		
		for (Client client : bank.getClients()) {
			
			System.out.println("Client name: " + client.getName());
			
			for (Account account : client.getAccounts()) {
				
				System.out.println(account.toString());
			}
		}
		System.out.println();
	}
}
