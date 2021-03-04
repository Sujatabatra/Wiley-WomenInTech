package com.sujata.demo;

interface Sum{
	void add(int n1,int n2);
}

public class MySecondDemo {
	
	public static void main(String args[]){
//      Sum sVar=new Sum() {	
//		@Override
//		public void add(int n1, int n2) {
//			System.out.println("Addition : "+(n1+n2));
//			
//		}
//	};		
	
//		Sum sVar=(int n1, int n2)-> {
//				System.out.println("Addition : "+(n1+n2));
//				
//			};
		Sum sVar=(n1,n2)-> System.out.println("Addition : "+(n1+n2));
				
			
	sVar.add(15, 20);
	}

}
