package com.mak.corejava.eight.thisAndSuper;

class First {
	int a = 10;

	public static void main(String args[]) {
		First f = new First();
		f.show();
	}

	void show() {
		int a = 100;
		System.out.println(a);
		System.out.println(this.a);
	}
}