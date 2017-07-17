package com.mak.corejava.seven.constructors;

//overloading methods

class Third {
	void show(int a, char b, int c, char d) {
		System.out.println("Basic Method with four paramters");
	}

	void show(double a, double b, double c, double d) {
		System.out.println("overloaded method with all diffrent parameters");
	}

	void show(char a, int b, char c, int d) {
		System.out
				.println("overloaded method with same paramters but in diffrent sequence");
	}
}

class Tmain {
	public static void main(String args[]) {
		Third t = new Third();
		t.show(1, '2', 3, '4');
		t.show(1.0, 2.0, 1.0, 1.0);
		t.show('1', 2, '3', 4);
	}
}