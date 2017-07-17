package com.mak.corejava.eleven.String;

public class StringMethodsDemo {

	public static void main(String[] args) {
//		String name="   Mateen Ahmed Khan Khan Khan";
		String name="Mateen Ahmed Khan ";
		System.out.println("string:"+name);
		System.out.println("name length:"+name.length());
//		
		
		String name2 = name.substring(13);
		System.out.println("substring1:"+name2);
//		
		String name3 = name.substring(0,6);
		System.out.println("substring2:"+name3);
		
		String s ="         asdf          ";
		System.out.println("s:"+s);
		System.out.println("s:"+s.trim());
		
		String name4 = name.replace("Khan", "asfadsf");
		System.out.println("name4:"+name4);
		
//		String s1 = new String("asdf");
//		String s2 = new String("asdf");
//		String s3 = new String("ASDF");
//		System.out.println("s1==s2:"+(s1==s2));
//		System.out.println("s1.equals(s2):"+s1.equals(s2));
//		System.out.println("s1.equals(s3):"+s1.equals(s3));
//		System.out.println("s1.equalsIgnoreCase(s3):"+s1.equalsIgnoreCase(s3));
//		
		System.out.println("s1.charAt(0):"+name.charAt(0));
		
		System.out.println("s1.indexOf(\"ed\"):"+name.indexOf("ed"));
		System.out.println("s1.indexOf(\"n\"):"+name.indexOf("n"));
		System.out.println("s1.lastIndexOf(\"n\"):"+name.lastIndexOf("n"));
		
	}

}
