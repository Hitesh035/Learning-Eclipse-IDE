package com.customer_class;

import com.inheriting_classes.*;
import java.util.*;

public class CarCustomer {

	public static void pattern() {
		System.out.println();
		System.out.println("______________________________________");
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		boolean flag = true;

		while (flag) {
			System.out.println("Welcome to Morna Car Dealers");
			System.out.println("Please select your brand");
			System.out.println("Press '1' for Audi.");
			System.out.println("Press '2' for Mercedes.");
			System.out.println("Press '3' to exit application.");
			pattern();

			int a = scn.nextInt();

			if (a == 1) {
				while (flag) {
					System.out.println("Please select a color.");
					System.out.println("Press '1' for Black.");
					System.out.println("Press '2' for White.");
					System.out.println("Press '3' for Red.");
					System.out.println("Press '4' for Indigo.");
					pattern();

					int b = scn.nextInt();

					if (b == 1) {

						AudiOfCarSuperClass a1 = new AudiOfCarSuperClass("Audi", "Black");
						System.out.println("Congratulations on your new Audi");
						System.out.println("Your car details are");
						a1.displayCarDetails();
						pattern();
						System.out.println();
						break;

					} else if (b == 2) {

						AudiOfCarSuperClass a1 = new AudiOfCarSuperClass("Audi", "White");
						System.out.println("Congratulations on your new Audi");
						System.out.println("Your car details are");
						a1.displayCarDetails();
						pattern();
						System.out.println();
						break;

					} else if (b == 3) {

						AudiOfCarSuperClass a1 = new AudiOfCarSuperClass("Audi", "Red");
						System.out.println("Congratulations on your new Audi");
						System.out.println("Your car details are");
						a1.displayCarDetails();
						pattern();
						System.out.println();
						break;

					} else if (b == 4) {

						AudiOfCarSuperClass a1 = new AudiOfCarSuperClass("Audi", "Indigo");
						System.out.println("Congratulations on your new Audi");
						System.out.println("Your car details are");
						a1.displayCarDetails();
						pattern();
						System.out.println();
						break;

					} else {
						System.out.println("Invalid choice");
						continue;
					}
				}

			}

			else if (a == 2) {
				while (flag) {
					System.out.println("Please select a color.");
					System.out.println("Press '1' for Black.");
					System.out.println("Press '2' for White.");
					System.out.println("Press '3' for Red.");
					System.out.println("Press '4' for Indigo.");
					pattern();

					int b = scn.nextInt();

					if (b == 1) {

						MercedesOfCarSuperClass a1 = new MercedesOfCarSuperClass("Mercedes", "Black");
						System.out.println("Congratulations on your new Mercedes");
						System.out.println("Your car details are");
						a1.displayCarDetails();
						pattern();
						System.out.println();
						break;

					} else if (b == 2) {

						MercedesOfCarSuperClass a1 = new MercedesOfCarSuperClass("Mercedes", "White");
						System.out.println("Congratulations on your new Mercedes");
						System.out.println("Your car details are");
						a1.displayCarDetails();
						pattern();
						System.out.println();
						break;

					} else if (b == 3) {

						MercedesOfCarSuperClass a1 = new MercedesOfCarSuperClass("Mercedes", "Red");
						System.out.println("Congratulations on your new Mercedes");
						System.out.println("Your car details are");
						a1.displayCarDetails();
						pattern();
						System.out.println();
						break;

					} else if (b == 4) {

						MercedesOfCarSuperClass a1 = new MercedesOfCarSuperClass("Mercedes", "Indigo");
						System.out.println("Congratulations on your new Mercedes");
						System.out.println("Your car details are");
						a1.displayCarDetails();
						pattern();
						System.out.println();
						break;

					} else {
						System.out.println("Inavalid choice");
						continue;
					}

				}
			} else if (a == 3)
				return;
			else {
				System.out.println("Invalid choice");
				continue;
			}

		}
	}

}
