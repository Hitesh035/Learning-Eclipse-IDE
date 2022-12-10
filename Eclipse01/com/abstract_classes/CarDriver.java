package com.abstract_classes;
interface Car{
	void start();
	void accelerate();
	void stop();
}


class Audi implements Car{
	
	@Override
	public void start() {
		
		System.out.println("Push button to start the AUDI.");
	}
	
	@Override
	public void accelerate() {
		
		System.out.println("Step on accelerator to accelerate the AUDI.");
	}
	
	@Override
	public void stop() {
		System.out.println("Step on brake to deacclerate and stop the AUDI.");
	}
}

class Mercedes implements Car{
	
	@Override
	public void start() {
		
		System.out.println("Push button to start the MERCEDES.");
	}
	
	@Override
	public void accelerate() {
		
		System.out.println("Step on accelerator to accelerate the MERCEDES.");
	}
	
	@Override
	public void stop() {
		System.out.println("Step on brake to deacclerate and stop the MERCEDES.");
	}
	
	public void convertible() {
		
		System.out.println("It is a convertible, enjoy the wind!");
	}
}

class Driver{
	
	public void customer(Car c) {
		c.start();
		c.accelerate();
		c.stop();
	} 
	
}


public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Mercedes(); //loose coupling and 100% data abstraction achieved.
		Driver d1 = new Driver();
		
		d1.customer(c1);
		
		((Mercedes)c1).convertible();
	}

}
