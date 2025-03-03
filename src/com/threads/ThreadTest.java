package com.threads;

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("this is main method entry");
		
		
		Thread t1 = new Thread(new RunnableThread());
	//	t1.setDaemon(true);
		//t1.setPriority(1);
		t1.start();
		
		Thread t2 = new ThreadFromClass();
		t2.start();
		
		System.out.println("this is main method exit");

	}

}
