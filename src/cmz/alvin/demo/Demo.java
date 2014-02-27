package cmz.alvin.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class  Demo extends JFrame implements DocumentListener{
	JTextArea text1,text2;
	public static void main(String[] args) {
		new Demo();
	}
	
	public Demo(){
		this.setBounds(200,200,300,300);
		this.setLayout(new FlowLayout());
		text1=new JTextArea(3,15);
		text2=new JTextArea(3,15);
		
		add(new JScrollPane(text1));
		add(new JScrollPane(text2));
		
		text1.setLineWrap(true);
		text2.setLineWrap(true);
		text2.setEditable(false);
		
		(text1.getDocument()).addDocumentListener(this);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		String str=text1.getText();
		String regex="[\\s\\d\\p{Punct}]+";
		String [] words=str.split(regex);
		Arrays.sort(words);
		text2.setText(null);
		for(String s:words){
			text2.append(s+",");
		}
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		changedUpdate(e);
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		changedUpdate(e);
	}



}

