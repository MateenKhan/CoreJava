package com.mak.corejava.tweleve.ioo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String args[]) throws Exception {
		Student s1 = new Student(11, "ravi",999);

		FileOutputStream fout = new FileOutputStream("ser.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();
		System.out.println("success");
	}

}
