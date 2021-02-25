package com.sujata.demo;

import java.util.Scanner;

public class MySecondDemoClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[];
		int total = 0;
		int location = 0;
		int number1 = 0;
		int number2 = 0;
		int divide = 0;
		try {
			System.out.println("Enter First No. : ");
			number1 = scanner.nextInt();
			System.out.println("Enter Second No. : ");
			number2 = scanner.nextInt();

			divide = number1 / number2; // exceptional condition

			System.out.println("Division Result : " + divide);

			System.out.println("Enter total no of elements in an array : ");
			total = scanner.nextInt();
			arr = new int[total];

			for (int i = 0; i < total; i++) {
				System.out.println("Enter " + (i + 1) + " element : ");
				arr[i] = scanner.nextInt();

			}

			System.out.println("Enter location in an array whoes value you want to view : ");
			location = scanner.nextInt();
			System.out.println("Value at " + location + " : " + arr[location]);
		}

		catch (ArithmeticException exception) {
			System.out.println("Division By zero is infinite , so you can try with some different no : ");
			number2 = scanner.nextInt();
			try {
				divide = number1 / number2;

				System.out.println("Division Result : " + divide);
			} catch (ArithmeticException e) {
				System.out.println("Infinite");
			}

		}
		// catch(Exception exception){
		// System.out.println("Something went wrong , please try again after
		// sometime with different set of values");
		//
		// }
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("location " + location + " doesnot exist in an array");
		} catch (NegativeArraySizeException e) {
			System.out.println("size of an array can never be negative, please try again with positive value");
		}
		// generic handler must be the last one otherwise , specific handlers
		// those who appear after generic handler will become unreachable
		catch (Exception exception) {
			System.out.println("Something went wrong , please try again after sometime with different set of values");

		}
		//finally block withh execute no matter what if ur program control reached  try block
		finally{
			System.out.println("Hi I am finally Block!");
		}
		System.out.println("Good Bye from Main!!");

	}

}
