package com.ibm;

import com.A;

public class Application {
	public static void main(String[] args) {
		A b = new B(); //allowed as B is a type of A
		//A b3 = new A(); 
		System.out.println(b.age);
		b.m1();
		((B)b).m();//downcasting
	}
}
