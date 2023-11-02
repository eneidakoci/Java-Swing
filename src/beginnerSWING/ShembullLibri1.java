package beginnerSWING;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShembullLibri1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("FRAME BOSH");
		final int FRAME_WIDTH=400;
		final int FRAME_HEIGHT=300;
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setLocation(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//nqs duam te shtojme komponente te rinj, i shtojme ne nje panel dhe panelin e shtojme ne frame
		JPanel panel = new JPanel();
		JButton button = new JButton();
		button.setText("Ky eshte nje buton");
		//oseee JButton button = new JButton("Ky eshte buton");
		button.setBounds(10,10,120,120);
		JLabel label = new JLabel();
		label.setText("Ky eshte nje label");
		panel.add(label);
		panel.add(button);
		frame.add(panel);
	}

}
