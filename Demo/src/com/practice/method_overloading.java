package com.practice;

public class method_overloading {
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static void add(double a,double b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) throws Exception {
		int x = add(4,5);
		System.out.println(x);
		add(5.5,12.9);
	}
}
