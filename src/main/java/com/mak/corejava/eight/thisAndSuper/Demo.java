package com.mak.corejava.eight.thisAndSuper;

public class Demo implements A, B {//multiple inheritance
	public void add(int a, int b) {
	}
	public void add(int a, int b, int c) {
	}

	public static void main(String[] args) {
		new Demo().print();
	}

	public void print() {
		System.out.println(A.PI);
	}
}

class MainClass extends Demo{}//multi level inheritance

interface A {

	public static final double PI = 3.14;
	public abstract void add(int a, int b);
}

interface B extends A{//single inheritance
	
	public void add(int a, int b, int c);

}