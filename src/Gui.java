import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
/*import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;*/

public class Gui implements ActionListener{
private int count=0;
private JLabel label;
private JPanel panel;

	public Gui() {//for the frame, layout
		JFrame frame=new JFrame();
		
		JButton button=new JButton("Kliko");
		button.addActionListener(this);
		
		label=new JLabel("Numri i klikimeve: 0");
		panel=new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));//parametrat lart,poshte,djathtas, majtas
		panel.setLayout(new GridLayout(0,1));//parametrat row column
		panel.add(button);
		panel.add(label);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Gui();//konstruktori

	}
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Numri i klikimeve: "+count);
	}

}
