package lab2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	private JTextField field1;
	private JTextField field2;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JButton plus;
	private JButton minus;
	private JButton shumezim;
	private JButton pjesetim;
	private JButton pastro;
	
	public Calculator() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	class Llogarit implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == plus) {
				
			} else if(e.getSource() == minus) {
				
			}else if(e.getSource() == shumezim) {
				
			}else if(e.getSource() == pjesetim) {
				
			}
			
		}
		
	}
	
	public void createComponents() {
		field1 = new JTextField(20);
		field2 = new JTextField(20);
		plus = new JButton("+");
		minus = new JButton("-");
		shumezim = new JButton("*");
		pjesetim = new JButton("/");
		panel1= new JPanel();
		
		panel1.add(field1);
		panel1.add(field2);
		panel1.add(plus);
		panel1.add(minus);
		panel1.add(shumezim);
		panel1.add(pjesetim);
		
		
		add(panel1);
		
	}
	
}
