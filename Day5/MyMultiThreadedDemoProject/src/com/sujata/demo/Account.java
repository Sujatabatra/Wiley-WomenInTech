package com.sujata.demo;

public class Account implements Runnable {

	private static int balance = 1000;

	//class level locking
//	synchronized static public void withdrawl() {
	//object level locking	
	synchronized  public void withdrawl() {
		//putting lock
		//classLevel Locking
//		synchronized (Account.class) {
       
//		//Object Level lock
//		synchronized (this) {
			if (balance > 800) {
				System.out.println(Thread.currentThread().getName()
						+ " sufficient funds in your account to withdraw , you balance is : Rs." + balance);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance -= 800;
				System.out
						.println(Thread.currentThread().getName() + " your balance after withdraw is : Rs." + balance);
			} else {
				System.out.println(Thread.currentThread().getName()
						+ " insufficient funds in your account to withdraw, your balance is : Rs." + balance);
			}
//		} //releasing lock
	}

	@Override
	public void run() {
		withdrawl();

	}

}
