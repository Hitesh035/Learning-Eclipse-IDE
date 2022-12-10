package com.inheritable_classes;

import com.inheriting_classes.*;

public class CarSuperClass {

	protected String brand;
	private long vin;
	public String color;
	private static long vinNo = 324556;

	public CarSuperClass(String brand, long vin, String color) {
		super();
		this.brand = brand;
		this.vin = vin;
		this.color = color;
	}

	public CarSuperClass(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
		this.vin = vinGenerator();

	}

	public CarSuperClass(String brand) {
		this.brand = brand;
	}

	private static long vinGenerator() {

		return vinNo++;
	}

	protected long getVin(CarSuperClass c) {
		return vin;
	}

	protected static void vinUpdater(long a) {

		vinNo = a;
	}

	public void startCar() {

		System.out.println("CarSuperclass implementation of startCar().");
	}

	public void stopCar() {
		System.out.println("CarSuperclass implementation of stopCar().");
	}

	public void accelerateCar() {
		System.out.println("CarSuperclass implementation of accelerateCar().");
	}

	public void decelerateCar() {
		System.out.println("CarSuperclass implementation of decelerateCar().");
	}

	public void displayCarDetails() {

		System.out.println("Car Brand:" + this.brand);
		System.out.println("Car VIN:" + this.getVin(this));
		System.out.println("Car color:" + this.color);
		System.out.println();
		System.out.println("Your car functions are.");
		this.startCar();
		this.accelerateCar();
		this.decelerateCar();
		this.stopCar();
		if (this instanceof AudiOfCarSuperClass) {

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
