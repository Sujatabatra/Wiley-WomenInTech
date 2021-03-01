package com.sujata.demo;

import java.util.ArrayList;

public class NonGenericLibrary {

	private ArrayList<Media> mediaList;
	
	public void insertMedia(Media media){
		mediaList.add(media);
	}
	
	public Media retreiveMedia(int index){
		return mediaList.get(index);
	}
	
}
