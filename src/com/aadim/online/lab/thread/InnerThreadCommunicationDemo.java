package com.aadim.online.lab.thread;

class Customer {
	int balance = 10000;

	synchronized void withdraw(int amountToWithdraw) {
		System.out.println("going to withdraw...");

		if (this.balance < amountToWithdraw) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.balance -= amountToWithdraw;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int depositAmount) {
		System.out.println("going to deposit...");
		this.balance += depositAmount;
		System.out.println("deposit completed... ");
//		notify();
	}
}

public class InnerThreadCommunicationDemo {
	public static void main(String args[]) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();

	}
}