package seminar5;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

//1. Ndërtoni një aplikacion grafik me tre radio butona, me emërtimet “E kuqe”,”Jeshile” dhe “Blu”
//në jug të dritares. Kur ndonjë nga radio butonat të shtypet, një panel i vendosur në qendër të
//dritares të ndryshojë me ngjyrën përkatëse të radio butonit të shtypur.


/*Kemi 2 panele. 1 qe eshte fillestar ku nuk ka ndryshuar gje, dhe i dyti do jete ai finali ku afishohet pasi te shtypet nje buton*/

@SuppressWarnings("serial")
public class RadioButtons extends JFrame {
	private static final int FRAME_WIDTH = 500;//deklaroj gjeresine dhe gjatesine e frame
	private static final int FRAME_HEIGHT = 300;
	
	//deklaroj komponentet qe dua ti shtoj ne dritare si variabla instance private
	private JPanel panel1;
	private JPanel panel2;
	private JRadioButton b1;
	private JRadioButton b2;
	private JRadioButton b3;
	private ButtonGroup bg;//nje buttongroup i cili do na sherbeje te shtojme butonat aty
	
	public RadioButtons() {  //konstruktori per t'i bere set size dritares dhe per te therritur metoden createComponents() ku krijuam
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
	}
	
	//klasa e brendshme ku implementojme actionlistener
	class NdryshoNgjyre implements ActionListener{ //kliko te emri i klases se brendshme per te override metoden e paimplementuar

		@Override
		public void actionPerformed(ActionEvent e) { //metoda actionPerformed ka nevoje per nje parameter ActionEvent 
			if(b1.isSelected()) {  ///kontrollojme veprimet
				panel1.setBackground(Color.RED);
			} else if(b2.isSelected()) {
				panel1.setBackground(Color.GREEN);
			}else if(b3.isSelected()) {
				panel1.setBackground(Color.BLUE);
			}
			
		}
		
	}
	
	public void createComponents() {
		panel1 = new JPanel();//krijojme 2 panelet
		panel2= new JPanel();
		b1 = new JRadioButton("E kuqe");//emertojme butonat
		/*ose:
		 * b1.setText("E kuqe")...
		 * 
		 * */
		b2 = new JRadioButton("Jeshile");
		b3 = new JRadioButton("Blu");
		
		//deklarojme nje ActionListener i cili do jete = new EmriIKlasesQeImplementoiActionListenerin
		ActionListener listener = new NdryshoNgjyre();
		//shtojme degjuesin (listener) tek cdo buton me ane te metodes addActionListener(listener). Ne kete menyre degjohet cdo click ne cdo buton
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		//deklaroj nje buttongroup, tek i cili shtojme butonat.
		//ButtonGroup perdoret per t'u siguruar qe eshte selektuar vetem nje radio buton.
		bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		panel2.add(b1);//nuk funxionon nqs i shtojme panelit buttongroup-in bg, por i shtojme nje nga nje ne panel
		panel2.add(b2);
		panel2.add(b3);
		
		//opsionale. Thjesht e ndan nga i gjithe paneli dhe i vendos nje titull
		panel2.setBorder(new TitledBorder(new EtchedBorder(), "Pick a color"));
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
	}

}
