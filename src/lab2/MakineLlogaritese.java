package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MakineLlogaritese extends JFrame {
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;

	private JTextField field1;
	private JTextField field2;
	private JButton shto;
	private JButton zbrit;
	private JButton shumezo;
	private JButton pjeseto;
	private JButton pastro;
	private JPanel p1;//ketu do shkruhet makine llogaritese
	private JPanel p2;//ketu kemi text fields dhe butonat dhe afishimi
	private JPanel p3;//ktu eshte butoni pastro ne te djathte
	private JTextArea area;
	private int nr1;
	private int nr2;
	
	
	public MakineLlogaritese() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		createComponents();
	}
	class DegjoButon implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				int n1 = Integer.parseInt(field1.getText());
				int n2 = Integer.parseInt(field2.getText());
				int result;
			if(e.getSource() == shto) {
				result = n1+n2;
				area.append(n1+ " + " + n2 + " = " + result + "\n");	
			}
			if(e.getSource() == zbrit) {
				result = n1-n2;
				area.append(n1+ " - " + n2 + " = " + result + "\n");
			} if(e.getSource() == shumezo) {
				result = n1*n2;
				area.append(n1+ " * " + n2 + " = " + result + "\n");
			} if(e.getSource() == pjeseto) {
				result = n1/n2;
				area.append(n1+ " / " + n2 + " = " + result + "\n");
			}
			
		}catch(Exception ex) {
			area.append("Nuk keni dhene numra!");
		}
		
	}
	
}
	
	public void createComponents() {
		field1 = new JTextField(15);
		field2 = new JTextField(15);
		shto = new JButton("+");
		zbrit = new JButton("-");
		shumezo = new JButton("*");
		pjeseto = new JButton("/");
		area = new JTextArea(20,50);
		
		ActionListener listener = new DegjoButon();
		shto.addActionListener(listener);
		zbrit.addActionListener(listener);
		shumezo.addActionListener(listener);
		pjeseto.addActionListener(listener);
		
		p1= new JPanel();
		
		p1.add(field1);
		p1.add(field2);
		p1.add(shto);
		p1.add(zbrit);
		p1.add(shumezo);
		p1.add(pjeseto);
		
		p2.add(area);
		p3.add(pastro);
		setLayout(new BorderLayout());
		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		add(p1);
		
		
	}


	}
