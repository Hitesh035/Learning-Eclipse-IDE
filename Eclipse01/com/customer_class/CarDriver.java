package com.customer_class;

import com.inheriting_classes.*;
import com.inheritable_classes.*;

public class CarDriver {

	public void drive(String brand) {

		CarSuperClass c1 = new SwiftOfCarSuperclass(brand);
		System.out.println("Welcome driver.");
		c1.startCar();
		c1.accelerateCar();
		c1.decelerateCar();
		c1.stopCar();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarDriver d1 = new CarDriver();

		d1.drive("Swift");

	}

}
