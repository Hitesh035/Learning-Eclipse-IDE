package com.functionalInterfaces;

import java.util.Arrays;

public class Employees implements Comparable<Employees> {

	String name;
	double sal;

	public Employees(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public int compareTo(Employees e) {

		return this.name.compareTo(e.name);
	}

	@Override
	public String toString() {

		return "Employee = [" + this.name + ", " + this.sal + "]";
	}

	public static void main(String[] args) {

		Employees[] employeeCollection = new Employees[5];

		employeeCollection[0] = new Employees("Ajay", 32456.8);
		employeeCollection[1] = new Employees("Bijay", 22343.87);
		employeeCollection[2] = new Employees("Chaman", 54345.90);
		employeeCollection[3] = new Employees("Rita", 45323.88);
		employeeCollection[4] = new Employees("Elena", 32444.98);

		Arrays.sort(employeeCollection);

		for (Employees e : employeeCollection) {

			System.out.println(e);
		}

		Arrays.sort(employeeCollection, new SalComp());

		for (Employees e : employeeCollection) {

			System.out.println(e);
		}

	}

}
