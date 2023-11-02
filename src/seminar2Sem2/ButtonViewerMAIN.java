package seminar2Sem2;

import javax.swing.JFrame;

public class ButtonViewerMAIN {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		JFrame frame = new ButtonViewer();
		frame.setVisible(true);
		frame.setLocation(500,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

}
