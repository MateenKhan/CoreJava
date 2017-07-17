package com.mak.corejava.fourteen.swing;
//All of the awt things are also present in Swings
//we can write a program with the combination of AWT and SWINGS

//same as the previous program but this is in AWT
import java.awt.*;//(AWT)Borderlayout is in this package
import javax.swing.JButton;
import javax.swing.JFrame;


class MyButtons extends JFrame{
	Button b1,b2,b3,b4,b5;
	MyButtons(){
		b1 = new Button("Hello");
		b2 = new Button("Hai");
		b3 = new Button("Wassap");
		b4 = new Button("Bye");
		b5 = new Button("Center");
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
	}}

class Fourth{
	public static void main(String a[]){
		MyButtons f = new MyButtons();
		f.setVisible(true);f.setSize(250,250);

	}}