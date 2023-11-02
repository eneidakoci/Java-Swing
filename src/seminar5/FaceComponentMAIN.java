package seminar5;
import javax.swing.*;
import java.awt.*;
public class FaceComponentMAIN {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setLocation(500,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JComponent face = new FaceComponent();
		frame.add(face);
	}

}
