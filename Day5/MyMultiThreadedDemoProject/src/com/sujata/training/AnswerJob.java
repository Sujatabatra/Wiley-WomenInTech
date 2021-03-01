package com.sujata.training;

public class AnswerJob implements Runnable {

	private Chat chat;
	String answers[]={"Hello","I am Good","Thanks!"};
	
	
	public AnswerJob(Chat chat) {
		super();
		this.chat = chat;
	}


	@Override
	public void run() {
		for(String answer:answers){
			chat.showAnswer(answer);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}
	
	
}
