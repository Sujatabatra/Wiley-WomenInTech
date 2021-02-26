package com.sujata.demo;

class Demo{
	int i; //instance variable (Heap) : gets default initial values : byte:0, short:0, int:0, long:0L, float:0.0f, double=0.0, boolean:false, Object :null
	public void show(){
		int y;  //local variable (Stack) : local variables don't get default initial value so to use them first we need to initalize them 
		y=9;
		System.out.println("y : "+y); //if we don't initialize local variable before using them compile will going to compaint about it
	}
	public void showI(){
		System.out.println(" i : "+i);
	}
}
public class LocalVsInstanceVariables {

	public static void main(String[] args) {
		Demo dOb=new Demo();
		dOb.showI();

	}

}
