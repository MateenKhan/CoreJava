package com.mak.corejava.three.operatorss;

public class TernaryOperatorDemo extends Object{

	public static void main(String[] args) {
		int a=10,b=20;int c;
//		if(a<b){
//			c=100;
//		}else{
//			c=200;
//		}
		c=(a<b)?100:200;
		System.out.println(c);
	}

}
