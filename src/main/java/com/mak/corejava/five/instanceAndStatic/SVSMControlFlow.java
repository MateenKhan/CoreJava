package com.mak.corejava.five.instanceAndStatic;
class SVSMControlFlow 
{
	static int a = m1();

	public static void main(String[] args) 
	{
		System.out.println("main is being executed");
		new SVSMControlFlow();new SVSMControlFlow();//two anonymous objects
	}

	static int m1()
	{
		System.out.println("a is being executed");		
		return 10;
	}
	
	static int m2()
	{
		System.out.println("b is being executed");		
		return 20;
	}
	
	static int b = m2();
	
	{
		System.out.println("instatnce block executing");
		//executed everytime an object is created
	}
}
