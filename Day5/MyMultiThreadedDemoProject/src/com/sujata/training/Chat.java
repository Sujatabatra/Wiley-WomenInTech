package com.sujata.training;

public class Chat {

	private boolean flag=true;
	
	synchronized public void showQuestion(String question){
		if(flag==false){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+question);
		flag=false;
		notify();
	}
	
	synchronized public void showAnswer(String answer){
		if(flag==true){
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+answer);
		flag=true;
		notify();
	}
}
