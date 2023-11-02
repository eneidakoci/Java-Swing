package lab1;

import javax.swing.JOptionPane;

public class Ush4 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Pershendetje. Jepni permasat e drejtkendeshit.");
		int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Gjatesia :"));
		int width=Integer.parseInt(JOptionPane.showInputDialog(null, "Gjeresia:"));
		int sip = height * width;
		int perimetri = (2*height) + (2*width);
		
		JOptionPane.showConfirmDialog(null, "Konfirmo");
		JOptionPane.showMessageDialog(null, "Siperfaqja: "+sip+"cm^2");
		JOptionPane.showMessageDialog(null, "Perimetri: "+perimetri+"cm");

	}

}
