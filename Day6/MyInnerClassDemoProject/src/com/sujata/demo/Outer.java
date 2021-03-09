package com.sujata.demo;



public class Outer {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public class Inner {
		private int j;

		public int getJ() {
			return j;
		}

		public void setJ(int j) {
			this.j = j;
		}

		void show() {
			System.out.println("i : " + i);
			System.out.println("j : " + j);
		}
	}

	public void display(){
		System.out.println("i : "+i);
		//Inner class member will not be directly accessible to outer class
//		System.out.println("j : "+j);
		Inner ob=new Inner();
		System.out.println("j :"+ob.j);
	}
}
