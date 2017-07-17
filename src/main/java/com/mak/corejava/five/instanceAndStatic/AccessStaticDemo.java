package com.mak.corejava.five.instanceAndStatic;

public class AccessStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(StaticMembers.a);
		StaticMembers.printString();
		StaticMembers obj = new StaticMembers();obj.b=20;obj.a=20;
		StaticMembers obj2 = new StaticMembers();obj2.b=30;obj2.a=30;
		StaticMembers obj3 = new StaticMembers();obj3.b=40;obj3.a=40;
		StaticMembers obj4 = new StaticMembers();obj4.b=50;obj4.a=50;
		System.out.println(obj.a+"\t"+obj.b);
		System.out.println(obj2.a+"\t"+obj2.b);
		System.out.println(obj3.a+"\t"+obj3.b);
		System.out.println(obj4.a+"\t"+obj4.b);
		
//		System.out.println(obj.b);
//		obj.printString2();
	}

}
