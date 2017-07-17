package com.mak.corejava.two.datatypess;

public class DefaultValues {

	int a;
	byte b;
	short s;
	long l;
	char c;
	boolean bo;
	float f;
	double d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultValues obj = new DefaultValues();
		obj.displayDefaultValues();
	}

	public void displayDefaultValues(){
		System.out.println("integer data types");
		System.out.println("int:"+a);
		System.out.println("byte:"+b);
		System.out.println("short:"+s);
		System.out.println("long:"+l);
		System.out.println("--------------------------------------");
		
		System.out.println("float:"+f);
		System.out.println("double:"+d);
		System.out.println("--------------------------------------");
		
		System.out.println("boolean:"+bo);
		System.out.println("char:*"+c+"*");
		
	}
}
