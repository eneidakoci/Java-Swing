package ushLibriKapitulli10;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

//Komponente qe vizaton nje chart
public class ChartComponent extends JComponent{
	private ArrayList<Bar> bars;
	private double maxValue;
	
	public ChartComponent() {
		bars = new ArrayList<Bar>();
		maxValue = 1;
	}
	//appends a bar to this chart
	public void append(String label, double value) {
		bars.add(new Bar(label, value));
		if(value>maxValue) {
			maxValue = value;
		}
		repaint();
	}
	
	//heq bar-in e fundit nga chart-i
	public void removeLast() {
		int n = bars.size();
		if(n==0) {return;}
		bars.remove(n-1);
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		final int GAP = 5;
		int y = GAP;
		double scale = getWidth()/maxValue;
		for(Bar b : bars) {
			b.draw(g, y, scale);
			y = y+Bar.HEIGHT + GAP;
		}
	}
}
