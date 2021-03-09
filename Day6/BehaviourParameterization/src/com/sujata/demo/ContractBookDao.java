package com.sujata.demo;

import java.util.ArrayList;

public interface ContractBookDao {

	public ArrayList<Book> searchBook(BookPredicate BookPredicate);
	
	default public ArrayList<Book> getBookList(){
		return null;
	}
	default public ArrayList<Book> getBookWrittenByAuthorA(){
		return null;
	}
	
	default public ArrayList<Book> getThickBooks(){
		return null;
	}
}
