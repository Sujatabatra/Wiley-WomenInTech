package com.sujata.producer;

import java.util.Set;

public class Juggler implements Performer {

	private Set<Integer> balls;

	public void setBalls(Set<Integer> balls) {
		this.balls = balls;
	}

	@Override
	public void perform() {
		for (int ball : balls) {
			System.out.println("Juggler is juggling " + ball + " Balls!!");
		}

	}

}
