package com.sujata.demo;

import java.util.ArrayList;

public class MainBook {

	public static void main(String[] args) {
		ContractBookDao bookDao=new BookDao();
//		
//		ArrayList<Book> books=bookDao.searchBook(new BookPredicate() {
//			
//			@Override
//			public boolean test(Book book) {
//				return true;
//			}
//		});
		ArrayList<Book> books=bookDao.searchBook(book-> true);
			
		for(Book book:books)
			System.out.println(book);
		System.out.println("====================");
		
		ArrayList<Book> books1=bookDao.searchBook(new AuthorAWrittenBook());
		for(Book book:books1)
			System.out.println(book);

		System.out.println("=======================");
		
		ArrayList<Book> books2=bookDao.searchBook(new ThickBook());
		for(Book book:books2)
			System.out.println(book);
		
		System.out.println("==============================");
//		ArrayList<Book> costlyBooks=bookDao.searchBook(new BookPredicate() {
//			
//			@Override
//			public boolean test(Book book) {
//				return book.getPrice()>1500;
//			}
//		});
//		
		ArrayList<Book> costlyBooks=bookDao.searchBook(book-> book.getPrice()>1500);
			
		for(Book book:costlyBooks){
			System.out.println(book);
		}

	}

}
