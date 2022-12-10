package com.numbers;

public class OriginalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isOriginal(45));
		System.out.println(finalDigitOfRecursiveDigitSum(45));
	}
	
	public static long finalDigitOfRecursiveDigitSum(long a) {
		int digitCount=GetDigits.getDigitCount(a);
		
		while(digitCount>1) {
			a=GetDigits.addDigits(a);
			digitCount= GetDigits.getDigitCount(a);
		}
		return a;
	}
	public static boolean isOriginal(long a) {
		if(finalDigitOfRecursiveDigitSum(a)==1)
			return true;
		else 
			return false;
	}

}
