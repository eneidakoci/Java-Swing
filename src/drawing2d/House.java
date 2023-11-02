package drawing2d;

import java.awt.*;

import javax.swing.*;


// Program qe vizaton nje shtepi
public class House extends JComponent {	
	
	public void paint(Graphics g) {	
		
		//Background-i i shtepise
		g.setColor(Color.GREEN);
		g.fillRect(0,200,500,500);		
		
		
		//Oxhaku
		g.setColor(Color.BLACK);
		g.fillRect(120,65,10,45);
		
		//Tymi i oxhakut
		Color gri = new Color(107,107,107);
		g.setColor(gri);
		g.fillOval(105,65,10,10);
		g.fillOval(95,61,12,12);
		g.fillOval(85,57,14,14);
		g.fillOval(75,53,16,16);
		
		// Çatia
		Color kafe = new Color(165,42,42);
		g.setColor(kafe);
		g.setColor(kafe);
		int x[] = {110,170,240};
		int y[] = {110,60,110};
		Polygon poligon = new Polygon(x,y,3);
		g.fillPolygon(poligon);
		
		//Shtepia
		Color ngjyreQumeshti = new Color(222,184,135);
		g.setColor(ngjyreQumeshti);
		g.fillRect(110,110,130,130);
		
		//Dritaret
		g.setColor(Color.WHITE);
		g.fillRect(120,120,40,40);
		g.fillRect(180, 120, 40,40);
		
		// Dera
		g.setColor(Color.BLACK);
		g.fillRect(155,170,40,70);
		
		//Diell		
		g.setColor(Color.yellow);
		g.fillOval(240,30,50,50);
				
		
	}

	}

