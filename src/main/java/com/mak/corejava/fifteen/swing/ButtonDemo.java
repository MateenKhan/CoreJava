package com.mak.corejava.fifteen.swing;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame implements ActionListener
{
	Button l1,l2,l3;
	ButtonDemo()
	{
		setLayout(new FlowLayout());
		setTitle("Button Frame");
		setVisible(true);
		setSize(500,500);

		l1 = new Button("Red");
		l2 = new Button("Green");
		l3 = new Button("Blue");

		add(l1);
		add(l2);
		add(l3);

		l1.addActionListener(this);
		l2.addActionListener(this);
		l3.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{	
				System.exit(0);
				//setVisible(false);
			} 
		});
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == l1)
		{
			setBackground(Color.red);
		}

		if(ae.getSource() == l2)
		{
			setBackground(Color.green);
		}

		if(ae.getSource() == l3)
		{
			setBackground(Color.blue);
		}
	}
	public static void main(String[] args) 
	{
		new ButtonDemo();
	}
}
