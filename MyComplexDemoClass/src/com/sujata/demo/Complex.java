package com.sujata.demo;

public class Complex {

	private int real,imag;
	
	public void input(int r,int i){
		real=r;
		imag=i;
	}
	
	public void display(){
		//print() : after display keeps cursor on same line
		//where, println() ntakes cursor to next line after display
		System.out.print(real);
		if(imag>0)
			System.out.println("+"+imag+"i");
		else if(imag<0)
			System.out.println(imag+"i");
	}
	
	public void sumComplex(Complex c1,Complex c2){
		real=c1.real+c2.real;
		imag=c1.imag+c2.imag;
	}
}
