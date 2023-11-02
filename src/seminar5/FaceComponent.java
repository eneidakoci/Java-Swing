package seminar5;
/*Ndërtoni një program që shfaq në dritare vizatimin e një fytyre si në figurën e mëposhtme.POker Face*/
import java.awt.*;

import javax.swing.*;
public class FaceComponent extends JComponent {

	public void paintComponent(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(35,35,50,50);//x,y,width,height
		g.setColor(Color.BLACK);
		g.fillOval(45,50,8,8);
		g.fillOval(65,50,8,8);
		g.setColor(Color.WHITE);
		g.fillOval(45,50,4,4);
		g.fillOval(64,50,4,4);
		g.setColor(Color.RED);
		g.drawLine(45,70,70,70);//x1,y1,x2,y2
		
//		g.fillOval(20,20,30,30);
//		g.setColor(Color.BLACK);
//		g.fillOval(26,26,6,6);
//		g.fillOval(36,26,6,6);
//		g.setColor(Color.WHITE);
//		g.fillOval(26,26,4,4);
//		g.fillOval(36,26,4,4);
//		g.setColor(Color.RED);
//		g.drawLine(26,40,42,40);
	}
}
