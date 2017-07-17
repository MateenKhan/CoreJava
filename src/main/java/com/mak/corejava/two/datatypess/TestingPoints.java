package com.mak.corejava.two.datatypess;
class TestingPoints 
{
	public static void main(String[] args) 
	{
		byte b1 = 10;
		System.out.println("byte1 10:"+b1);
		byte b2 = 100;
		System.out.println("byte2 100:"+b2);
		//byte b3 = 254;
		byte b3 = (byte)254;
		System.out.println("byte 254:"+b3);

		char ch1  = 'a';
		System.out.println("char a:"+ch1);
		char ch2  = 98;
		System.out.println("char of number 98:"+ch2);

		int i1  = 97;
		System.out.println("int 97:"+i1);
		int i2  = 'b';
		System.out.println("int of b:"+i2);

		int a = 10;
		System.out.println("int 10:"+a);
		//byte b = a;
		byte b = (byte)a;
		System.out.println("byte of 10:"+b);

		long l = 10;
		System.out.println("long of 10:"+l);
		float f = l;
		System.out.println("float of 10:"+f);
	
		//long l2= f;
		float f2 = 24.97f;
		System.out.println("float 24.97f:"+f2);
		long l2= (long)f2;
		System.out.println("long of 24.97f:"+l2);

		float f3 = 254.97f;
		System.out.println("float of 254.97f:"+f3);
		byte b4= (byte)f3;
		System.out.println("byte of 254.97f:"+b4);
		
		System.out.println("22/7 * 10 * 10=="+(22/7 * 10 * 10));     //300
		System.out.println("22.0/7 * 10 * 10=="+(22.0/7 * 10 * 10));  //314.285.....


		byte b12 = 10;
		byte b13 = 118;
		byte b14 = (byte)(b12 + b13);
		System.out.println("(byte)(10 + 118):"+b14);  
		int a14 = b12 + b13;
		System.out.println("(int)(10 + 118):"+a14);  

		char ch12 = 'a';
		char ch13 = 'b';
		//char ch14 = ch12 + ch13;
		char ch14 = (char)(ch12 + ch13);
		int i14 = ch12 + ch13;
		System.out.println("(char)(a+ b):"+ch14);  //�
		System.out.println("a+b:"+i14);  //195

	}
}