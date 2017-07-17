package com.mak.corejava.fourteen.swing;

//All of the awt things are also present in Swings
//we can write a program with the combination of AWT and SWINGS

import javax.swing.*;//SWING HERE
import java.awt.*;//(AWT)Borderlayout is in this package

class ThirdSupport extends JFrame {

	JButton b1, b2, b3, b4, b5;

	ThirdSupport() {

		b1 = new JButton("Hello");
		b2 = new JButton("Hai");
		b3 = new JButton("Wassap");
		b4 = new JButton("Bye");
		b5 = new JButton("Center");

		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
	}
}

class Third {
	public static void main(String a[]) {
		ThirdSupport f = new ThirdSupport();
		f.setVisible(true);
		f.setSize(250, 250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}