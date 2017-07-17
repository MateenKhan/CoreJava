package com.mak.corejava.three.operatorss;
class ArithmeticOperators 
{
	public static void main(String[] args) 
	{
		System.out.println("10+10:"+(10+10));
		System.out.println("10-10:"+(10-10));
		System.out.println("10*10:"+(10*10));
		System.out.println("10/10:"+(10/10));
		System.out.println("10%10:"+(10%10));
		System.out.println("0/10:"+0/10); //0
	
		System.out.println("10/0.0:"+10/0.0); //=>		System.out.println(10.0/0.0); Infinity
		System.out.println("0.0/0:"+0.0/0); //NaN
		System.out.println("0.0/10:"+0.0/10); //0.0

		System.out.println("-10.0/0:"+-10.0/0); //-Inifinity
		System.out.println("-0.0/0:"+-0.0/0); //NaN
		System.out.println("-0.0/10:"+-0.0/10); //-0.0
	}
}