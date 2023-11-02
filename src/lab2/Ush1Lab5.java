package lab2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ush1Lab5 extends JFrame {
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	
	private JTextArea textarea;
	private JButton b1;
	private JButton b2;
	private JPanel panel;
	
	public Ush1Lab5() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		createComponents();
	}
	
	class ShtoNeTextArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String text = textarea.getText();
			if(e.getSource() == b1) {
				textarea.setText(text.toLowerCase());
			} else if(e.getSource() == b2) {
				textarea.setText(text.toUpperCase());
			}
			
		}
		
	}
	
	public void createComponents(){
		b1 = new JButton("To lower case");
		b2 = new JButton("To upper case");
		textarea = new JTextArea(1,30);
		ActionListener listener = new ShtoNeTextArea();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		panel = new JPanel();
		panel.add(b1);
		panel.add(b2);
		panel.add(textarea);
		add(panel);
	}
	
	
	
}
