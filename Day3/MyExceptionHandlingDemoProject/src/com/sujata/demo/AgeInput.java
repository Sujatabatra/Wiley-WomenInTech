package com.sujata.demo;

public class AgeInput {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18){
			throw new AgeUncheckedException("age can't be less than 18");
		}
		this.age = age;
	}
	
	public void setOneMoreAge(int age) throws AgeCheckedException {
		if(age<18){
			throw new AgeCheckedException("age can't be less than 18");
		}
		this.age = age;
	}
	
	
	
}
