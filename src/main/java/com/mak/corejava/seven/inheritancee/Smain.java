package com.mak.corejava.seven.inheritancee;

//overriding

class Second {
	void show() {
		System.out.println("Base class method");
	}
}

class Derived extends Second {
	void show() {
		System.out.println("Derived class method");
	}
}

class Smain {
	public static void main(String args[]) {
		Derived d = new Derived();
		d.show();
	}
}