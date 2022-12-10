package com.inheriting_classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.inheritable_classes.*;

public class Airtel extends PhoneOperator {
	String planName;

	public Airtel(String operator, String phoneNo) {
		super(operator, phoneNo);

	}

	@Override
	public void call(String callNo) {

		String regEx = "[6-9]{1}[0-9]{9}";
		Pattern p1 = Pattern.compile(regEx);
		Matcher m1 = p1.matcher(callNo);
		if (m1.matches())
			System.out.println(
					"Placing call from your " + this.operator + " number " + this.phoneNo + " to " + callNo + ".");
		else
			System.out.println("You entered an invalid number.");
	}

	@Override
	public void sms(String textNo) {

		String regEx = "[6-9]{1}[0-9]{9}";
		Pattern p1 = Pattern.compile(regEx);
		Matcher m1 = p1.matcher(textNo);
		if (m1.matches())
			System.out.println("Texting from your " + this.operator + " number " + this.phoneNo + " to " + regEx + ".");
		else
			System.out.println("You entered an invalid number.");
	}

	public double planPrice(String planName) {

		double planPrice = 0;

		if (planName == "300-1gb/day-84-days") {
			this.planName = planName;
			return 300.0;
		} else if (planName == "400-1.5gb/day-84-days") {
			this.planName = planName;
			return 400.0;
		} else if (planName == "555-2gb/day-84-days") {
			this.planName = planName;
			return 555.0;
		}

		return planPrice;
	}

	public String getPlan() {

		return this.planName;
	}

	public String getOperator() {
		return this.operator;
	}

	public String getPhoneNumber() {
		return this.phoneNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Airtel("Airtel", "3456789088").call("6675430789");
	}

}
