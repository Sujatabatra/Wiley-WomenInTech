package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class MyLinkedListDemoClass {

	public static void main(String args[]){
		//Ordered Duplicate collection of elements
		List<Integer> myList=new LinkedList<>();
		myList.add(10);
		myList.add(20);
		myList.add(6);
		myList.add(150);
		System.out.println(myList);
		System.out.println("Size of myList : "+myList.size());
		
		myList.add(20);
		System.out.println(myList);
		System.out.println("Size of myList : "+myList.size());
		
		myList.remove(new Integer(20));
		System.out.println(myList);
		System.out.println("Size of myList : "+myList.size());
		
		System.out.println("Travesal using traditional for loop");
		for(int index=0;index<myList.size();index++){
			System.out.println(myList.get(index));
		}
		
		System.out.println("Travel using for each loop ");
		for(Integer ele:myList){
			System.out.println(ele);
		}
		
		System.out.println("Travesal using Iterator Interface");
		Iterator<Integer> it=myList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("Backward traveral using ListIterator Interface");
		/*
		 * ListIterator interface is only available to List interface implementation classes
		 * ListIterator is ByDirectional Iterator
		 */
		ListIterator<Integer> li=myList.listIterator();
		
		while(li.hasNext()){
			li.next();
		}
		while(li.hasPrevious())
			System.out.println(li.previous());
	}
}
