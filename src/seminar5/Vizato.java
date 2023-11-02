package seminar5;
import java.awt.*;

import javax.swing.*;
public class Vizato extends JComponent {
	public static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.YELLOW);
		int x,y,w,h;
		x = (int) (Math.random()*301);
		y = (int) (Math.random()*301);
		w = (int) (Math.random()*301);
		h = (int) (Math.random()*301);
		
		g.fillRect(x,y,w,h);
	}
	
}
