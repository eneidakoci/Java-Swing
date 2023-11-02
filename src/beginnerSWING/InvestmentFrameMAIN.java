package beginnerSWING;
import javax.swing.*;
public class InvestmentFrameMAIN {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		JFrame frame = new InvestmentFrame();
		frame.setVisible(true);
		frame.setLocation(500,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

}
