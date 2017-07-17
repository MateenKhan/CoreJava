package com.mak.corejava.fifteen.swing;
import java.awt.*;
import java.awt.event.*;
public class WindowClosing1 extends Frame implements WindowListener
{
	WindowClosing1()
	{
		setVisible(true);
		setSize(500,500);

		addWindowListener(this);
	}

	public void windowActivated(WindowEvent we)
	{}
	public void windowClosed(WindowEvent we)
	{}
	public void windowClosing(WindowEvent we)
	{	
		//log window closed new Date();
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we)
	{}
	public void windowDeiconified(WindowEvent we)
	{
		System.out.println("windowDeiconified");
		//obj.log(window minimized);
	}
	public void windowIconified(WindowEvent we)
	{}
	public void windowOpened(WindowEvent we)
	{}

	public static void main(String[] args) 
	{
		new WindowClosing1();
	}
}
