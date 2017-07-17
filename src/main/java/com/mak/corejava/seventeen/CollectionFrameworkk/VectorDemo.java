package com.mak.corejava.seventeen.CollectionFrameworkk;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("v.capacity():"+v.capacity());
		v.add(1);v.add(2);v.add(3);
		System.out.println("v.capacity():"+v.capacity());
		v.add(4);v.add(5);v.add(3,33);v.add(4);v.add(5);v.add(3,33);v.add(4);v.add(5);v.add(3,33);
		System.out.println(v);
		System.out.println("v.capacity():"+v.capacity());
		System.out.println("v.size():"+v.size());
	}

}
