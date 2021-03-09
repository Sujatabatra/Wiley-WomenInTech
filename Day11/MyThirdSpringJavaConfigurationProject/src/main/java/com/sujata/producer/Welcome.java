package com.sujata.producer;

public class Welcome {

	private Greet greet;

	public Welcome() {

	}

	public Welcome(Greet greet) {
		super();
		this.greet = greet;
	}

	public void setGreet(Greet greet) {
		this.greet = greet;
	}

	public void welcomeMessage() {
		System.out.print("Welcome to welcome class : ");
		greet.wish();
	}
}
