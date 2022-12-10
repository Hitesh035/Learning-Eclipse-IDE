package com.menu_driven;
import com.numbers.*;
import java.util.Scanner;
public class Play_with_numbers {

	public static void main(String[] args) {
		
		int a = 0;
		boolean flag =true;
		Scanner scn = new Scanner(System.in);
		
		
		while(flag) {
			System.out.println("Welcome to fun with Integers!");
			System.out.println("Please choose an option.");
			System.out.println("1. Check if your number is an Armstrong number.");
			System.out.println("2. Check if your number is an automorphic number.");
			System.out.println("3. Get the factorial of a number you provide.");
			System.out.println("4. Get 'n' numbers of fibonacci numbers. You must provide 'n'.");
			System.out.println("5. Check if your number is a niven number.");
			System.out.println("6. Check if your number is a Perfect number");
			System.out.println("7. Check if your number is a strong number.");
			System.out.println("8. Get the reverse of a number you provide.");
			System.out.println("9. Check if your number is prime.");
			System.out.println("10. Add the digits of your number.");
			System.out.println("11. Exit application.");
			double choice = scn.nextDouble();
			
			
			if (choice<1 && choice>11) {
				System.out.println("Invalid option!");
			}
			else if(choice ==1) {
				System.out.println("Please enter an integer.");
				long number = scn.nextLong();
				ArmstrongNumber.isAngstorm(number);
			}
			else if(choice ==2) {
				System.out.println("Please enter an integer.");
				long number = scn.nextLong();
				AutomorphicNumber.isAutomorphic(number);
			}
			else if (choice == 3) {
				System.out.println("Please enter an integer.");
				long number = scn.nextLong();
				System.out.println("Factorial of "+number+ " is "+ FactorialOfANumber.factorialOfANumber(number));
			}
			else if(choice ==4) {
				System.out.println("Please enter the number of fibonacci numbers you need.");
				int number = scn.nextInt();
				if(number == 0) {
					System.out.println("Entered number must be 1 or greater");
				}
				else {
				System.out.println(number+ " fibonacci number(s) starting from '0' is/are ");
				NFibonacciNumbers.nFibonacciNumbers(number);
				}
			}
			else if (choice == 5) {
				System.out.println("Please enter an integer.");
				long number = scn.nextLong();
				NivenNumber.isNiven(number);
				
				
			}
			else if(choice == 6) {
				System.out.println("Please enter an integer.");
				long number = scn.nextLong();
				PerfectNumber.isPerfect(number);
			}
			else if (choice == 7) {
				System.out.println("Please enter an integer.");
				long number = scn.nextLong();
				StrongNumber.isStrong(number);
			}
			else if(choice ==8) {
				System.out.println("Please enter an integer.");
				long number = scn.nextLong();
				ReverseANumber.getReversedNumber(number);
			}
			else if(choice ==9) {
				System.out.println("Please enter an integer.");
				long number = scn.nextLong();
				if(PrimeNUmber.isPrime(number)) {
					System.out.println("Your number is prime.");
				}
				else
					System.out.println("Your number is not prime.");
				
			}
			else if(choice ==10) {
				System.out.println("Please enter an integer.");
				long number = scn.nextLong();
				System.out.println("Sum of digits of your number "+number+" is "+GetDigits.addDigits(number)); 
				
				
			}
			else if(choice ==11) {
				return;
			}
			else
				System.out.println("Invalid option.");
			
			
		}
		
	}

}
