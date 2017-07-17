package com.mak.corejava.eight.thisAndSuper;

//this

class BaseParent {
	void show() {
		System.out.println("BaseParent class Method");
	}
}

class DerivedChildren extends BaseParent {
	DerivedChildren() {
		super.show();
	}

	void show() {
		System.out.println("DerivedChildren class Method");
	}
}

class Third {
	public static void main(String args[]) {
		DerivedChildren d = new DerivedChildren();
		// d.show();
	}
}