package com.numbers;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getReversedNumber(213));
	}
	
	public static long getReversedNumber(long a) {
		long ReversedNumber =0;
		for (long i = a; i>0; i/=10) {
			long digit = i%10;
			
			ReversedNumber = ReversedNumber*10 + digit;
		}
		return ReversedNumber;
	}

}
