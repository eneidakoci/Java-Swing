package seminar5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*Nd�rtoni nj� program q� k�rkon nga p�rdoruesi t� fus� nj� num�r t� plot� n� nj� fush� teksti.
Kur t� klikohet nj� buton Vizato, t� vizatohen aq drejtk�nd�sha n� pozicione random sa �sht�
k�rkuar nga p�rdoruesi.*/

public class Drejtkendesh extends JFrame{
	private JPanel panel;
	private JButton b;
	private JTextField input;

	public Drejtkendesh() {
		setSize(500,300);
		createComponents();
		setVisible(true);
	}
	class NdryshoVizatim implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int size = Integer.parseInt(input.getText());
			for(int i=0; i<size; i++) {
				JComponent rectangle = new Vizato();
				add(rectangle);
				
			}
			
		}
		
	}
	
	public void createComponents() {
		panel = new JPanel();
		input = new JTextField(20);
		panel.add(input);
		b = new JButton("Vizato");
		
		ActionListener listener = new NdryshoVizatim();
		b.addActionListener(listener);
		
		panel.add(b);
		
	
	}
	public static void main(String[] args) {
		new Drejtkendesh();
		
	}
			
	
}
