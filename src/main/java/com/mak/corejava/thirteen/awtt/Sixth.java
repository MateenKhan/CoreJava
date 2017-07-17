package com.mak.corejava.thirteen.awtt;
import java.awt.*;

public class Sixth extends Frame
{
	Sixth()
	{
		setLayout(new FlowLayout());
		setTitle("Choice Frame");
		setVisible(true);
		setSize(500,500);

		Choice os, browser;
			
		os = new Choice();
		browser = new Choice();
		os.add("Windows 98/XP");

		os.add("Windows NT/2000");
		os.add("Solaris");
		os.add("MacOS");
		
		browser.add("Netscape 3.x");
		browser.add("Netscape 4.x");
		browser.add("Netscape 5.x");
		browser.add("Netscape 6.x");
		browser.add("Internet Explorer 4.0");
		
		add(os);
		add(browser);
//		System.out.println(os.getSelectedItem());
//		System.out.println(browser.getSelectedItem());
	}
	public static void main(String[] args) 
	{
		new Sixth();
	}
}
