package com.sujata.demo;

public interface RoundedShape extends Shape,Greet {

	//all variable in an interface is of type public static final
	//naming convention for constant variable is : UPPER_CASE
	double PI=3.14;
	void circumference();
}
