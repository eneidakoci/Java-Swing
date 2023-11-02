package beginnerSWING;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*Paraqisni nj� histogram� n� nj� sip�rfaqe teksti t� vendosur n� qend�r t� dritares duke
p�rdorur vlerat e numrave t� plot� q� vendosen nga p�rdoruesi n� nj� fush� teksti. Vlerat
paraqesin notat e marra n� provim nga nx�n�sit, prandaj vlerat duhet t� jen� numra t� plot�
nd�rmjet 0 dhe 10. Kur p�rdoruesi t� klikoj� n� nj� buton shto t� vendosur pran� fush�s s�
tekstit, t� shtohet nj� rresht tek sip�rfaqja e tekstit q� paraqet vler�n e numrit
P�r shembull: n�se vlerat jan� 10,7,3 at�here paraqitet histograma e m�poshtme n� sip�rfaqen e
tekstit:
**********
*******
***

*/
public class Histograma implements ActionListener{
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JButton b;
	private JTextField input;
	private JTextArea output;
	private String line = "";
	
	public Histograma() {
		frame = new JFrame();
		panel1 = new JPanel();
		frame.setLocation(500,300);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		input = new JTextField(20);
		panel1.add(input);
		b= new JButton("add");
		b.addActionListener(this);
		panel1.add(b);//te paneli i pare shtojme textField dhe butonin 
		panel2 = new JPanel();
		output = new JTextArea(20,20);//textarea do kete x=20, y=20
		output.setEditable(false);
		output.setText("Histograma shfaqet: ");
		panel2.add(output);
		frame.add(panel1 , BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			int size = Integer.parseInt(input.getText());
			if(size<1 || size>10) {
				line+=("Wrong input \n");
				output.setText(line);
				return;
			}
			for(int i = 0; i < size; i++) {
				line+="* ";
			}
			line += "\n";
			output.setText(line);
		}
		catch(NumberFormatException c){
			line += ("input i gabuar");
			output.setText(line);
		}
	}
	
	public static void main(String[] args) {
		new Histograma();
	}
	
	
}
