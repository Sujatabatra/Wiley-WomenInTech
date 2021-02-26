package com.sujata.setdemos;

import java.util.TreeSet;

import com.sujata.bean.Book;
import com.sujata.bean.MyBook;
import com.sujata.bean.NoOfPagesSort;

public class MyOneMoreBookTreeSetDemo {

	public static void main(String[] args) {
		TreeSet<MyBook> bookList=new TreeSet<>(new NoOfPagesSort());
		
		bookList.add(new MyBook(101,"Book1","Author X",780,900));
		bookList.add(new MyBook(102,"Book2","Author Y",850,1900));
		bookList.add(new MyBook(103,"Book3","Author X",900,1500));
		bookList.add(new MyBook(101,"Book1","Author X",780,900));
		bookList.add(new MyBook(104,"Book4","Author Y",650,750));
		bookList.add(new MyBook(105,"Book5","Author M",800,500));
		
		for(MyBook book:bookList)
			System.out.println(book);

	}

}
