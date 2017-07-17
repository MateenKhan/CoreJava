package com.mak.corejava.five.instanceAndStatic;

public class Demo {

	int a = 10;
	int b = 10;

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.add();
	}

	public void add() {
		int a = 100;
		int b = 200;
		System.out.println(this.a + this.b);
		// some other logic
	}

}
