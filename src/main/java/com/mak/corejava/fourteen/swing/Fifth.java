package com.mak.corejava.fourteen.swing;

import java.awt.*;
import javax.swing.*;

public class Fifth extends JFrame
{
	JLabel l1,l2;
	JButton b1,b2;
	JCheckBox ch1,ch2;
	JRadioButton r1,r2;
	JComboBox combo ;
	JTextField tf;
	JTextArea ta ;
	JPasswordField pf ;
	JScrollPane pane ;
	ImageIcon icon ;
	ButtonGroup bg;

	Fifth()
	{
		setLayout(new FlowLayout());
		setTitle("All Components");
		setVisible(true);
		setSize(850,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		icon = new ImageIcon("java.png");
		l1 = new JLabel("Hello World");
		l2 = new JLabel(icon);
		b1 = new JButton("Submit");
		b2 = new JButton(icon);
		ch1 = new JCheckBox("Windows");
		ch2 = new JCheckBox("Macintosh");
		 bg = new ButtonGroup();
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		//bg.add(r1);
		//bg.add(r2);
		combo = new JComboBox();
		combo.addItem("Java");
		combo.addItem(".Net");
		combo.addItem("Ajax");
		combo.addItem("PHP");
		tf = new JTextField(25);
		pf = new JPasswordField(25);
		ta = new JTextArea(10,30);
		pane = new JScrollPane(ta);

		add(l1);
		add(l2);
		add(b1);
		add(b2);
		add(ch1);
		add(ch2);
		add(r1);
		add(r2);
		add(combo);
		add(tf);
		add(pf);
		add(pane);

	}

	public static void main(String[] args) 
	{
		Fifth f = new Fifth();
	}
}
