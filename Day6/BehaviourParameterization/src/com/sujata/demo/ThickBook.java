package com.sujata.demo;

public class ThickBook implements BookPredicate {

	@Override
	public boolean test(Book book) {
		// TODO Auto-generated method stub
		return book.getNoOfPages()>1000;
	}

}
