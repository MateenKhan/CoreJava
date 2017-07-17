package com.mak.corejava.thirteen.awtt;
import java.awt.*;

public class Fourth extends Frame
{
	Fourth()
	{
		setLayout(new FlowLayout());
		setTitle("Button Frame");
		setVisible(true);
		setSize(500,500);

		Button l1 = new Button("One");
		Button l2 = new Button("Two");
		Button l3 = new Button();

		add(l1);
		add(l2);
		l3.setLabel("Third");
		add(l3);
	}
	public static void main(String[] args) 
	{
		new Fourth();
	}
}
