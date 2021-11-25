package com.aadim.online.lab.thread;

public class ThreadDemo extends Thread {
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo(); // new
		td.start();// runnable
	}

	public void run() { // running when it starts execution
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Value of i " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// terminate
	}
	
}
