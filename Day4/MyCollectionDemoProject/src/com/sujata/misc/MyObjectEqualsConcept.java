package com.sujata.misc;

public class MyObjectEqualsConcept {

	public static void main(String[] args) {
		Integer i=10;
		Integer j=10;
		if(i==j){
			System.out.println("i and j are equal");
		}
		else{
			System.out.println("i and j are not equal");
		}

		Person p1=new Person(101, "AAAA");
		Person p2=new Person(101, "AAAA");
		
		if(p1==p2){
			System.out.println("p1 and p2 are equal");
		}
		else{
			System.out.println("p1 and p2 are not equal");
		}
		
		if(p1.equals(p2)){
			System.out.println("p1 and p2 are equal");
		}
		else{
			System.out.println("p1 and p2 are not equal");
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
			
	}

}
