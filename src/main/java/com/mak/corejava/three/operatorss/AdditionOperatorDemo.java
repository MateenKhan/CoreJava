package com.mak.corejava.three.operatorss;
class AdditionOperatorDemo 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;

		System.out.println(a + b);
		System.out.println("a" + "b");
		System.out.println("a + b" + a + b);

		System.out.println("a + b" + (a + b));
		System.out.println("a - b" + (a - b));//a-b-10
		System.out.println("a * b" + a * b);

		//more testing bits 
		System.out.println(10 + 20);
		System.out.println(10 + 20 + "");
		System.out.println(10 + "" + 20 );
		System.out.println("" +10 + 20 );
		System.out.println("" +(10 + 20) );
	}
}
