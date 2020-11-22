package by.java_intro_online.mod04.task14_account;

/* Create classes Account, Client and Bank.
 * Methods:
 * - locking and unlocking of accounts;
 * - search and sorting of accounts;
 * - count of accounts amount sum;
 * - count of amount sums for accounts with positive and negative balances separately. 
 */

public class Main {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		Logic.addAccount(bank, "Cay Horstmann", 1);
		Logic.addAccount(bank, "Robert Martin", 2);		
		Logic.addAccount(bank, "Bruce Eckel", 3);
		Logic.addAccount(bank, "Bruce Eckel", 4);
		Logic.addAccount(bank, "Bruce Eckel", 5);
		Logic.addAccount(bank, "Bruce Eckel", 6);

		Logic.topUpAccountAmount(bank, 3, 500);
		Logic.topUpAccountAmount(bank, 4, 100);
		Logic.topUpAccountAmount(bank, 5, 10);
		Logic.topUpAccountAmount(bank, 6, 300);
		
		View.outputBankDatabase(bank);
		
		Logic.closeAccount(bank, 1);
		Logic.closeAccount(bank, 2);
		Logic.sortAccounts(bank, "Bruce Eckel");
		Logic.lockAccount(bank, "Bruce Eckel", 3);
		
		View.outputBankDatabase(bank);
		
	}
}
