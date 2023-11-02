package lab2;
/*1. LAB4 Krijoni nje frame qe permban nje input tekst, nje buton dhe nje JList. Ne klik te butonit Shto, ne Jlist do te shtohet teksti i
 * vendosur. Frame permban edhe nje buton Pastro*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Tekst1 extends JFrame{
private static final int FRAME_WIDTH = 500;
private static final int FRAME_HEIGHT = 300;

private JTextField field;
private JButton shto;
private JButton pastro;
private JLabel label;
private JPanel panel1;
private JPanel panel2;
private JList<String> list;
private DefaultListModel<String> l;

public Tekst1() {
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
	createComponents();
}

class ShtoTekst implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == shto) {
			l.addElement(field.getText());
		}
		if(e.getSource() == pastro) {
			DefaultListModel<String> lModel = (DefaultListModel<String>)list.getModel();
			lModel.removeAllElements();
			list.setModel(lModel);
		}
		
	}
	
}

public void createComponents() {
	shto = new JButton("Shto");
	pastro = new JButton("Pastro");
	label = new JLabel("Vendosni emrin");
	field = new JTextField(30);
	panel1 = new JPanel();
	panel2 = new JPanel();
	
	l = new DefaultListModel<>();
	list = new JList<String>(l);
	list.setBounds(50,50,80,80);
	
	ActionListener listener = new ShtoTekst();
	shto.addActionListener(listener);
	pastro.addActionListener(listener);
	panel1.add(label);
	panel1.add(field);
	panel1.add(shto);
	
	panel1.add(list);
	
	panel2.add(pastro);
	
	setLayout(new BorderLayout());
	panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
	add(panel1);
	//borderLayout pranon south,north,east,west
	//flowLayout right left
	add(panel2, BorderLayout.SOUTH);
	
}

}
