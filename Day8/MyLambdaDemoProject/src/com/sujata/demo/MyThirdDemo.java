package com.sujata.demo;

interface MySum{
	int add(int n1,int n2);
}
public class MyThirdDemo {

	public static void main(String[] args) {
		
//		MySum sVar=new MySum() {
//			
//			@Override
//			public int add(int n1, int n2) {
//				return n1+n2;
//			}
//		};
		MySum sVar=(n1, n2) -> n1+n2;
		
		System.out.println("Sum : "+sVar.add(12, 78));
		

	}

}
