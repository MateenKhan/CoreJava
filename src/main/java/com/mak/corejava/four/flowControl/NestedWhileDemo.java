package com.mak.corejava.four.flowControl;

public class NestedWhileDemo {

	public static void main(String[] args) {
		int i=1;
		while(i<3){
			System.out.println("parent:"+i);
			int j=1;
			while(j<3){
				System.out.println("\tchild:"+j);
				j++;
			}
			i++;
		}
	}
	
}
