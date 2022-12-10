package com.numbers;

public class GetDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getDigitCount(15546);
		System.out.println(getDigitCount(13445));
		System.out.println(getNDigitsFromOnesSide(1234567, 5));
		System.out.println(addDigits(123456789));
	}
	
	public static long getOnesDigit(long a) {
		
		return a%10;
	}
	
	public static int getDigitCount(long a) {
		
		int sum = 0;
		
		for(long i = a; i>0; i/=10) {
			
			sum++;
		}
		return sum;
	}
	
	public static long getNDigitsFromOnesSide(long a, int b) {
		
		long finalNumber = 0;
		long c = a;
		for(long i =0; i<b; i++) {
			
			
			finalNumber = finalNumber*10 + (c%10);
			c/=10;
				
			
		}
		return ReverseANumber.getReversedNumber(finalNumber);
	}
	
	public static long addDigits(long a)
	{
		long sum =0;
		for(long i =a; i>0;i/=10 ) {
			sum+= getOnesDigit(i);
		}
		return sum;
	}
}
