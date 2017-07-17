package com.mak.corejava.tweleve.ioo;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	static int staticVar;

	public Student(int id, String name,int staticVar) {
		this.id = id;
		this.name = name;
		this.staticVar=staticVar;
	}
}