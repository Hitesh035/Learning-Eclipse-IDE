package com.sample;

import java.util.ArrayList;

import java.util.List;

import com.JDBC.Person;
import com.TestJar.JarTest;

public class Test {

	public static void main(String[] args) {

		Person person = new Person("Hitesh", 23);
		Person person2 = new Person("Hitesh1", 23);
		Person person3 = new Person("Hitesh2", 23);
		Person person4 = new Person("Hitesh3", 23);

		List<Person> list = new ArrayList<>();

		list.add(person);
		list.add(person4);
		list.add(person2);
		list.add(person3);

		JarTest.JarTestMethod1();

	}

}
