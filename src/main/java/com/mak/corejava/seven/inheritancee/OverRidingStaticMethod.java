package com.mak.corejava.seven.inheritancee;

public class OverRidingStaticMethod {
	public static void main(String[] args) {
		A102 obj = new A103();
//		obj.print();
		obj.p1('a');
	}
}

class A102{
	public void p1(int a){
		System.out.println(a);
	}
	static void print(){
		System.out.println("static method of A102");
	}
}
class A103 extends A102{
	public void p1(char a){
		System.out.println("method of A103");
	}
	static void print(){
		System.out.println("static method of A103");
	}	
}