package drawing2d;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
	
	MyPanel(){
		this.setPreferredSize(new Dimension(500,500));//libraria awt
	}
	
	public void paint(Graphics g) {
		//Graphics2D eshte me i avancuar, ndaj:
		Graphics2D g2D = (Graphics2D) g;
		g2D.setPaint(Color.BLACK);
		g2D.setStroke(new BasicStroke(5));
		g2D.fillRect(2,2,300, 20);
		
		//drejtkendeshi 2
		Graphics2D g2D2 = (Graphics2D) g;
		g2D2.setPaint(Color.BLACK);
		g2D2.setStroke(new BasicStroke(5));
		g2D2.fillRect(2,30,100, 20);
		
		//3
		Graphics2D g2D3 = (Graphics2D) g;
		g2D3.setPaint(Color.BLACK);
		g2D3.setStroke(new BasicStroke(5));
		g2D3.fillRect(2,60,400, 20);
	}
}
