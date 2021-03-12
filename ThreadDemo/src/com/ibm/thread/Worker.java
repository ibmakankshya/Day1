package com.ibm.thread;

public class Worker extends Thread{

	@Override
	public void run(/*/int i wont work here//*/) {
		System.out.println(Thread.currentThread());
	}

	}
//1 thread - main thread

