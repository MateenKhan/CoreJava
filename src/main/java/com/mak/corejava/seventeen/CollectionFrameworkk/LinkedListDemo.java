package com.mak.corejava.seventeen.CollectionFrameworkk;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lnklst = new LinkedList();
		lnklst.add(1);lnklst.add(2);lnklst.add(3);lnklst.add(3);
		System.out.println("total elements before adding:"+lnklst);
		lnklst.addFirst(0);
		lnklst.addLast(4);
		System.out.println("total elements after adding:"+lnklst);
		System.out.println("getFirst():"+lnklst.getFirst());
		System.out.println("getLast():"+lnklst.getLast());
	}

}
