package seminar5;
/*2. Ndërtoni një aplikacion grafik me tre check boxe me emërtimet “E kuqe”,“Jeshile” dhe “Blu”
në jug të dritares. Kur ndonjë nga check box-et të shtypet, një panel i vendosur në qendër të
dritares të ndryshojë me ngjyrën e formuar nga kombinimet e check box-ave të shtypur.*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;


@SuppressWarnings("serial")
public class CheckBox extends JFrame {
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	
	private JPanel panel1;
	private JPanel panel2;
	private JCheckBox cb1;
	private JCheckBox cb2;
	private JCheckBox cb3;
	
	public CheckBox() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		createComponents();
	}
	
	class ChangeColor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (cb1.isSelected()) {
				panel1.setBackground(Color.RED);
			}if(cb2.isSelected()) {
				panel1.setBackground(Color.GREEN);
			}if(cb3.isSelected()) {
				panel1.setBackground(Color.BLUE);
			} if(cb1.isSelected() && cb2.isSelected()) {
				panel1.setBackground(new Color(255,255,0));
			}
			 if(cb1.isSelected() && cb3.isSelected()) {
				panel1.setBackground(new Color(255,0,255));
			}
			 if(cb2.isSelected() && cb3.isSelected()) {
				panel1.setBackground(new Color(0,255,255));
			} if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected()) {
				panel1.setBackground(new Color(255,255,255));
			}
		}
		
	}
	
	public void createComponents() {
		panel1 = new JPanel();
		panel2= new JPanel();
		
		cb1 = new JCheckBox("E kuqe");
		cb2 = new JCheckBox("Jeshile");
		cb3 = new JCheckBox("Blu");
		
		ActionListener listener = new ChangeColor();
		cb1.addActionListener(listener);
		cb2.addActionListener(listener);
		cb3.addActionListener(listener);
		
		panel2.add(cb1);
		panel2.add(cb2);
		panel2.add(cb3);
		
		panel2.setBorder(new TitledBorder(new EtchedBorder(), "Pick a color"));
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
	}
	
}
