package com.mak.corejava.eight.thisAndSuper;

//this

class BaseParent {
	
	BaseParent(){
		System.out.println("BaseParent Constructor");
	}
	
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
		new DerivedChildren();
		// d.show();
	}
}