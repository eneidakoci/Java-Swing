package tezaModel;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Ush3Rrethi extends JComponent {
    private Ellipse2D.Double circle;
    private final int x = 100;
    private final int y = 100;
    private int r = 50;
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        circle = new Ellipse2D.Double(x-r, y-r, 2*r, 2*r);
        g2.draw(circle);
    }

    public void expand(int rate) {
        this.r *= rate;
        repaint();
    }

    public void shrink(int rate) {
        this.r /= rate;
        repaint();
    }
}
