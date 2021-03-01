package com.sujata.demo;

abstract public class Media {

	private String mediaId;
	private String mediaName;
	public Media(){
		
	}
	public Media(String mediaId, String mediaName) {
		super();
		this.mediaId = mediaId;
		this.mediaName = mediaName;
	}

	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getMediaName() {
		return mediaName;
	}
	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}
	
	abstract public void display();
}
