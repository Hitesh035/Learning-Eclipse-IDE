package com.multiThreading;

class Resource {

	public  void getPower(int a) {
		synchronized (this) 
			
		{
			for (int i = 0; i <= 10; i++) {
				if (a == 2) {
					System.out.println("Square of " + i + "= " + (long)Math.pow(i, a));
				}
				if (a == 3) {
					System.out.println("Cube of " + i + "= " + (long)Math.pow(i, a));
				}
			}
		}

	}
}

class Access1 extends Thread {
	Resource r;

	Access1(Resource r) {
		this.r = r;
	}

	public void run() {
		r.getPower(2);
	}
}

class Access2 extends Thread {
	Resource r;

	Access2(Resource r) {
		this.r = r;
	}

	public void run() {
		r.getPower(3);
	}
}

public class SyncedNSMethod {

	public static void main(String[] args) {
		Resource r = new Resource();
		Access1 a1 = new Access1(r);
		Access2 a2 = new Access2(r);

		
		a1.start();
		a2.start();
	}

}
