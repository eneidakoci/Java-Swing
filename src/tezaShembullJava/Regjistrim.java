package tezaShembullJava;
/*Krijoni nj� program grafik q� b�n t� mundur regjistrimin e nj� p�rdoruesi n� sistem. P�rdoruesi
vendos emrin, mbiemrin n� dy fusha teksti, zgjedh gjinin� nga nj� kontroll radiobutoni, mosh�n nga nj�
kontroll slajderi. N� klikim t� nj� butoni Regjistrohu, t� gjenerohet nj� fjal�kalim p�r p�rdoruesin.
Fjal�kalimi do t� gjenerohet si: Shkronja e par� e emrit+ 0 n�se �sht� femer dhe 1 n�se �sht� mashkull, + nj�
num�r random nga 1 deri te mosha e tij. Ky fjal�kalim t� afishohet n� nj� Label me font BOLD.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Regjistrim extends JFrame {

	private JTextField emri;
	private JTextField mbiemri;
	private JRadioButton f;
	private JRadioButton m;
	private JSlider slider;
	private JLabel fjalekalim;
	private JPanel panel1;
	private JPanel panel2;
	private ButtonGroup bg;
	private JButton regjistrohu;
	private String var;
	private String shkronja;
	private Random rand;
	private int upperbound;
	private int random;

	private final int FRAME_WIDTH = 500;
	private final int FRAME_HEIGHT = 300;

	public Regjistrim() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}

	/*
	 * Shkronja e par� e emrit+ 0 n�se �sht� femer dhe 1 n�se �sht� mashkull, + nj�
	 * num�r random nga 1 deri te mosha e tij.
	 */
	class Fjalekalim implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String var = emri.getText().substring(0, 1);// qe te marre shkronjen e pare
			if (e.getSource() == regjistrohu) {
				if (f.isSelected()) {
					var += "0";// shkronjes se pare i shtohet 0 nqs eshte selektuar butoni f
				}
				if (m.isSelected()) {
					var += "1";// nqs eshte selektuar butoni m, i shtohet 1 variablit var
				}

			}
			int nr = slider.getValue();// marrim vleren e sliderit
			Random rand = new Random();
			// int upperbound = 25;//per vlera nga 0-24
			int random = rand.nextInt(nr + 1);// max i nr random do jete vlera e selektuar nga slideri

			var += random;

			Font font = new Font("Courier", Font.BOLD, 12);
			// fjalekalim.setFont(new Font("Courier", Font.BOLD,12));
			fjalekalim.setFont(font);
			fjalekalim.setText("Fjalekalimi:" + var);

		}

	}

	public void createComponents() {
		panel1 = new JPanel();
		panel2 = new JPanel();
		emri = new JTextField(20);// textfieldi merr 20 hapesira
		mbiemri = new JTextField(20);

		// var = emri.getText().toString();
		// shkronja=var.substring(0,1);//qe te afishohet shkronja e pare te fjalekalimi

		f = new JRadioButton("M");
		m = new JRadioButton("F");
		bg = new ButtonGroup();
		bg.add(f);
		bg.add(m);

		regjistrohu = new JButton("Regjistrohu");
		ActionListener listener = new Fjalekalim();
		regjistrohu.addActionListener(listener);

		fjalekalim = new JLabel("Fjalekalimi:");

		// slider.getValue() kthen vleren
		slider = new JSlider(10, 100, 45);// min,max,vlera default
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setPaintLabels(true);

		panel1.add(emri);
		panel1.add(mbiemri);
		panel1.add(slider);
		panel1.add(f);
		panel1.add(m);
		panel1.add(regjistrohu);
		panel2.add(fjalekalim);

		add(panel1);
		add(panel2, BorderLayout.SOUTH);
	}

}
