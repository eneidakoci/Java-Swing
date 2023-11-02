package drawing2d;
import javax.swing.*;
import java.awt.*;

public class VizatimPanel extends JPanel {
	Image image;
	
	VizatimPanel(){
		image = new ImageIcon("sky.png").getImage();
		setPreferredSize(new Dimension(500,500));//libraria awt
	}
	public void paint(Graphics g2) {
		Graphics2D g = (Graphics2D) g2;
		g.drawImage(image, 0, 0, null);
	}
}
