package com.mak.corejava.fourteen.swing;
//All of the awt things are also present in Swings
//we can write a program with the combination of AWT and SWINGS

//same as the previous program but this is in AWT
import java.awt.*;//(AWT)Borderlayout is in this package

class MyButtonsAwt extends Frame{
	Button b1,b2,b3,b4,b5;
	MyButtonsAwt(){
		b1 = new Button("Hello");
		b2 = new Button("Hai");
		b3 = new Button("Wassap");
		b4 = new Button("Bye");
		b5 = new Button("Center");
		setLayout(new BorderLayout());
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
	}}

class FourthAwt{
	public static void main(String a[]){
		MyButtonsAwt f = new MyButtonsAwt();
		f.setVisible(true);f.setSize(250,250);

	}}