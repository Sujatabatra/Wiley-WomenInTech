package com.sujata.demo;

public class Audio extends Media{

	private int lengthOfAudio;
	private String format;
	
	public Audio() {
		
	}
	
	public Audio(String mediaId, String mediaName, int lengthOfAudio, String format) {
		super(mediaId, mediaName);
		this.lengthOfAudio = lengthOfAudio;
		this.format = format;
	}


	public int getLengthOfAudio() {
		return lengthOfAudio;
	}


	public void setLengthOfAudio(int lengthOfAudio) {
		this.lengthOfAudio = lengthOfAudio;
	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
