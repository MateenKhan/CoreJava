package com.mak.corejava.eleven.String;

public class StringMethodBasic {

	public static void main(String[] args) {
//		String num1 = "111";
//		String num2="2";
//		String res=num1+num2;
//		System.out.println("res:"+res);
//		System.out.println("res.length():"+res.length());
//		System.out.println("res.charAt(3):"+res.charAt(3));
//		
//		String name1 = "khalid";
//		String name2 = "khalid";
		String name1 = new String("khalid");
//		String name2 = new String("khalid");
		String name2 = new String("KHalid");
//		String name2 = name1;
//		System.out.println("(name1==name2):"+(name1==name2));
//		System.out.println("(name1.equals(name2)):"+(name1.equals(name2)));
		System.out.println("(name1.equals(name2)):"+(name1.equalsIgnoreCase(name2)));
	}

}
