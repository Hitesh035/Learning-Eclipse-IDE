package com.classroom_assignments;

public class MethodOverloadingAndAmbiguityError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(factorialOfANumber(2, 4)); // ambiguity error
	}
	
	public static long factorialOfANumber(double a, int b) {
		int n = (int) a * b;
		long fact = 1;

		for (int i = 1; i <= n; i++) {

			fact *= i;

		}
		return fact;
	}
	
	public static long factorialOfANumber(int a, double b) {
		int n = a * (int) b;
		long fact = 1;

		for (int i = 1; i <= n; i++) {

			fact *= i;

		}
		return fact;
	}

}
