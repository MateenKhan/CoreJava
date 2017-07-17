package com.mak.corejava.thirteen.awtt;
import java.awt.*;
class Final extends Frame{

	MenuBar m;
	Menu m1;
	MenuItem item;
	Final(){
		setVisible(true);
		setSize(200,200);
		m = new MenuBar();
		m1 = new Menu("asdf");
//		m1.add(BorderLayout.NORTH);
		m.add(m1);
		item = new MenuItem("qwerty");
		m1.add(item);
}

	public static void main(String a[]){
		new Final();
	}}
