package com.mak.corejava.fifteen.swing;
import java.awt.*;
import java.awt.event.*;
public class WindowClosing3 extends Frame
{
	WindowClosing3()
	{
		setVisible(true);
		setSize(500,500);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{	
				System.exit(0);
			} 
		});
	}

	public static void main(String[] args) 
	{
		new WindowClosing3();
	}
}