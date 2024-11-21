package Nov22;

import java.util.*;

import Nov19.SynchronizedApp;

class Bank{
	private double balanceAmt;
	public Bank() {
		balanceAmt=1000;
	}
	synchronized void deposit(int amt) {
		balanceAmt+=amt;
		System.out.println("After deposit your balance is "+balanceAmt);
		notify();
	}
	synchronized public void withdraw(int amt) throws InterruptedException {
		if(amt>balanceAmt)
			System.out.println("Insufficient balance");
		wait();
		balanceAmt-=amt;
		System.out.println("After withdrawal your balance is "+balanceAmt);
		
}	
	
	
}
public class ThreadCommunication {
	public static void main(String[] args) {
		Bank acc=new Bank();
		Thread t1=new Thread() {
			public void run() {
				try {
					acc.withdraw(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		Thread t2=new Thread() {
			public void run() {
				acc.deposit(3000);
			}
		};
		t2.start();
	}
}
