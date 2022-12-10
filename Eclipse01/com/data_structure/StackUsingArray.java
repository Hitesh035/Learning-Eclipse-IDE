package com.data_structure;

import java.util.EmptyStackException;

public class StackUsingArray {

	private Object[] stack = new Object[0];
	private int count = 0;

	public void push(Object e) {
		this.reSize();

		this.stack[this.stack.length - 1] = e;
		count++;
	}

	public int size() {

		return count;
	}

	public Object pop() {
		if (this.size() == 0)
			throw new EmptyStackException();
		Object toReturn = this.stack[this.stack.length - 1];
		this.reCreate();
		count--;
		return toReturn;
	}

	public Object peek() {
		if (this.size() == 0)
			throw new EmptyStackException();

		return this.stack[this.stack.length - 1];
	}

	private void reSize() {

		Object[] temp = new Object[this.stack.length + 1];

		for (int i = 0; i < this.stack.length; i++) {
			temp[i] = this.stack[i];
		}

		stack = temp;
	}

	private void reCreate() {
		Object[] temp = new Object[this.stack.length - 1];

		for (int i = 0; i < this.stack.length - 1; i++) {
			temp[i] = this.stack[i];
		}

		this.stack = temp;
	}

	public boolean isEmpty() {
		if (this.size() == 0)
			return true;

		return false;
	}

	public static void main(String[] args) {

		StackUsingArray s1 = new StackUsingArray();
		
		s1.push(2);
		s1.push(3);
		System.out.println(s1.size());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		System.out.println(s1.size());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());

	}

}
