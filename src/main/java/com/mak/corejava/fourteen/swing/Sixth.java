package com.mak.corejava.fourteen.swing;
//Events in swings

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Events extends JFrame implements ActionListener{
	JButton b1;

	Events(){
		super("Event");
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	//Consider Above NOJFRAME.EXIT...

		b1 = new JButton("Event raising button");
		add(b1);
		b1.addActionListener(this);
    }
 	public void actionPerformed(ActionEvent ae){
 	       JOptionPane.showMessageDialog(null, "SWINGS ARE BEAUTIFUL");
        	}}

class Sixth{
public static void main(String a[]){
new Events();
}}