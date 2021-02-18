package com.sujata.demo;
/*
 * Overloading : create multiple function with same name,
 * each function will be differentiated from one another w.r.t it signature
 * signature : no and types of arguments and arguments sequence
 * 
 */
public class Shapes {

	public int area(int l,int b){
		return l*b;
	}
	
	public int area(int s){
		return 4*s;
	}
	
	/*var arg method is not the replacement of method overloading , because in method overloading every function can have different bussiness logic
	whereas in var arg arguments numbers change but bussiness logic remains same*/
//	public int area(int ...values){
//		
//	}
	
	public double area(double r){
		return 3.14*r*r;
	}
}
