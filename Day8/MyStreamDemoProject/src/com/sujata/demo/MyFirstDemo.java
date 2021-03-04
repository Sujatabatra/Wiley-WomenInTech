package com.sujata.demo;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyFirstDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,23,36,40,59,60);
		
		Stream<Integer> stream=list.stream();
		
		
		long totalNoOfElements=stream.count();
		System.out.println("Total no of Elements :"+totalNoOfElements);
		
		list.stream().forEach(arg->System.out.println(arg));
		
		System.out.println("=================");
		
		list.stream().forEach(System.out::println);
		
		System.out.println("=====================");
		list.stream()
		.filter(element->element%2!=0)
		.forEach(System.out::println);

		List<Integer> newList=list.stream()
		.filter(ele->ele%5==0)
		.collect(Collectors.toList());
		
		System.out.println(newList);
		
		System.out.println("=============");
		list.stream()
//		.parallel()      //convert sequential stream to parallel
		.filter(ele->ele%5==0) //intermediate
		.map(element->element/5) //intermediate (filter, map)
		.forEach(System.out::println); //terminate function (collect, forEach, count)
		
		//while making use of streams we can use multiple intermediate methods but one terminal method to get the output

	
		list.parallelStream().forEach(System.out::println);
		
	
		int sum=list.stream()
		.mapToInt(ele->ele)     //converted Stream<Integer> to IntStream 
		.sum();
		
		System.out.println("sum : "+sum);
		
		System.out.println(list.stream().collect(Collectors.counting()));
		
		
	}

}
