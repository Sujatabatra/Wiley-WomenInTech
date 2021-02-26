package com.sujata.setdemos;

import java.util.TreeSet;

import com.sujata.bean.Book;

public class MyBookTreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Book> bookList=new TreeSet<>();
		
		bookList.add(new Book(101,"Book1","Author X",780,900));
		bookList.add(new Book(102,"Book2","Author Y",850,1900));
		bookList.add(new Book(103,"Book3","Author X",900,1500));
		bookList.add(new Book(101,"Book1","Author X",780,900));
		bookList.add(new Book(104,"Book4","Author Y",650,750));
		bookList.add(new Book(105,"Book5","Author M",800,500));
		
		for(Book book:bookList)
			System.out.println(book);

	}

}
