package com.mak.corejava.seven.inheritancee;
public class OvreridingAccessLevelDemo {
	public static void main(String[] args) {
	}
}

class A1{
	protected void print(){System.out.println("A1");}
}

class A2 extends A1{
	@Override
	public void print(){System.out.println("A2");}
}
