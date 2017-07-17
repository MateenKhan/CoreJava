package com.mak.corejava.two.datatypess;

class TypeConversion {
	public static void main(String[] args) {
		byte b1 = 10;
		System.out.println("b1: " + b1);
		int i1 = b1;
		System.out.println("i1: " + i1);
		// byte b2 = i1;
		byte b2 = (byte) i1;
		System.out.println("b2: " + b2);
//		 int i = (int)true;
//		 int i = (int)true;
		int i2 = 254;
		// byte b3 = i2;
		byte b3 = (byte) i2;
		System.out.println("b3: " + b3);

		char ch1 = 'a';
		System.out.println("ch1: " + ch1);
		int i3 = ch1;
		System.out.println("i3: " + i3);

		int i4 = 97;
		System.out.println("i4: " + i4);
		// char ch2 = i4;
		char ch2 = (char) i4;
		System.out.println("ch2: " + ch2);

		long l1 = 10;
		System.out.println("l1: " + l1);
		float f1 = l1;
		System.out.println("f1: " + f1);

		// long l2 = f1;
		long l2 = (long) f1;
		System.out.println("l2: " + l2);
	}
}
