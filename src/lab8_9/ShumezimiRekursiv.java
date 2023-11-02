package lab8_9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShumezimiRekursiv extends JFrame{
	private JTextField field1;
	private JTextField field2;
	private JPanel panel;
	private JLabel result;
	private ActionListener listener;
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	
	public ShumezimiRekursiv() {
		setSize(FRAME_WIDTH,FRAME_WIDTH);
		createComponents();
	}
	
	private void createComponents() {
		field1 = new JTextField(10);
		field2 = new JTextField(10);
		result = new JLabel();
		listener = new Shumezo();
		field2.addActionListener(listener);
		panel = new JPanel();
		panel.add(field1);
		panel.add(field2);
		panel.add(result);
		add(panel,BorderLayout.CENTER);
	}
	
	public int shumezo (int n1, int n2) {
		if(n2 > 0) 
			return (n1+shumezo(n1, n2-1)); 
		
		else if(n1 < 0)
			return (-n1 + shumezo(n1, n2+1));
		
		else 
			return 0;
		
	}
	
	class Shumezo implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int a = Integer.parseInt(field1.getText());
			int b = Integer.parseInt(field2.getText());
			int shuma = shumezo(a,b);
			result.setText(String.valueOf(shuma));
		}
		
	}
}