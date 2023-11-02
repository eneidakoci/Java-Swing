package beginnerSWING;
import javax.swing.*;
import java.awt.event.*;//java.awt.event.ActionListener;

public class ClickListener1 extends JFrame{
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	public ClickListener1() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		createComponents();
	}
	
	class ClickListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			System.out.println("Une u klikova");
		}
		
	}

	public void createComponents() {
		JButton button = new JButton("Click me!");
		JPanel panel = new JPanel();
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		
		
	}
}
