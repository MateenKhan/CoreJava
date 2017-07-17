package com.mak.corejava.eight.thisAndSuper;

//this && Super

class Base {
	int a = 220;
}

class Derived extends Base {
	int a = 770;

	Derived() {
		this.show();
	}

	void show() {
		System.out.println("Derived class value:" + this.a);
		System.out.println("Base class value:" + super.a);
	}
}

class Fifth {
	public static void main(String args[]) {
		Derived d = new Derived();
	}
}