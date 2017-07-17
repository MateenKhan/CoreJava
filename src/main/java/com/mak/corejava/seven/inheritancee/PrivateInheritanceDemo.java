package com.mak.corejava.seven.inheritancee;

class Father{
	int property=10000;
	private String wifeName="annie";
}

class Son extends Father{
	public void printProperty(){
		System.out.println("son property is:"+property);
	}
	public void printWifeName(){
//		System.out.println("son wife is:"+wifeName);
	}
}


public class PrivateInheritanceDemo {
	
	public static void main(String[] args) {
		Son obj = new Son();
		obj.printProperty();
	}

}
