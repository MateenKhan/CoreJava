package com.mak.corejava.fifteen.swing;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends Frame implements ItemListener
{
	String msg ;
	CheckboxGroup cbg ;
	RadioButtonDemo()
	{
		setLayout(new FlowLayout());
		setTitle("RadioButton Frame");
		setVisible(true);
		setSize(500,500);

		cbg = new CheckboxGroup();
		Checkbox win98 = new Checkbox("Windows 98/XP", cbg , true);
		Checkbox winNT = new Checkbox("Windows NT/2000",cbg, false);
		Checkbox solaris = new Checkbox("Solaris",cbg, false);
		Checkbox mac = new Checkbox("MacOS",cbg, false);

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
		msg = "Current Selection " + cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg,10,100);
	}

	public static void main(String[] args) 
	{
		new RadioButtonDemo();
	}
}
