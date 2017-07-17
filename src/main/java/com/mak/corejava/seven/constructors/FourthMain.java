package com.mak.corejava.seven.constructors;

//overloading constructors

class Fourth {
	Fourth() {
		System.out.println("No argument constructor");
	}

	Fourth(int a, char b, float c) {
		System.out.println("Three argument constructor");
	}

	Fourth(float a, float b, float c) {
		System.out.println("Overload constructor with diffrent forms" + b);
	}

	Fourth(char a, int b, char c) {
		System.out.println("one more overloaded constructor");
	}
}

class FourthMain {
	public static void main(String args[]) {
		new Fourth();
		Fourth fa = new Fourth(1, '2', 3.0f);
		Fourth fb = new Fourth(1.0f, 2.0f, 3.0F);
		Fourth fc = new Fourth('a', 2, 'b');
	}
}
