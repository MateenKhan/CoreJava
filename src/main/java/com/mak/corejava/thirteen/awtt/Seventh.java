package com.mak.corejava.thirteen.awtt;
import java.awt.*;

public class Seventh extends Frame
{
	Seventh()
	{
		setLayout(new FlowLayout());
		setTitle("List Frame");
		setVisible(true);
		setSize(500,500);

		List os , browser ;
		os = new List(4, true);
		browser = new List(4, false);
		
		os.add("Windows 98/XP");
		os.add("Windows NT/2000");
		os.add("Solaris");
		os.add("MacOS");
		
		browser.add("Netscape 3.x");
		browser.add("Netscape 4.x");
		browser.add("Netscape 5.x");
		browser.add("Netscape 6.x");

		
		add(os);
		add(browser);
	}
	public static void main(String[] args) 
	{
		new Seventh();
	}
}
