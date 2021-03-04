package com.sujata.demo;

public class AuthorAWrittenBook implements BookPredicate {

	@Override
	public boolean test(Book book) {
		// TODO Auto-generated method stub
		return book.getAuthorName().equals("Author A");
	}

}
