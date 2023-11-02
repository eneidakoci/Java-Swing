package beginnerSWING;

import javax.swing.JFrame;

public class ClickListenerMAIN {

	public static void main(String[] args) {
		JFrame frame = new ClickListener1();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocation(550,350);

	}

}
