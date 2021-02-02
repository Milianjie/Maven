package com.studymyself;

public class HelloMaven{
	
	public int add(int a,int b){
		
		return a+b;
		
	}
	
	public static void main(String[] args){
		
		HelloMaven hello = new HelloMaven();
		
		int res = hello.add(10,20);
		
		System.out.println("10+20="+res);
		
	}
	
}