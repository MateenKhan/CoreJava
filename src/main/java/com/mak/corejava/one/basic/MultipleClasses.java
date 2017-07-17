package com.mak.corejava.one.basic;

//MultipleClasses.java
class A {
}

class B {
	static void m1() {
		System.out.println("B m1()");
	}
}

class C {
	static void m2() {
		System.out.println("C m2()");
	}

	public static void main(String[] args) {
		
		System.out.println("C main()");
		m2();
	}
}
