package lab1;

import javax.swing.JOptionPane;

public class Ush3 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Pershendetje, ju lutem jepni moshen dhe gjatesine tuaj.");
		
		int mosha = Integer.parseInt(JOptionPane.showInputDialog(null, "Mosha:"));
		float gjatesia = Float.parseFloat(JOptionPane.showInputDialog(null, "Gjatesia (ne metra)"));
		float gjatesiaCM = gjatesia*100;
		
		JOptionPane.showConfirmDialog(null, "Konfirmo");
		JOptionPane.showMessageDialog(null, "Mosha juaj: "+mosha);
		JOptionPane.showMessageDialog(null, "Gjatesia juaj (në metra): "+gjatesia+"\n Gjatesia juaj (në cm): "+gjatesiaCM);
	}

}
