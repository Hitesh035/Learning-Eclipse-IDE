package com.numbers;

public class NFibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nFibonacciNumbers(5);
	}
	
	public static void nFibonacciNumbers(int n) {
		
		long a = 0;
		long b = 1;
		long sum=0;
	
		
		if(n>2) {
			System.out.print(0+" ");
			System.out.print(1+" ");
		
		for(int i = 0; i<n-2; i++) {
			
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			
		}
		System.out.println();
	}
		else if(n==2) {
			System.out.print(0+" ");
			System.out.print(1+" ");
			System.out.println();
		}
		else if (n==1) {
			System.out.println(0+" ");
		}
		else
			System.out.println("Entered number must be 1 or greater");
		
		
	}

}
