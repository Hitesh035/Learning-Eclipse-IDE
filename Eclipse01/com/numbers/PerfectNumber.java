package com.numbers;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPerfect(7);
	}
	
	public static void isPerfect(long a) {
		
		long sum = 0;
		boolean flag = true;
		
		
		
		for (long i = 2; i<=a/2; i++ ) {
			
			if (a%i == 0) {
				sum+=i;
				flag = false;
			}
		}
		
		if(sum+1 == a)
			System.out.println("The number is a perfect number!");
		else if(flag)
			System.out.println("The number is prime! It cannot be perfect.");
		else
			System.out.println("The number is not a perfect number.");
	}

}
