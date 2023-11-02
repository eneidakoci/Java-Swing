package drawing2d;

import javax.swing.*;
import java.awt.*;

public class Vizatim extends JFrame {
	VizatimPanel panel;
	Vizatim(){
		panel = new VizatimPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
