package com.object_class;

import java.util.Scanner;

class SingletonTheatre{
	
	private static int seatCount = 0;
	private SingletonTheatre() {
		
	}
	
	/*
	 * public static SingletonTheatre[] bookTickets(int n) {
	 * 
	 * 
	 * SingletonTheatre seats[] = [0]; for(int i = 0; i<=n;i++) { seats[i] = new
	 * SingletonTheatre(); } return seats;
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	public static SingletonTheatre bookTickets(int n) {
		return new SingletonTheatre();
	}
			
	}
		

	
class Reservation{
	private static int seatCount = 0;
	
	public static int seatChecker(int n) {
		
		if(seatCount+n <=50) {
			for (int i=0; i<=n;i++) {
				seatCount++;
				
			}
			return n;
		}
		else return 0;
	}
	
	public static void ticketBooker(int n) {
		if(seatChecker(n) != 0) {
//			SingletonTheatre seats[] = SingletonTheatre.bookTickets(n);
			System.out.println(n+ " seats booked! "+"Your seats are.");
			for(int i=0 ; i<n;i++) {
				System.out.println(SingletonTheatre.bookTickets(i));
			}
		}
		else
			System.out.println(n+" seat(s) is/are not available.");
		
		
	}
	
}
public class BookMyShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Boolean flag = true;
		
		while(flag) {
			System.out.println("1. Book tickets.");
			System.out.println("2. Exit application.");
			int choice = scn.nextInt();
			if(choice == 1) {
				System.out.println("How many tickets do you need?");
				int tickets = scn.nextInt();
				Reservation.ticketBooker(tickets);
			}
			else if(choice == 2) {
				flag = false;
				return;
				
			}
			else
				System.out.println("Invalid choice.");
			
		}
	}

}
