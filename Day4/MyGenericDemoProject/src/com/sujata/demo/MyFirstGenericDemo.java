package com.sujata.demo;

class InputNumber{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

class InputString{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}

class InputDouble{
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
/*
 * you can create class which are independent of 'Object types' : generic classes 
 * function which are independent of 'Object types' : generic function
 */
//We can create generic classes and functions
class InputValue<T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}

class Person{
	private int pId;
	private String pName;
	public Person(){
		
	}
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
}
public class MyFirstGenericDemo {

	public static void main(String[] args) {
		InputNumber iOb=new InputNumber();
		iOb.setValue(10);
		System.out.println("Value : "+iOb.getValue());

		//<> : diamond operator ( Java 1.7)
		//InputValue<Integer> iOb1=new InputValue<Integer>(); : code till JDK1.6 
		InputValue<Integer> iOb1=new InputValue<>();
		iOb1.setValue(10);
		System.out.println("iOb1 value "+iOb1.getValue());
		
		InputValue<String> sOb=new InputValue<>();
		sOb.setValue("Sujata");
		System.out.println("sOb value : "+sOb.getValue());
	
		InputValue<Person> pOb=new InputValue<>();
		pOb.setValue(new Person(101, "AAAAA"));
		Person person=pOb.getValue();
		System.out.println(person.getpId()+" : "+person.getpName());
	}

}
