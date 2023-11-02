package lab8_9;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class Anagrama extends JFrame {
	private JTextField field1;
	private JTextField field2;
	private JPanel panel1;
	private JPanel panel2;
	private JButton button;
	private static final int FRAME_WIDTH = 850;
	private static final int FRAME_HEIGHT = 300;
	
    public Anagrama() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	class GjejAnagramat implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ArrayList<String> anagramat = new ArrayList<>();
			String input = field1.getText();
			String str = "";
			anagramat = gjej_anagramat(input);
			for(int i = 0; i<anagramat.size(); i++) {
				str += anagramat.get(i) + " ";
			}
			field2.setText(str);
			field2.setEditable(false);
			
		}
		
	}
	//MERR GJITHE ANAGRAMAT E FJALES
		public ArrayList<String> gjej_anagramat(String fjala) {
			ArrayList<String> rezultati = new ArrayList<>();
			
			if(fjala.length() == 0) {
				rezultati.add(fjala);//Stringu bosh ka vetem nje anagrame-veten
				return rezultati;
			} else {
				//Kalojme te cdo pozicion karakteri
				for(int i=0; i<fjala.length(); i++) {
					//Krijoj nje string me te vogel duke hequr karakterin e i-te
					String shorter = fjala.substring(0,i) + fjala.substring(i+1);
					
					//Gjej te gjithe anagramat e fjales se thjeshtuar(shkurtuar)
					ArrayList<String> anagrama_me_e_shkurter = gjej_anagramat(shorter);
					
					//Shtoj karakterin e hequr ne fillim te cdo anagrame se fjales se thjeshtuar (ne menyre qe mos te kete perseritje)
					for(String s : anagrama_me_e_shkurter) {
						if(!rezultati.contains(fjala.charAt(i) + s)) {
							rezultati.add(fjala.charAt(i) + s);
						}
					}
				}
				return rezultati;//kthejme gjithe anagramat
			}
		}
	public void createComponents() {
		field1 = new JTextField(10);
		field2 = new JTextField(80);
		panel1 = new JPanel();
		panel2 = new JPanel();
		button = new JButton("Gjej anagramat");
		ActionListener listener = new GjejAnagramat();
		button.addActionListener(listener);
		panel1.add(field1);
		panel1.add(button);
		panel2.add(field2);
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.CENTER);
		
	}
}
