package com.ibm.thread;

public class anotherWoker implements Runnable{//can use both
	@Override
	public void run() {
		System.out.println("in another");
	}
}
//runnable is preffered