package com.numbers;

public class AbundantOrDeficientNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAbundantorDeficient(15));
	}

	public static boolean isAbundantorDeficient(long a) {
		
		
		long sum = 0;
		
		
		
		
		for (long i = 2; i<=a/2; i++ ) {
			
			if (a%i == 0) {
				sum+=i;
				
			}
		}
		
		
		
		if(sum+1 >= a)
			return true;
		else
			return false;
	}
}
