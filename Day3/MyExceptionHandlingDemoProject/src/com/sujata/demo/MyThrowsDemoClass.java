package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyThrowsDemoClass {

	static public void openFile(String name) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(name);
			System.out.println(name + " file opened");

		} catch (FileNotFoundException e) {
			System.out.println(name + " file don't exist");
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	// throws is applicable only at function level, the caller function needs to
	// handle it appropriately
	static public void newOpenFile(String name) throws IOException {
		FileInputStream fis = null;

		fis = new FileInputStream(name);
		System.out.println(name + " file opened");

		if (fis != null)
			fis.close();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name : ");
		String name = sc.next();
		openFile(name); // client will get fixed message if file doesnot exist

		try {
			newOpenFile(name);
		} catch (IOException ex) {
			System.out.println("File with name " + name + " doesnot exist");
		}

	}

}
