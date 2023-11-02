package guiMeSkedar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exchange extends JFrame {
	private JLabel l1;
	private JLabel l2;
	private JComboBox<String> c1;
	private JComboBox<String> c2;
	private JButton b;
	private JPanel p1;
	private JPanel p2;
	private JTextField f1;
	private JTextArea area;
	
	public Exchange() {
		setSize(500,500);
		createComponents();
	}

	public void createComponents() {
		l1 = new JLabel("Nga");
		l2 = new JLabel("Tek:");
		
		c1 = new JComboBox<>();
		c1.addItem("USD");
		c1.addItem("EUR");
		c1.addItem("LEK");
		
		c2 = new JComboBox<>();
		c2.addItem("USD");
		c2.addItem("EUR");
		c2.addItem("LEK");
		
		f1 = new JTextField(20);
		area = new JTextArea(20,20);
		
		b = new JButton("Konverto");
		ActionListener l = new Konvertim();
		b.addActionListener(l);
		
		p1 = new JPanel();
		p1.add(l1);
		p1.add(c1);
		p1.add(c2);
		p1.add(f1);
		
		p2 = new JPanel();
		p2.add(area);
		p2.add(l2);
		p2.add(b);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		
		
	}
	
	class Konvertim implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(c1.getSelectedItem() == "USD" && c2.getSelectedItem() == "EUR") {
				int a = Integer.parseInt(f1.getText());
				area.append((a*0.8)+ "EUR");
			}else if(c1.getSelectedItem() == "EUR" && c2.getSelectedItem() == "USD") {
				int a = Integer.parseInt(f1.getText());
				area.append((a*1.3)+ "USD");
			}
			
		}
		
	}
	
}
