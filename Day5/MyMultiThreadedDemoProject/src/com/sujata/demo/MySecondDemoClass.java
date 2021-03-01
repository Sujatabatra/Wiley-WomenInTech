package com.sujata.demo;

class SecondThread extends Thread{
	
	public SecondThread(){
		super(); //calling Thread() constructor
	}
	public SecondThread(String name){
		super(name); //calling Thread(String) constructor
	}
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
public class MySecondDemoClass {

	public static void main(String[] args) {

		//New Born State
		//Names gets allocated to threads in constructor call itselfs
		SecondThread t1=new SecondThread(); //thread-0
		SecondThread t2=new SecondThread("Second-Thread"); //Second-Thread
//		t2.setName("Second-Thread");
		SecondThread t3=new SecondThread(); //thread-1
		SecondThread t4=new SecondThread(); //thread-2
		
		
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
