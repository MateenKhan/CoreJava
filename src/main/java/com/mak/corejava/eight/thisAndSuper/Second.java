package com.mak.corejava.eight.thisAndSuper;

//this

class BaseSuper {
	BaseSuper() {
		System.out.println("BaseSuper class constructor");
	}
}

class DerivedChild extends BaseSuper {
	DerivedChild() {
		super();
		System.out.println("DerivedChild class Constructor");
	}
}

class Second {
	public static void main(String args[]) {
		DerivedChild d = new DerivedChild();
	}
}