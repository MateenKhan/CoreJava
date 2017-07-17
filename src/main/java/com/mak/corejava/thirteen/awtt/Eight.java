package com.mak.corejava.thirteen.awtt;
import java.awt.*;

public class Eight extends Frame
{
	Eight()
	{
		setLayout(new FlowLayout());
		setTitle("Text Frame");
		setVisible(true);
		setSize(500,500);
		
		TextField tf1 , tf2 , tf3;

		tf1 = new TextField(25);
		tf2 = new TextField();
		tf3 = new TextField(10);

		tf3.setEchoChar('*');
		TextArea area = new TextArea(20,30);

		add(tf1);
		add(tf2);
		add(tf3);		
		add(area);

	}
	public static void main(String[] args) 
	{
		new Eight();
	}
}
