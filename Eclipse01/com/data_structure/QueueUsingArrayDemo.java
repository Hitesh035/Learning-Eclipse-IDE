package com.data_structure;

import java.util.EmptyStackException;

public class QueueUsingArrayDemo {

	private Object[] queue = new Object[0];
	private int count = 0;

	public void push(Object e) {
		this.reSize();

		this.queue[this.queue.length - 1] = e;
		count++;
	}

	public int size() {

		return count;
	}

	public Object poll() {
		if (this.size() == 0)
			throw new EmptyStackException();
		Object toReturn = this.queue[0];
		this.reCreate();
		count--;
		return toReturn;
	}
	
	public Object peek() {
		if (this.size() == 0)
			throw new EmptyStackException();
		 
		return this.queue[0];
	}

	private void reSize() {

		Object[] temp = new Object[this.queue.length + 1];

		for (int i = 0; i < this.queue.length; i++) {
			temp[i] = this.queue[i];
		}

		queue = temp;
	}

	private void reCreate() {
		Object[] temp = new Object[this.queue.length - 1];

		for (int i = 0; i + 1 < this.queue.length; i++) {
			temp[i] = this.queue[i + 1];
		}

		queue = temp;
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}

	public static void main(String[] args) {
		
		QueueUsingArrayDemo q1 = new QueueUsingArrayDemo();
		q1.push(2);
		q1.push(3);
		System.out.println(q1.poll());
		System.out.println(q1.peek());
	}

}
