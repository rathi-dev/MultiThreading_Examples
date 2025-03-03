package com.threads;

import java.util.Arrays;


// implementation of stack using simple int array

public class Stack {
	
	private int[] array;
	private int stackTop;
	
	public Stack(int capacity) {
		array = new int[capacity];
		stackTop = -1;
	}
	
	public boolean isEmpty() {
		return stackTop < 0;
	}

	public boolean isFull() {
		return stackTop >= array.length -1;
	}
	
	public synchronized boolean push(int element) {
	
		boolean isPush = false;
		
		if(isFull()) {
			return isPush;
		}
		else {
			++stackTop;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		array[stackTop] = element;
		isPush = true;
		}
		
		return isPush;
		
	}
	
	public synchronized int pop() {
		
	
		if(isEmpty()) {
			return -1;
		} else {
		
			
		int element = array[stackTop];
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stackTop--;
		return element;
		}
		
	}
	
	public static void main(String args[]) {
		Stack s1 = new Stack(5);
		//System.out.println(Integer.MIN_VALUE);
		new Thread( 
				() -> {
			int counter = 0;
			while(++counter<=10) {
				System.out.println("pushing "+counter+"th time "+s1.push(100));
			}
			
		},"pusher").start();
		
		new Thread( 
				() -> {
			int counter = 0;
			while(++counter<=10) {
				System.out.println("popping "+counter+"th time "+s1.pop());
			}
			
		},"popper").start();
		
	}
}
