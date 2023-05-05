package com.demo.thread;

public class ThreadMainMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		ThreadInterface thread= new ThreadInterface();
		
		mt.start();
		//mt.sleep(0);
		Thread m2= new Thread(thread);
		m2.start();

	}

}
