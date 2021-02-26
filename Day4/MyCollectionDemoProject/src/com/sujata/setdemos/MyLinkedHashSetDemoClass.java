package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkedHashSetDemoClass {

	public static void main(String[] args) {
		//Ordered unique collection of elements : auto growable and auto shrinkable
		Set<Integer> myCollection=new LinkedHashSet<>();
		
		myCollection.add(10);
		myCollection.add(20);
		myCollection.add(30);
		myCollection.add(5);
		myCollection.add(20);
		
		System.out.println("Size of myCollection : "+myCollection.size());
		System.out.println(myCollection);
		
		myCollection.add(67);
		System.out.println("Size of myCollection : "+myCollection.size());

		myCollection.remove(20);
		
		System.out.println("Size of myCollection : "+myCollection.size());
		System.out.println(myCollection);
		System.out.println("Traversal using for each");
		for(Integer element:myCollection){
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator Interface");
		/*
		 * myCollection.iterator : returning object of the class which is implementing Iterator Interface
		 * when we are giving someone else the responsibility of object creation : Factory Design Pattern
		 */
		Iterator<Integer> it=myCollection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
