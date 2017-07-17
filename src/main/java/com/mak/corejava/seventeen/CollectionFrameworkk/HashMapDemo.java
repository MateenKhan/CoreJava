package com.mak.corejava.seventeen.CollectionFrameworkk;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		m.put(1, "asdfasfasfdasdf");
		m.put(4, 1);
		m.put(3, 4);
		m.put(2, 2);
		System.out.println(m);
		m.put("name","mateen");
		System.out.println("total map:"+m);
		System.out.println("m.get(2):"+m.get(2));
		System.out.println("m.get(name):"+m.get("name"));
		Student st1 = new Student();
		st1.id=1;
		st1.name="joy";
		m.put("st1", st1);
		Object temp = m.get("st1");
		Student st1Temp = (Student)temp; 
		String name = st1Temp.name;
//		System.out.println("m.get(st1):"+((Student)m.get("st1")).name);
		System.out.println("m.get(st1):"+name);
		
	}

}
