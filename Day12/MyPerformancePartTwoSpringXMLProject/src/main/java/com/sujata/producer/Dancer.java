package com.sujata.producer;

import java.util.Map;
import java.util.Set;

public class Dancer implements Performer {

	private Map<String, String> songsStyles;

	public Dancer(Map<String, String> songsStyles) {
		super();
		this.songsStyles = songsStyles;
	}

	@Override
	public void perform() {
		Set<String> songs=songsStyles.keySet();
		for(String song:songs) {
			System.out.println("Dancer is dancing in "+songsStyles.get(song)+" on "+song);
		}
	}

}
