package com.mak.corejava.five.instanceAndStatic;

public class BlockDemo {
	
	static{
		System.out.println("static block");
	}
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		BlockDemo obj = new BlockDemo();
		BlockDemo obj2= new BlockDemo();
	}

}
