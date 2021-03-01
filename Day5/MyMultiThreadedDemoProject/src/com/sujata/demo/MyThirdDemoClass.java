package com.sujata.demo;

class InputNumber{
	private int number;

	public InputNumber(){
		
	}
	public InputNumber(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}

class MyIterator extends InputNumber implements Runnable{
	
	
	public MyIterator() {
		super();
	}

	public MyIterator(int number) {
		super(number);
		
	}

	public void iterate(){
		for(int i=1;i<getNumber();i++)
			System.out.println(Thread.currentThread().getName()+" i : "+i);
	}

	@Override
	public void run() {
		iterate();
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MyThirdDemoClass {

	public static void main(String[] args) {
		
		MyIterator threadJob=new MyIterator(5);

		Thread t1=new Thread(threadJob); //thread-0
		Thread t2=new Thread(threadJob,"Second-Thread"); //Second-Thread
		Thread t3=new Thread(threadJob); //thread-1
		Thread t4=new Thread(threadJob); //thread-2
		
//		t2.setName("Second-Thread");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		for(int i=1;i<5;i++)
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}
