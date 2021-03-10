package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Jincy")
public class Singer implements Performer {

	@Value("Twinkle Twinkle Little Star")
	private String song;

	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing " + song + "!!!");

	}

}
