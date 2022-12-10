package com.numbers;

public class StrongNumber {

	public static void main(String[] args) {

		isStrong(3);
	}
	
	public static void isStrong(long a) {
		
		long sum=0;
		for(long i=a;i>0;i/=10) {
			sum+= FactorialOfANumber.factorialOfANumber(GetDigits.getOnesDigit(i));
			
		}
		
		if(sum == a)
			System.out.println("It is a strong number");
		else
			System.out.println("It is not a strong number");
	}

}
