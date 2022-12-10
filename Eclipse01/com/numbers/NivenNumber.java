package com.numbers;

public class NivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isNiven(1);
	}
	
	public static void isNiven(long a) {
		
		if(a>0) {
			long sum = 0;
			
			for(long i=a; i>0;i/=10) {
				sum+=GetDigits.getOnesDigit(i);
			}
			
			if(a%sum == 0)
				System.out.println("It is a niven number!");
			else
				System.out.println("It is not  niven number.");
		}
		else
			System.out.println("0 is also a Niven number!");
	}

}
