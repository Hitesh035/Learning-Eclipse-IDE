package com.object_class;

class SingletonClass {
	private static SingletonClass s = null;
	private static int count = 0;

	private SingletonClass() {

	}

	public static SingletonClass singletonClassObjectCreator() {
		if (count == 0) {

			s = new SingletonClass();
			count++;
		}
		return s;

	}
}

public class SingletonClassRequest {

	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.singletonClassObjectCreator();
		System.out.println(s1);
		SingletonClass s2 = SingletonClass.singletonClassObjectCreator();
		System.out.println(s2);
		SingletonClass s3 = SingletonClass.singletonClassObjectCreator();
		System.out.println(s3);
		SingletonClass s4 = SingletonClass.singletonClassObjectCreator();
		System.out.println(s4);
		SingletonClass s5 = SingletonClass.singletonClassObjectCreator();
		System.out.println(s5);
		SingletonClass s6 = SingletonClass.singletonClassObjectCreator();
		System.out.println(s6);
		SingletonClass s7 = SingletonClass.singletonClassObjectCreator();
		System.out.println(s7);
	}

}
