package com.sujata.demo;

/*
 * Naming convention for interface is that interface name should be in PasaclCase
 * Interfaces : 100% abstract classes or 100% contract
 */
public interface Shape {
	// if we are not specifying scope on method inside interface it does not mean default but it means public 
	//even if you don't make use of abtract keywork on method inside interface still method is abstract
	void area(); // abstract method : contract
//	public void area();
//	abstract void area();
//	public abstract area();
	
	void show();
	

}
