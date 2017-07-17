package com.mak.corejava.seventeen.CollectionFrameworkk;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map m = new TreeMap();
		m.put(1, 11);m.put(2, 22);m.put(4, 44);m.put(3, 33);
//		m.put(12, "sadfasdf");
		System.out.println("total map:"+m);
		System.out.println("m.containsKey(1)):"+m.containsKey(1));
		System.out.println("m.containsValue(44):"+m.containsValue(44));
		Iterator itr = m.keySet().iterator();
		while(itr.hasNext()){
			int i = (Integer)itr.next();
//			System.out.println("itr.next():"+itr.next());
			System.out.println("key:"+i+"  value:"+m.get(i));
		}
	}

}
