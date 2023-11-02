package seminar2Sem2;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.event.*;
/*Ndryshoni programin ButtonViewer në mënyrë të tillë që të ketë dy butona dhe secili prej tyre
të printojë mesazhin “Jam klikuar n here !” sa herë që shtypet ndonjëri nga butonat. Çdo buton të
ketë një numërues klikimesh të ndarë.*/
@SuppressWarnings("serial")
public class ButtonViewer extends JFrame {
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	
	private JPanel panel;
	private JButton b1;
	private JButton b2;
	private JLabel label1;
	private JLabel label2;
	private int count1=0;
	private int count2=0;
	
	public ButtonViewer() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		createComponents();
		
	}
	
	class NumerKlikimesh implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1) {
				count1++;
				label1.setText("Jam klikuar "+count1+" here");
			}else if(e.getSource() == b2) {
				count2++;
				label2.setText("Jam klikuar "+count2+" here");
			}
			
			
			
			//mund te perdoret vetem te radiobutonat, checkbox, ose opsionet ne menu. jo te butonat.
			/*if(b1.isSelected()) {
				count1++;
				label1.setText("Jam klikuar "+count1+" here");
			}else if(b2.isSelected()) {
				count2++;
				label2.setText("Jam klikuar "+count2+" here");
			}*/
			
		}
		
	}
	
	public void createComponents() {
		panel = new JPanel();
		label1 = new JLabel("Jam klikuar 0 here");
		label2 = new JLabel("Jam klikuar 0 here");
		b1 = new JButton("Butoni 1");
		b2= new JButton("Butoni 2");
		ActionListener listener = new NumerKlikimesh();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		
		panel.add(b1);
		panel.add(b2);
		add(panel);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Pick a color"));
		add(panel, BorderLayout.CENTER);
		
	}
}
