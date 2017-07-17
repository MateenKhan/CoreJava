package com.mak.corejava.fourteen.swing;
//ghjggh How to create a frame.

import javax.swing.*;

class MyFrame extends JFrame{  }

class First{
	public static void main(String a[]){

		MyFrame f = new MyFrame();

		f.setVisible(true);
		f.setSize(200,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}}