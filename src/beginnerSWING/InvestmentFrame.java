package beginnerSWING;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class InvestmentFrame extends JFrame {
	private JButton button;
	private JLabel label;
	private double balanca;
	
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 200;
	
	private static final double PERQINDJA_E_INTERESIT = 5;
	private static final double BALANCA_FILLESTARE = 1000;
	
	public InvestmentFrame() {
		balanca = BALANCA_FILLESTARE;
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	//krijoj klasen e brendshme
	class AddInterestListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			double interesi = balanca * PERQINDJA_E_INTERESIT / 100;
			balanca = balanca + interesi;
			label.setText("Balanca: "+balanca);
		}
	}
	
	public void createComponents() {
		button = new JButton("Shto interesin!");
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
		
		label = new JLabel("Balanca fillestare: "+balanca);
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		add(panel);
	}
}
