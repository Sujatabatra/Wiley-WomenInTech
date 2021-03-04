package com.sujata.methodreferencedemos;

class Person {
	private int pId;
	private String pName;

	public Person() {

	}

	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}

}

interface PersonFactory{
	Person getInstance(int id,String name);
}

public class MyThirdClass {

	public static void main(String[] args) {
		
//		PersonFactory pOb=(id,name)-> new Person(id,name);
		
		PersonFactory pOb=Person::new;
		
		System.out.println(pOb.getInstance(101, "AAAAA"));

	}

}
