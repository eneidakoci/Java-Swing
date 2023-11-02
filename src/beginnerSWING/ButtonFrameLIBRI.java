package beginnerSWING;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ButtonFrameLIBRI extends JFrame{
	private JButton button;
	private JLabel label;
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	
	
	public ButtonFrameLIBRI() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		createComponents();
	}
	
	/*Klase e brendshme qe do ndryshoje tekstin e vendosur ne label.*/
	class ClickListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			label.setText("Une u klikova!");
		}
	}
	
	public void createComponents() {
		button = new JButton("Me kliko!");
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		
		label = new JLabel("Hello, World!");
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		add(panel);
	}
}
