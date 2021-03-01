package com.sujata.training;

public class QuestionAnswerMain {
	public static void main(String args[]) {
		
		Chat chat=new Chat();
		
		Thread anjali=new Thread(new QuestionJob(chat), "Anjali");
		Thread jincy=new Thread(new AnswerJob(chat), "Jincy");
		
		anjali.start();
		jincy.start();
	}

}
