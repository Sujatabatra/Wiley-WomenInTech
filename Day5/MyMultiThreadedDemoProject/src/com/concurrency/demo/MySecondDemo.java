package com.concurrency.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadJob implements Runnable{

	private int counter;
	
	public MyThreadJob(int counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" counter : "+counter);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
public class MySecondDemo {

	public static void main(String[] args) {
		ExecutorService threadPool=Executors.newFixedThreadPool(4);
		
		for(int jobId=1;jobId<=10;jobId++){
			threadPool.execute(new MyThreadJob(jobId));
		}
		
		threadPool.execute(new ThreadJob(999));
		
		threadPool.shutdown();
		
		threadPool.execute(new ThreadJob(111));
		

	}

}
