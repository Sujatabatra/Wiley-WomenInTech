package com.sujata.demo;

class FirstThread extends Thread{
	
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}

/*Single Threaded
 * Whenever we were running our application: one thread was executing and that was main
 * All threads follow parent child relationship
 * 
 */
public class MyFirstDemoClass {

	public static void main(String[] args) {

		//New Born State
		//Names gets allocated to threads in constructor call itselfs
		FirstThread t1=new FirstThread(); //thread-0
		FirstThread t2=new FirstThread(); //thread-1
		t2.setName("Second-Thread");
		FirstThread t3=new FirstThread(); //thread-2
		FirstThread t4=new FirstThread(); //thread-3
		
		
		//moving thread from new born to ready /running , depending upon scheduler
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}
