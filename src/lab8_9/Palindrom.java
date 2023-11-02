package lab8_9;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Palindrom extends JFrame{
	private static final int FRAME_WIDTH = 700;
	private static final int FRAME_HEIGHT = 300;
	
	private JLabel inputLabel;
	private JLabel answerLabel;
	private JButton kontrollo;
	private JFrame frame;
	private JPanel panel;
	private JTextField inputField;
	private JTextField outputField;
	
	public Palindrom() {
		createComponents();
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		
	}

	class Kontrollo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			boolean rezultati;
			String input = inputField.getText();
			if(e.getSource() == kontrollo) {
			rezultati = isPalindrome(input);
			if(rezultati == true) {
				outputField.setText("Inputi eshte palindrom");
			}else{
				outputField.setText("Inputi eshte palindrom");
			}
			}
			
			
		}
		
	}
	
public boolean isPalindrome(String text){
	int length = text.length();
	//Nqs ka vetem nje shkronje do jete me patjeter palindrome
	if (length <= 1) 
		return true;
	
	else{
		// Marrim karakterin e pare dhe te fundit duke i kontrolluar te dyja ne lower case qe mos te kete ndryshime
		char c1 = Character.toLowerCase(text.charAt(0));
		char c2 = Character.toLowerCase(text.charAt(length - 1));
		if (Character.isLetter(c1) && Character.isLetter(c2)){// Nqs karakteri i pare dhe i fundit jane shkronja:
			if (c1 == c2){// Nqs shkronja e pare dhe e fundit jane te njejta
				String shorter = text.substring(1, length - 1);//nga karakteri i dyte deri te i parafundit
			return isPalindrome(shorter);//kthimi i funksionit rekursiv derisa mos te kete me shkronja te mbetura
			}
			else//nqs nuk plotesohet kushti kthejme false
			return false;
			
		}
		
		else if (!Character.isLetter(c2)){//nqs karakteri i fundit nuk eshte shkronje
		String shorter = text.substring(0, length - 1);//fshijme karakterin e fundit
		return isPalindrome(shorter);
		}
		else{
		//nqs karakteri i pare nuk eshte shkronje
		String shorter = text.substring(1);//nga 1 ne vazhdim
		return isPalindrome(shorter);
		}
	}
}
	
	//metoda e krijmit te pjeseve perberese te frame-it
	private void createComponents() {
		panel = new JPanel();
		inputLabel = new JLabel("Jepni nje fjale");
		answerLabel = new JLabel("");
		
		inputField = new JTextField(20);
		outputField = new JTextField(20);
		outputField.setEditable(false);
		
		kontrollo = new JButton("Kontrollo");
		
		ActionListener listener = new Kontrollo();
		kontrollo.addActionListener(listener);
		
		setLayout(new FlowLayout());
		panel.add(inputLabel);
		panel.add(inputField);
		panel.add(answerLabel);
		panel.add(outputField);
		panel.add(kontrollo);
		add(panel);
		
	}

}
