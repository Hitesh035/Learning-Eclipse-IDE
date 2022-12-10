package com.numbers;

public class FactorialOfANumber {

	long a;

	FactorialOfANumber(long a) {
		this.a = a;
	}

	public static long factorialOfANumber(long n) {

		long fact = 1;

		for (int i = 1; i <= n; i++) {

			fact *= i;

		}
		return fact;

	}

	public static long factorialOfANumber(long a, long b) {
		long n = a * b;
		long fact = 1;

		for (int i = 1; i <= n; i++) {

			fact *= i;

		}
		return fact;
	}

	public void factorialOfANumber() {
		long fact = 1;

		for (int i = 1; i <= this.a; i++) {

			fact *= i;

		}
		System.out.println("Factorial of " + this.a + " is " + fact + ".");
	}

	public static long factorialOfANumber(long a, long b, long c) {
		long n = a + b + c;
		long fact = 1;

		for (int i = 1; i <= n; i++) {

			fact *= i;

		}
		return fact;
	}

	public static long factorialOfANumber(float a) {
		a = (int) a;
		long fact = 1;

		for (int i = 1; i <= a; i++) {

			fact *= i;

		}
		return fact;
	}



	public static void main(String[] a) {

		factorialOfANumber(2);
		System.out.println(factorialOfANumber(8));
		System.out.println(factorialOfANumber(2, 5)); // ambiguity error
		System.out.println(factorialOfANumber(2, 5, 3));
		System.out.println(factorialOfANumber(3.5f));
		System.out.println(factorialOfANumber(2, 4)); // ambiguity error

		FactorialOfANumber f1 = new FactorialOfANumber(7);

		f1.factorialOfANumber();
	}
}
