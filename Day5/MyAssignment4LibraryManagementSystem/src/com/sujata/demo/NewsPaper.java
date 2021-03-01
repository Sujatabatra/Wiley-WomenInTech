package com.sujata.demo;

import java.time.LocalDate;

public class NewsPaper extends Media {

	private LocalDate date;
	private int NoOfSections;
	
	public NewsPaper() {
		
	}
	
	
	public NewsPaper(String mediaId, String mediaName, LocalDate date, int noOfSections) {
		super(mediaId, mediaName);
		this.date = date;
		NoOfSections = noOfSections;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public int getNoOfSections() {
		return NoOfSections;
	}


	public void setNoOfSections(int noOfSections) {
		NoOfSections = noOfSections;
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
