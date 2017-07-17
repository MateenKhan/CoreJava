package com.mak.corejava.fourteen.swing;
//How to create a Button
//no layout specified see what happens

import javax.swing.*;

class MyButton extends JFrame{

	JButton b1,b2;

	MyButton(){

		b1 = new JButton("Hello");
		b2 = new JButton("Hai");
		add(b1);
		add(b2);
	}}


class Second{
	public static void main(String a[]){
	MyButton f = new MyButton();
	f.setVisible(true);
	f.setSize(200,200);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}}