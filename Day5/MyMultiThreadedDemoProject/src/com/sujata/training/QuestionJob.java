package com.sujata.training;

public class QuestionJob implements Runnable {

	private Chat chat;
	String questions[] = { "Hi", "How are you", "Gr8!" };

	public QuestionJob(Chat chat) {
		super();
		this.chat = chat;
	}

	@Override
	public void run() {
		for (String question : questions) {
			chat.showQuestion(question);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
