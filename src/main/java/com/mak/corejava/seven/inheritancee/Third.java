package com.mak.corejava.seven.inheritancee;

//overriding

class Base {
	void show() {
		System.out.println("Base class method");
	}

	void add() {
		System.out.println("add method");
	}
}

class ChildDerived extends Base {
	void show() {
		System.out.println("ChildDerived class method");
	}

}

class Third {
	public static void main(String args[]) {
		System.out.println("POLYMORPHISM AND DYNAMIC BINDING");
		Base d = new ChildDerived();
		d.show();
		d.add();

	}
}