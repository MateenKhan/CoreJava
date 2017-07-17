package com.mak.corejava.fifteen.swing;
import java.awt.*;
import java.awt.event.*;
public class WindowClosing2 extends Frame
{
	WindowClosing2()
	{
		setVisible(true);
		setSize(500,500);

		addWindowListener(new MyAdapter());
	}

	
	public static void main(String[] args) 
	{
		new WindowClosing2();
	}
}

class MyAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{	
		System.exit(0);
	}
}