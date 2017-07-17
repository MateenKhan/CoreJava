package com.mak.corejava.eight.thisAndSuper;

//this

class SuperBase {
	int a = 10;
}

class ChildDerived extends SuperBase {
	int a = 100;

	void show() {
		System.out.println("ChildDerived class :" + this.a);
		System.out.println("SuperBase class :" + super.a);
	}
}

class Fourth {
	public static void main(String args[]) {
		ChildDerived d = new ChildDerived();
		d.show();
	}
}