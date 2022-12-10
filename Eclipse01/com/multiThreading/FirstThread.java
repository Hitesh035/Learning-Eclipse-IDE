package com.multiThreading;

class A extends Thread {

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(456);

			System.out.println(this.getName());
			System.out.println(this.getPriority());
			System.out.println(Thread.activeCount());
			this.setName("tuntun");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Hello**********");

		}

	}
}

class B extends Thread {

	public void run() {
		for (int i = 0; i < 20; i++) {
			this.getName();
			this.getPriority();
			System.out.println(this.getName());
			System.out.println(this.getPriority());
			System.out.println(Thread.activeCount());
			this.setName("popo");
			System.out.println(456);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hi***********");
		}
	}
}

public class FirstThread {

	public static void main(String[] args) throws InterruptedException {

		A a = new A();

		B b = new B();

		new Thread() {
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println(456);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					this.getName();
					this.getPriority();
					System.out.println(this.getName());
					System.out.println(this.getPriority());
					System.out.println(Thread.activeCount());
					this.setName("lulu");
					System.out.println("bello*************");
				}
			}
		}.start(); // Anonymous class
		b.start();

		a.start();

	}

}
