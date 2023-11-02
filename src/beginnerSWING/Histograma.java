package beginnerSWING;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*Paraqisni një histogramë në një sipërfaqe teksti të vendosur në qendër të dritares duke
përdorur vlerat e numrave të plotë që vendosen nga përdoruesi në një fushë teksti. Vlerat
paraqesin notat e marra në provim nga nxënësit, prandaj vlerat duhet të jenë numra të plotë
ndërmjet 0 dhe 10. Kur përdoruesi të klikojë në një buton shto të vendosur pranë fushës së
tekstit, të shtohet një rresht tek sipërfaqja e tekstit që paraqet vlerën e numrit
Për shembull: nëse vlerat janë 10,7,3 atëhere paraqitet histograma e mëposhtme në sipërfaqen e
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
