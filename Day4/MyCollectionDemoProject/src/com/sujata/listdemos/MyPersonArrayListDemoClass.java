package com.sujata.listdemos;

import java.util.ArrayList;

import com.sujata.bean.Person;

public class MyPersonArrayListDemoClass {

	public static void main(String[] args) {
		ArrayList<Person> personList=new ArrayList<>();
		
		personList.add(new Person(101, "AAAAA"));
		personList.add(new Person(102, "BBBBB"));
		personList.add(new Person(103, "CCCCC"));
		personList.add(new Person(104, "DDDDD"));
		personList.add(new Person(105, "EEEEE"));
		
		for(Person person:personList){
			System.out.println(person);
		}

	}

}
