package com.numbers;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isAutomorphic(45);
	}
	public static void isAutomorphic(long a) {
		
		
		if(a == GetDigits.getNDigitsFromOnesSide(ExponentOfIntegers.getExponent(a, 2), GetDigits.getDigitCount(a))) {
			System.out.println("The number is Automorphic");
		}
		else
			System.out.println("The number is not automorphic.");
		
		
	}

}
