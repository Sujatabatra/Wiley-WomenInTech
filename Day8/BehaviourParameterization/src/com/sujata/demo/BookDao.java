package com.sujata.demo;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BookDao implements ContractBookDao {

	private static ArrayList<Book> bookList=new ArrayList<>();
	
	static{
		bookList.add(new Book(101, "Book1", "Author A", 850, 1500));
		bookList.add(new Book(102, "Book2", "Author B", 300, 1000));
		bookList.add(new Book(103, "Book3", "Author A", 950, 500));
		bookList.add(new Book(104, "Book4", "Author A", 1850,1900));
		bookList.add(new Book(105, "Book5", "Author C", 8150,2400));
		bookList.add(new Book(106, "Book6", "Author D", 510, 3500));
	}
	
	public ArrayList<Book> getBookList(){
		return bookList;
	}
	
	public ArrayList<Book> getBookWrittenByAuthorA(){
		ArrayList<Book> newBookList=new ArrayList<>();
		for(Book book:bookList){
			if(book.getAuthorName().equals("Author A")) //Behaviour
				newBookList.add(book);
		}
		return newBookList;
	}
	public ArrayList<Book> getThickBooks(){
		ArrayList<Book> newBookList=new ArrayList<>();
		for(Book book:bookList){
			if(book.getNoOfPages()>1000) //Behaviour
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public ArrayList<Book> searchBook(BookPredicate bookPredicate) {
//		ArrayList<Book> newBookList=new ArrayList<>();
//		for(Book book:bookList){
//			if(bookPredicate.test(book))
//				newBookList.add(book);
//		}
		ArrayList<Book> newBookList=(ArrayList)bookList.stream()
//				.filter(book->bookPredicate.test(book))
				.filter(bookPredicate::test)
				.collect(Collectors.toList());
		return newBookList;
	}
}
