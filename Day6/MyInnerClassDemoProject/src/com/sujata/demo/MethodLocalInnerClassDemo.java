package com.sujata.demo;

class MyOuter{
	
	public void show(){
		int x=10;
		System.out.println("x : "+x);
		//method local inner class, you can instantiate only inside the method itself inwhich it is defined
		class MyInner{
			int y;
			void display(){
				System.out.println("x : "+x);
				System.out.println("y : "+y);
			}
		}
		MyInner iOb=new MyInner();
		System.out.println(iOb.y);
	}
}
public class MethodLocalInnerClassDemo {

	public static void main(String[] args) {
		MyOuter oOb=new MyOuter();
		oOb.show();
				

	}

}
