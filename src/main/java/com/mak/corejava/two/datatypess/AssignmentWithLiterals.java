package com.mak.corejava.two.datatypess;
class AssignmentWithLiterals 
{
	public static void main(String[] args) 
	{
		byte b1 = 10;
		byte b2 = 'a';
		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);

		char ch = 'a';
		//byte b3 = ch;
		System.out.println(ch);
		//byte b3 = 254;
		short s1 = 254;
		System.out.println("s1: "+s1);

		double d = 37.435;
		System.out.println("d: "+d);
		//float f  = 37.435;
		float f  = 37.435f;
		System.out.println("f: "+f);

		long l = 10L;
		//int i = 10L;
		System.out.println("l: "+l);

		char ch2 = (char)256;
		System.out.println("ch2: "+ch2);



	}
}
