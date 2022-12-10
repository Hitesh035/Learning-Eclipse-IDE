package com.customer_class;

import com.inheritable_classes.*;

import com.inheriting_classes.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
	PhoneOperator op;
	PhoneBattery pb;
	double price;

	public Phone(PhoneOperator op, String planName, PhoneBattery pb, String batteryBrand, double batteryCap) {
		super();
		this.op = op;
		this.pb = pb;

		if (op instanceof Jio) {
			this.price = ((Jio) op).planPrice(planName) + this.pb.PhoneBatteryPrice(batteryBrand, batteryCap)
					+ 24999.00;
		} else if (op instanceof Airtel) {
			this.price = ((Airtel) op).planPrice(planName) + this.pb.PhoneBatteryPrice(batteryBrand, batteryCap)
					+ 24999.00;
		}
	}

	public void phoneFunctionCall(String callNo) {
		this.op.call(callNo);
	}

	public void phoneFunctionSMS(String textNo) {
		this.op.sms(textNo);
	}

	public void printMyPhoneDetails() {

		System.out.println("Welcome to your new phone.");
		System.out.println("Your phone details are:");

		if (this.op instanceof Jio) {
			System.out.println("Your phone operator is " + ((Jio) op).getOperator() + ".");
			System.out.println("Your phone number is " + ((Jio) op).getPhoneNumber() + ".");
			System.out.println("Your current plan is " + ((Jio) op).getPlan() + ".");
		} else if (this.op instanceof Airtel) {
			System.out.println("Your phone operator is " + ((Airtel) op).getOperator() + ".");
			System.out.println("Your phone number is " + ((Airtel) op).getPhoneNumber() + ".");
			System.out.println("Your current plan is " + ((Airtel) op).getPlan() + ".");
		}
		this.pb.getBatteryDetails();
	}

	public static void pattern() {
		System.out.println();
		System.out.println("________________________________________________");
		System.out.println();
	}

	public static void main(String[] args) {
		PhoneBattery b = new PhoneBattery(null, 0, 0);
		PhoneOperator o = new PhoneOperator(null, null);
		Phone p = new Phone(o, null, b, null, 0);
		String batteryBrand = "";
		double batteryCap = 0;
		String operator = "";
		String planName = "";
		String phoneNo = "";
		Scanner scn = new Scanner(System.in);
		boolean flag = true;

		Pattern phoneNoPattern = Pattern.compile("[6-9]{1}[0-9]{9}");

		while (flag) {
			System.out.println("Welcome to phone initialiser.");
			System.out.println("Press '1' to choose 'Jio' as your phone operator.");
			System.out.println("Press '2' to choose 'Airtel' as your phone operator.");
			pattern();
			double input1 = scn.nextDouble();

			if (input1 == 1) {
				operator = "Jio";
				System.out.println("Thank you for choosing Jio.");
				pattern();

			} else if (input1 == 2) {
				operator = "Airtel";
				System.out.println("Thank you for choosing Airtel.");
				pattern();
			} else {
				System.out.println("Please do not enter invalid inputs.");
				return;
			}

			System.out.println("Please choose a service plan");
			System.out.println("Press '1' for '300-1gb/day-84-days' plan");
			System.out.println("Press '2' for '400-1.5gb/day-84-days' plan");
			System.out.println("Press '3' for '555-2gb/day-84-days' plan");
			pattern();

			double input2 = scn.nextDouble();

			if (input2 == 1) {
				planName = "300-1gb/day-84-days";
				System.out.println("You chose " + planName + " plan.");
				pattern();

			} else if (input2 == 2) {
				planName = "400-1.5gb/day-84-days";
				System.out.println("You chose " + planName + " plan.");
				pattern();

			} else if (input2 == 3) {
				planName = "555-2gb/day-84-days";
				System.out.println("You chose " + planName + " plan.");
				pattern();

			} else {
				System.out.println("Please do not enter invalid inputs.");
				return;
			}
			System.out.println("Please type your phone number.");
			System.out.println(
					"Your phone number should start with a digit between 6-9 and must have exactly 10 digits.");
			pattern();

			while (flag) {
				phoneNo = scn.next();
				Matcher m1 = phoneNoPattern.matcher(phoneNo);
				if (m1.matches()) {
					System.out.println("Your phone number is " + phoneNo + ".");
					break;
				} else
					System.out.println("Invalid phone number. Please try again");
			}
			if (input1 == 1)
				o = new Jio(operator, phoneNo);
			else if (input1 == 2)
				o = new Airtel(operator, phoneNo);
			pattern();
			System.out.println("Please choose a suitable battery for your phone.");
			System.out.println("Press '1' to choose 'Duracell' 10000MAh battery");
			System.out.println("Press '2' to choose 'Duracell' 12000MAh battery");
			System.out.println("Press '3' to choose 'Exide' 12000MAh battery");
			System.out.println("Press '4' to choose 'Exide' 15000MAh battery");
			double input3 = scn.nextDouble();
			if (input3 == 1) {
				b = new PhoneBattery("Duracell", 10000, 15.0);
				batteryBrand = "Duracell";
				batteryCap = 10000;
			} else if (input3 == 2) {
				b = new PhoneBattery("Duracell", 12000, 17.0);
				batteryBrand = "Duracell";
				batteryCap = 12000;
			} else if (input3 == 3) {
				b = new PhoneBattery("Exide", 12000, 16.0);
				batteryBrand = "Exide";
				batteryCap = 12000;
			} else if (input3 == 4) {
				b = new PhoneBattery("Exide", 15000, 20.0);
				batteryBrand = "Exide";
				batteryCap = 15000;
			} else {
				System.out.println("Please do not enter invalid inputs.");
				return;

			}
			pattern();
			p = new Phone(o, planName, b, batteryBrand, batteryCap);
			p.printMyPhoneDetails();
			pattern();
			System.out.println("Press '1' to buy your phone for Rs " + p.price);
			System.out.println("Press '2' to re-configure your phone.");
			pattern();
			double input4 = scn.nextDouble();
			if (input4 == 1)
				break;
			else if (input4 == 2)
				continue;
			else {
				System.out.println("Please do not enter invalid inputs.");
				return;

			}

		}
		p.phoneFunctionCall("6755675676");

	}
}
