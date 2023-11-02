package drawing2d;
import javax.swing.*;

public class HouseMAIN{

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JComponent draw = new House();
		frame.add(draw);
		frame.setVisible(true);

	}

}
