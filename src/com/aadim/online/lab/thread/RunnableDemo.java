package com.aadim.online.lab.thread;

/**
 * There is a balance 10k in account.
 * <p>
 * CardSwap request is 6k and
 * <p>
 * ChequeRequest is 5k
 *
 */
public class RunnableDemo {
	public static void main(String[] args) {
		Account account = new Account();
		CardSwap cs = new CardSwap(account, 6000);
		cs.setName("Card swap thread ");
		cs.start();

		ChequeRequest cr = new ChequeRequest(account, 5000);
		cr.setName("Cheque request thread ");
		cr.start();

		try {
//			cs.join();
//			cr.join();

			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Remaining Balance is: " + Account.balance);
	}

}

class CardSwap extends Thread {
	private int amount;
	private Account account;

	public CardSwap(Account account, int debitAmount) {
		this.account = account;
		this.amount = debitAmount;
	}

	public void run() {
		if (account.withdraw(amount))
			System.out.println(Thread.currentThread().getName() + " success amount is " + amount);
		else
			System.out.println(Thread.currentThread().getName() + " Failed!");
	}

}

class ChequeRequest extends Thread {
	private int amount;
	private Account account;

	public ChequeRequest(Account account, int debitAmount) {
		this.account = account;
		this.amount = debitAmount;
	}

	public void run() {
		if (account.withdraw(amount))
			System.out.println(Thread.currentThread().getName() + " success amount is " + amount);
		else
			System.out.println(Thread.currentThread().getName() + " Failed!");
	}

}

class Account {
	public static int balance = 10000;

	 boolean  withdraw(int debitAmount) {
		 // This is the line I've added after our class
		try {
			//waiting for a second 
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (hasEnoughBalance(debitAmount)) {
			balance = balance - debitAmount;
			System.out.println("Balance after withdrawal: "+balance);
			return true;
		} else {
			System.out.println(Thread.currentThread().getName() + " Insufficient balance.");
			return false;
		}
	}

	boolean hasEnoughBalance(int debitAmount) {
		if (balance >= debitAmount)
			return true;
		else
			return false;
	}
}
