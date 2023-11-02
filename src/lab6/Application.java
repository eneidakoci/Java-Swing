package lab6;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Application extends JFrame {
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 400;
	
	private JButton shto;
	private JButton kerko;
	private JButton rendit;
	private JList<String> list = new JList<>();
    private DefaultListModel<String> l = new DefaultListModel<>();
    private JOptionPane tekst;
	private JPanel panel1;
	private JPanel panel2;
	private ArrayList<String> emrat;
	
	public Application() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		createComponents();
	}
	class Veprim implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == shto) {
				String emer = JOptionPane.showInputDialog("Shtoni nje student te ri");
            	Student student = new Student(emer);
            	String em = student.getName();
            	l.addElement(em);
			}
			if(e.getSource() == kerko) {
				String kerko = JOptionPane.showInputDialog("Kerkoni nje student");
            	for(int i = 0; i<emrat.size(); i++) {
            		if(kerko.equals(emrat.get(i))) {
            			list.setSelectedIndex(i);
            		}
            	}
			}
			
		}
		
	}

	public void createComponents() {
		//setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		//inicializimi i butonave
		shto = new JButton("Shtoni nje student te ri");
		kerko = new JButton("Kerkoni nje student");
		rendit = new JButton("Rendisni studentet");
		
		panel1 = new JPanel();
		panel1.add(shto);
		panel1.add(kerko);
		panel1.add(rendit);
		
		panel2 = new JPanel();
		list.setModel(l);
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		
		ActionListener listener=new Veprim();
		
		
		shto.addActionListener(listener);
		kerko.addActionListener(listener);
		rendit.addActionListener(listener);
		 
		add(panel1);
	}
}
