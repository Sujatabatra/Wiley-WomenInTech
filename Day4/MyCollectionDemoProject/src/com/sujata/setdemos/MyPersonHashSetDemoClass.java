package com.sujata.setdemos;

import java.util.HashSet;

import com.sujata.bean.Person;

public class MyPersonHashSetDemoClass {

	public static void main(String[] args) {
		HashSet<Person> personList=new HashSet<>();
		personList.add(new Person(101, "AAAAAA"));
		personList.add(new Person(102, "BBBBBB"));
		personList.add(new Person(103, "CCCCCC"));
		personList.add(new Person(101, "AAAAAA"));
		personList.add(new Person(104, "DDDDDD"));
		personList.add(new Person(105, "EEEEEE"));

		for(Person person:personList){
			System.out.println(person);
		}
	}

}
