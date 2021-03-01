package com.sujata.demo;

public class Vedio extends Media {

	private int length;
	private String quality;
	
	public Vedio() {
		
	}
	
	public Vedio(String mediaId, String mediaName, int length, String quality) {
		super(mediaId, mediaName);
		this.length = length;
		this.quality = quality;
	}

	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
