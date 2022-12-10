package com.inheriting_classes;

import com.inheritable_classes.*;

public class SwiftOfCarSuperclass extends CarSuperClass {

	public SwiftOfCarSuperclass(String brand) {
		super(brand);

	}

	@Override
	public void startCar() {

		System.out.println("startCar() Swift.Turn key clockwise and press button to start.");
	}

	@Override
	public void stopCar() {
		System.out.println("stopCar() Swift. Turn key anticlockwise to turn off engine.");
	}

	@Override
	public void accelerateCar() {
		System.out.println("accelerateCar() Swift. Step on accelerator pedal to acclerate");
	}

	@Override
	public void decelerateCar() {
		System.out.println("decelerateCar() Swift. Step on brake pedal to decelerate.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
