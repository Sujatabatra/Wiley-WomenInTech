package com.sujata.training;

import com.sujata.demo.Palindrome;
import com.sujata.demo.Reverse;

public class OneMoreMain {

	public static void main(String[] args) {
		
		int number=123431;
		Palindrome pOb=new Palindrome();
		pOb.setNumber(number);
		if(pOb.isPalindrome())
			System.out.println("As no is Palindrome so reverse is same only as that of no.");
		else{
			Reverse rOb=new Reverse();
			rOb.setNumber(number);
			rOb.calculateReverse();
			System.out.println("Reverse No is "+rOb.getReverse());
		}

	}

}
