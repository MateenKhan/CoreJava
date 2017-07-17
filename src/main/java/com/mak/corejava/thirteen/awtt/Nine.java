package com.mak.corejava.thirteen.awtt;
//Very important program pay attention
//you guys have got the method how to set the FONT.
import java.awt.*;
public class Nine extends Frame 
{
	Label l1 , l2 , l3 ;
	TextField tf1,tf2 ;
	Button b1,b2 ;
	Font f1,f2 ;
	Nine()
	{
		setLayout(null);
		setSize(500,500);
		setVisible(true);

		f1 = new Font("Algerian",Font.BOLD,30);
		f2 = new Font("Candara",Font.BOLD,20);//ITALIC

		l1 = new Label("Login Screen");
		l1.setBounds(100,100,200,30);
		add(l1);
		l1.setFont(f1);

		l2 = new Label("Username");
		l2.setBounds(200,150,100,30);
		add(l2);
		l2.setFont(f2);

		l3 = new Label("Password");
		l3.setBounds(200,200,100,30);
		add(l3);
		l3.setFont(f2);

		tf1 = new TextField(20);
		tf1.setBounds(320,150,100,30);
		add(tf1);

		tf2 = new TextField(20);
		tf2.setBounds(320,200,100,30);
		add(tf2);
		tf2.setEchoChar('*');

		b1 = new Button("Submit");
		b1.setBounds(230,250,70,30);
		add(b1);

		b2 = new Button("Cancel");
		b2.setBounds(340,250,70,30);
		add(b2);
	}
	public static void main(String[] args) 
	{
		new Nine();
	}
}
