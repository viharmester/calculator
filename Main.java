package com.andorid;

import java.lang.Math;

public class Main {

	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public int mult(int a, int b) {
		return a*b;
	}
	
	public int sqrt(int a) {
		return Math.sqrt(a);
	}
	
	public int add(int a, int b) {
		System.out.println("This is add method");
		System.out.println("This is add method for 2 params");
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		System.out.println("This is add method for 3 params");
		return add(add(a+b), c);
	}
	
	public int add(int a, int b, int c, int d) {
		System.out.println("This is add method for 4 params");
		return add(add(add(a+b), c), d);
	}
}
