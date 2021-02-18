package com.sujata.demo;

/*Java Allows us to create a function , which can take variable number of argument
 * Rules for variable number of arguments
 * 1. there can be only one argument as variable argument in a function
 * 2. we can have multiple fixed arguments along with one variable of argument , but that variable argument must be the last argument in the argumnet list

*/
public class Addition {

	//whenever in arguments we are specifying argument with three dots(...) that argument becomes variable(any no i.e one or more values) argument
	public int sum(int ...values){
		int s=0;
		for(int number:values)
			s+=number;
		return s;
	}
	
	public double sum(String x,double ...values/*,String y*/){
		System.out.println(x);
		double s=0;
		for(double number:values)
			s+=number;
		return s;
		
	}
	
}
