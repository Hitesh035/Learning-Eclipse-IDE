package com.numbers;

public class ExponentOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getExponent(2,6));
	}
	
	public static long getExponent(long a, long b) {
		
		long exponent = a;
		
		for(long i = 0; i<= b-2; i++) {
			
			exponent*=a;
		}
		
		return exponent;
	}

}
