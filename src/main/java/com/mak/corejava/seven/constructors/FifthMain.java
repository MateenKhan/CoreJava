package com.mak.corejava.seven.constructors;

//initializing global variables
import java.lang.*;

class Fifth extends Object {
	int a;
	char b;
	float c;
	boolean d;
	byte e;
	long f;
	short g;
	double h;
	String s;
}

class FifthMain {
	public static void main(String args[]) {
		Fifth f = new Fifth();
		System.out.println("int=" + f.a);
		System.out.println("char=" + f.b);
		System.out.println("float=" + f.c);
		System.out.println("boolean=" + f.d);
		System.out.println("byte=" + f.e);
		System.out.println("long=" + f.f);
		System.out.println("short=" + f.g);
		System.out.println("double=" + f.h);
		System.out.println("String=" + f.s);
	}
}