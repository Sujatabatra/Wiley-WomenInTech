package com.sujata.training;

import com.sujata.demo.Palindrome;

public class MainClass {

	public static void main(String[] args) {
		
		Palindrome palindrome=new Palindrome();
		int number=12321;
		palindrome.setNumber(number);
		if(palindrome.isPalindrome())
			System.out.println(number +" is palindrome ");
		else
			System.out.println(number +" is not palindrome ");

	}

}
