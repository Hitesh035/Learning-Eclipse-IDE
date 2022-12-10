package com.numbers;

public class MagicalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isMagical(1459));
	}

	public static boolean isMagical(long a) {
		
		if(GetDigits.addDigits(a)*ReverseANumber.getReversedNumber(GetDigits.addDigits(a)) == a)
			return true;
		else
			return false;
	}
}
