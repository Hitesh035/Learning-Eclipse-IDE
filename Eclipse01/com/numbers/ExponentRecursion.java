package com.numbers;

public class ExponentRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getExponentRec(3,5));
	}
	
	public static long getExponentRec(long a, long b) {
		
		if (b==1) return a;
		
		return a*getExponentRec(a, b-1);
	}

}
