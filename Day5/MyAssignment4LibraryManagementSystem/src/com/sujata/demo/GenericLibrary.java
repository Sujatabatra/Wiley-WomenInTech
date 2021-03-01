package com.sujata.demo;

import java.util.ArrayList;

public class GenericLibrary<T>{

	private ArrayList<T> mediaList;
	
	public void insertMedia(T media){
		mediaList.add(media);
	}
	
	public T retreiveMedia(int index){
		return mediaList.get(index);
	}
	
}
