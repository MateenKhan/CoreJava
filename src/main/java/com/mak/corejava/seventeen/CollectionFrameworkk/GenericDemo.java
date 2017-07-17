package com.mak.corejava.seventeen.CollectionFrameworkk;

import java.util.Date;
import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		
		ArrayList<Date> list  = new ArrayList<Date>();
//		list.add("name");
//		list.add("id");
//		list.add("readable");
//		list.add(1);
//		list.add(2);
//		list.add("asdfsadfsa");
		Student st1 = new Student();
		st1.name="billy";
//		list.add(st1);
		Date d = new Date();
		list.add(d);
		
		System.out.println(list);
	}

}
