package com.sujata.demo;

public class Palindrome {

	private int number;
	private boolean palindrome;
		public void setNumber(int number) {
		this.number = number;
	}
	public boolean isPalindrome() {
	
		Reverse reverse=new Reverse();
		reverse.setNumber(number);
		reverse.calculateReverse();
		if(number==reverse.getReverse())
			palindrome=true;
		else
			palindrome=false;
		return palindrome;
	}
	
	
	
}
