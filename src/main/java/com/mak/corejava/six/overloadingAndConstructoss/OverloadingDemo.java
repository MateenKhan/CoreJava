package com.mak.corejava.six.overloadingAndConstructoss;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo obj = new OverloadingDemo();
		obj.print(1,'a');
		obj.print('c');
	}

	public void print(int num,char ch) {
		System.out.println("int:"+num +" char:"+ch);
	}
	
	public void print(char num) {
		System.out.println("char:"+num);
	}
	
}
