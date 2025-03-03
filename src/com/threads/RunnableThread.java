package com.threads;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("this is threadfrom class "+i+
					" "+Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}

}
