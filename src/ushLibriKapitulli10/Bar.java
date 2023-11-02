package ushLibriKapitulli10;
import java.awt.Color;
import java.awt.Graphics;

//Bar of a bar chart
public class Bar {
	private String label;
	private double value;
	
	public static final int HEIGHT = 15;
	//Krijon nje bar me vleren dhe label-in e dhene
	
	public Bar(String aLabel, double aValue) {
		label = aLabel;
		value = aValue;
	}
	
	//Vizaton bar-in
	public void draw(Graphics g, int y, double scale) {
		final int GAP = 2;
		g.fillRect(0, y, (int) (value * scale), HEIGHT);
		g.setColor(Color.WHITE);
		g.drawString(label, GAP, y+HEIGHT-GAP);
		g.setColor(Color.BLACK);
	}

}
