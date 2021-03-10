package com.sujata.producer;

import java.util.Map;
import java.util.Set;

public class Instrumentalist implements Performer {

	private Map<String, Instrument> songsInstruments;

	public void setSongsInstruments(Map<String, Instrument> songsInstruments) {
		this.songsInstruments = songsInstruments;
	}

	@Override
	public void perform() {

		Set<String> songs=songsInstruments.keySet();
		for(String song:songs) {
			System.out.print("Instrumentlist is playing ");
			songsInstruments.get(song).play();
			System.out.println(" on song "+song);
		} 
	}

}
