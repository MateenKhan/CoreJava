package com.mak.corejava.five.instanceAndStatic;

public class PersonObjectDemo {

	public static void main(String[] args) {
		Person obj = new Person();
		obj.setBankBalance(10000);
		obj.setIsMale(true);
		System.out.println("obj:"+obj.getBankBalance());
		System.out.println("obj:"+obj.getIsMale());
		
		Person obj2 = new Person();
		obj2.setBankBalance(1000);
		obj2.setIsMale(false);
		System.out.println("obj2:"+obj2.getBankBalance());
		System.out.println("obj2:"+obj2.getIsMale());
	}

}
