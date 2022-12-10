package com.inheritable_classes;

public class PhoneBattery {
	private String batteryBrand;
	private double batteryCap;
	private double batteryWeight;
	
	
	public PhoneBattery(String batteryBrand, double batteryCap, double batteryWeight) {
		super();
		this.batteryBrand = batteryBrand;
		this.batteryCap = batteryCap;
		this.batteryWeight = batteryWeight;
	}
	
	public double PhoneBatteryPrice(String batteryBrand, double batteryCap) {
		double price = 0;
		if(batteryBrand == "Duracell") {
			if(batteryCap==10000.0) {
				this.batteryWeight= 15.0;
				return 4000.0;
			}
			else if(batteryCap == 12000.0) {
				this.batteryWeight = 17.0;
				return 5000.0;
				
				
			}
			
		}
		
		if(batteryBrand == "Exide") {
			
			if(batteryCap == 12000.0) {
				this.batteryWeight = 16.0;
				return 3500.0;
			}else if(batteryCap == 15000.0) {
				this.batteryWeight = 20.0;
				return 5000.0;
			}
		}
		
		
		return price;
	}
	
	public void getBatteryDetails() {
		
		System.out.println("Your phone has have a battery of "+this.batteryBrand+".");
		System.out.println("Your phone's battery capacity is "+ this.batteryCap+".");
		System.out.println("Your phone's battery weighs "+this.batteryWeight+"gms.");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
