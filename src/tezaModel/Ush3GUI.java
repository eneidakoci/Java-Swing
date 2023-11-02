package tezaModel;

import java.awt.*;
import javax.swing.*;

public class Ush3GUI extends JFrame {
    private int rate;
    private JPanel panel;
    private JRadioButton b1;
    private JRadioButton b2;
    private JButton b;
    private JLabel label;
    private ButtonGroup bg;
    private JTextField tf;

    public Ush3GUI() {
        setLayout(new BorderLayout());
        setSize(800,400);
        createComponents();
    }

	public void createComponents() {
		 panel = new JPanel();
         label = new JLabel("Numri i Hereve te Ndryshimit = ");

         tf = new JTextField();
        tf.setColumns(5);

         bg = new ButtonGroup();

         b1 = new JRadioButton("Zmadho");
         b2 = new JRadioButton("Zvogelo");

        bg.add(b1);
        bg.add(b2);

         b = new JButton("Rivizato");

         var CircleComponent = new Ush3Rrethi();

        b.addActionListener((e) -> {
            try {
                rate = Integer.parseInt(tf.getText());
            } catch (Exception exc) {
                System.out.println(exc.getLocalizedMessage());
                return;
            }

            if (b1.isSelected())
                CircleComponent.expand(rate);
            else if (b2.isSelected())
                CircleComponent.shrink(rate);
        });

        panel.add(label);
        panel.add(tf);
        panel.add(b1);
        panel.add(b2);

        panel.add(b);

        add(panel, BorderLayout.NORTH);
        add(CircleComponent, BorderLayout.CENTER);

        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
		
	}
}
