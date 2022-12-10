package com.inheriting_classes;

import com.inheritable_classes.*;

public class AudiOfCarSuperClass extends CarSuperClass {

	public AudiOfCarSuperClass(String s1, long s2, String s3) {
		super(s1, s2, s3);

		vinUpdater(s2);

	}

	public AudiOfCarSuperClass(String brand, String color) {
		super(brand, color);

	}

	public void displayAudiDetails() {

		System.out.println("Car Brand:" + this.brand);
		System.out.println("Car VIN:" + this.getVin(this));
		System.out.println("Car color:" + this.color);
	}

	@Override
	public void startCar() {

		System.out.println("AudiOfCarSuperclass overridden implementation of startCar() CarSuperClass method.");
	}

	@Override
	public void stopCar() {
		System.out.println("AudiOfCarSuperclass overridden implementation of stopCar() CarSuperClass method.");
	}

	@Override
	public void accelerateCar() {
		System.out.println("AudiOfCarSuperclass overridden implementation of accelerateCar() CarSuperClass method.");
	}

	@Override
	public void decelerateCar() {
		System.out.println("AudiOfCarSuperclass overridden implementation of decelerateCar() CarSuperClass method.");
	}

	public void audiSpecialHybridCar() {
		System.out.println("class specific AudiOfCarSuperClass method audiSpecialHybridCar()");
	}

	public static void main(String[] args) {

	}

}
