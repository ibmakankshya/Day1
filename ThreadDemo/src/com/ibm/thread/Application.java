package com.ibm.thread;

public class Application {
	public static void main(String[] args) {
		Thread t1 = new Worker();
		t1.start();//ti.run creates 1 thread all in main
		System.out.println("in man ");
		Thread t2 = new Thread(new anotherWoker());
		t2.start();
		System.out.println("Main thread" +Thread.currentThread() );
	}

}
//start makes a new thread not run
//run simply runs it