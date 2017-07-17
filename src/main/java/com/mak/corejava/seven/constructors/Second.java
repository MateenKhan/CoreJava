package com.mak.corejava.seven.constructors;

//Inheritance constructor

class Base {
	Base() {
		System.out.println("Base class constructor");
	}
}

class Middle extends Base {
	Middle() {
		super();
		System.out.println("Middle class constructor");
	}
}

class Derived extends Middle {
	Derived() {
		super();
		System.out.println("Derived class constructor");
	}
}

class Second {
	public static void main(String args[]) {
		Derived d = new Derived();
	}
}