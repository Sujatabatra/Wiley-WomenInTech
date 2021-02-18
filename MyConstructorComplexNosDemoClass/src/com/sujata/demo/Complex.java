package com.sujata.demo;

/*
 * Constructors : we will be writing in class whose object we want to initialize while declaring them 
 * Rules 
 * 1. Constructor name should be same as that of your class name
 * 2. Constructor can be argumented as well as non argumented
 * 3. Constructor don't have return type not even void
 * 4. Constructor can exist in any of the scope , ie. private, default and public
 * --------------------------------------------------------------------------
 * If class is constructor challenged(No Constructor), compiler will create one no argument(default) constructor for us, 
 * default constructor will initialise all instance variable with default value : 
 * byte,short,int=0, long =0L, float=0.0f;double=0.0,boolean=false, object=null
 *  
 * If my class is not constructor challenged( i.e even if class have any one constructor written by developer) , 
 * compiler will not provide us with default constructor
 * 
 * We can create multiple constructors and we call them as constructor overloading : 
 * each constructor will be differentiated from one another w.r.t its signature
 * signature : number and type of arguments and its sequence
 */
public class Complex {

	private int real,imag;
	//default constructor : Zero Argument Constructor
	Complex(){
		
	}
	public Complex(int r,int i){
		real=r;
		imag=i;
	}
	
	private Complex(int r){
		real=r;
		imag=7;
	}
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
	
	public Complex getComplex(){
		Complex c=new Complex(6);
		return c;
	}
}
