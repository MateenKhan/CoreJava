package com.mak.corejava.fifteen.swing;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class CheckboxDemo extends Frame implements ItemListener
{
	String msg ;
	Checkbox win98,winNT,solaris,mac;
	CheckboxDemo()
	{
		setLayout(new FlowLayout());
		setTitle("Checkbox Frame");
		setVisible(true);
		setSize(500,500);

		win98 = new Checkbox("Windows 98/XP", null, true);
		winNT = new Checkbox("Windows NT/2000");
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("MacOS");
		add(win98);
		add(winNT);
		add(solaris);
		add(mac);

		win98.addItemListener(this);
		winNT.addItemListener(this);
		solaris.addItemListener(this);
		mac.addItemListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{	
				System.exit(0);
			} 
		});
	}

	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("Current State ",10,100);
		msg = "Windows98 " + win98.getState() ;
		g.drawString(msg,10,120);
		msg = "Windows NT " + winNT.getState() ;
		g.drawString(msg,10,140);
		msg = "Solaris " + solaris.getState() ;
		g.drawString(msg,10,160);
		msg = "Macintosh " + mac.getState() ;
		g.drawString(msg,10,180);
	}

	public static void main(String[] args) 
	{
		new CheckboxDemo();
	}
}
