package cmz.alvin.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;


public class  Demo extends JFrame implements ActionListener{
	JTextField textshow=null;
	JPasswordField password=null;
	public static void main(String[] args) {
		new Demo();
	}
	
	public Demo(){
		this.setBounds(200,200,300,300);
		this.setLayout(new FlowLayout());
		password=new JPasswordField(10);
		textshow=new JTextField(20);
		textshow.setEditable(false);
		
		this.add(textshow);
		this.add(password);
		
		password.addActionListener(this);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JPasswordField passwordText=(JPasswordField)e.getSource();
		char []password=passwordText.getPassword();
		String str=new String(password);
		textshow.setText("√‹¬Î «:"+str);
	}


}

