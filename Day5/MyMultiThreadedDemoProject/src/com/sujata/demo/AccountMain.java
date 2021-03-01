package com.sujata.demo;

public class AccountMain {

	public static void main(String[] args) {
//		Account a001=new Account();
//		
//		Thread sheeba=new Thread(a001,"Sheeba");
//		Thread rajLakshmi=new Thread(a001,"RajLakshmi");
		
		Thread sheeba=new Thread(new Account(),"Sheeba");
		Thread rajLakshmi=new Thread(new Account(),"RajLakshmi");
//		
		sheeba.start();
		rajLakshmi.start();

	}

}
