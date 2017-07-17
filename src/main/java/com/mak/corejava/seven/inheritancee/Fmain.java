package com.mak.corejava.seven.inheritancee;

//Inheritance
class First {
	
	static int a = 10;

	static void show() {
		System.out.println("Base class mehtod");
	}

}

class Fmain extends First {

	public static void main(String args[]) {
		show();
		System.out.println(a);
	}
}