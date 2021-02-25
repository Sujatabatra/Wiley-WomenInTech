package com.sujata.demo;

public class Matrix {

	private int arr[][];
	private int rows,cols;
	
	public Matrix(int rows,int cols){
		this.rows=rows;
		this.cols=cols;
		arr=new int[rows][cols];
	}
}
