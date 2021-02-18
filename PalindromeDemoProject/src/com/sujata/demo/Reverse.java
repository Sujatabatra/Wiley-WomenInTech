package com.sujata.demo;

public class Reverse {

	private int number,reverse;

		public void setNumber(int number) {
		this.number = number;
	}

	public int getReverse() {
		return reverse;
	}

	public void calculateReverse(){
		reverse=0;
		int remainder;
		while(number!=0){
			remainder=number%10;
			reverse=reverse*10+remainder;
			number/=10;
		}
	}
	
}
