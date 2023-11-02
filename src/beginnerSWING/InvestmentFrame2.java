package beginnerSWING;
import javax.swing.*;
import java.awt.event.*;
public class InvestmentFrame2 extends JFrame{
	private static final int FRAME_WIDTH = 450;
	private static final int FRAME_HEIGHT = 100;
	
	private static final double DEFAULT_RATE = 5;
	private static final double INITIAL_BALANCE = 1000;
	
	private JLabel rateLabel;
	private JTextField rateField;
	private JButton button;
	private JLabel resultLabel;
	private double balance;
	
	public InvestmentFrame2() {
		balance = INITIAL_BALANCE;
		resultLabel = new JLabel("Balance: " + balance);
		createTextField();
		createButton();
		createPanel();
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
	}
	
	private void createTextField() {
		rateLabel = new JLabel("Interest Rate: ");
		
		final int FIELD_WIDTH = 10; //fusha e tekstit do jete e dukshme per 10 karaktere.
		rateField = new JTextField(FIELD_WIDTH);
		rateField.setText(" "+DEFAULT_RATE);
	}
	
	//klasa e brendshme shton interesin te balanca dhe updates rezultatin
	class AddInterestListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			double rate = Double.parseDouble(rateField.getText());//merr tekstin nga perdoruesi si string me metoden getText dhe e kthen ne lf
			double interest = balance * rate / 100;
			balance = balance + interest;
			resultLabel.setText("Balance: "+balance);
		}
	}
	
	private void createButton() {
		button = new JButton("Add interest");
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
	}
	private void createPanel() {
		JPanel panel = new JPanel();
		panel.add(rateLabel);
		panel.add(rateField);
		panel.add(button);
		panel.add(resultLabel);
		add(panel);
	}

	
	
	
	
}
