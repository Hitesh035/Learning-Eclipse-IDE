package com.numbers;

public class PrimeNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(18));
	}
	
	public static boolean isPrime(long a) {
		boolean flag = true;
		
		
		
		for (long i =2; i<=a/2;i++) {
			if(a%i == 0) {
				flag =false;
				break;
			}
			
		}
		return flag;
	}

}
