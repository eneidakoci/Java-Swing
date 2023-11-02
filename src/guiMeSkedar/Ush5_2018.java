package guiMeSkedar;
/*Ndertoni nje aplikacion qe lexon nje skedar (me ane te objektit te formuar nga klasa JFileChooser) kur klikohet nje buton i emertuar
 * "Hap Skedar". Ne nje komponent te tipit JTextArea shfaq te gjitha rreshtat te cilat permbajne nje fjale te caktuar qe percaktohet nga 
 * perdoruesi ne nje komponente JTextField ne kete dritare si dhe numrin e hereve qe eshte shfaqur kjo fjale.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Ush5_2018 extends JFrame{
	private JFileChooser fileChooser;
	private JPanel panel1;
	private JPanel panel2;
	private JTextArea area;
	private JButton button;
	private JTextField tf;
	private ArrayList<String> rreshtat;
	
	
	public Ush5_2018() {
		setSize(600,600);
		createComponents();
	}
	
	public void createComponents() {
		panel1 = new JPanel();
		panel2 = new JPanel();
		area = new JTextArea(50,50);
		button = new JButton("Hap Skedar");
		rreshtat = new ArrayList<>();
		tf = new JTextField();
		ActionListener l = new Degjo();
		button.addActionListener(l);
		panel1.add(tf);
		panel1.add(button);
		add(panel1, BorderLayout.NORTH);
		panel2.add(area);
		add(panel2, BorderLayout.CENTER);
		
	}
	
	public void lexoFjalet() throws FileNotFoundException {
		fileChooser = new JFileChooser();
		File path1 = null;
		if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			path1 = fileChooser.getSelectedFile();
		}
		Scanner in = new Scanner(path1);
		while(in.hasNextLine()) {
			rreshtat.add(in.nextLine());
		}
		in.close();
	}
	
	public class Degjo implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				lexoFjalet();
			}catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}
			String fjala = tf.getText();
			for(int i=0; i<rreshtat.size(); i++) {
				String s = rreshtat.get(i);
				int count=0;
				Scanner input = new Scanner(s);
				while(input.hasNext()) {
					if(fjala.equals(input.next()))
						count++;
				}
				if(count>0) {
					area.append(s+ " ndodhet "+count+" here");
				}input.close();
			}
			
		}
		
	}

}
