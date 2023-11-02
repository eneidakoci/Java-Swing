package beginnerSWING;
import javax.swing.*;

@SuppressWarnings("serial")//qe mos te dale warning tek emri i klases
public class Shembull2Libri extends JFrame {
	//komponentet qe duam te shtojme ne frame i japim si variabla instance
	private JLabel label;
	private JButton button;
	
	
	//gjithashtu japim size-in e frame-it, te cilin do i bejme set brenda konstruktorit
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 100;
	
	//krijojme konstruktorin e klases, ku do i bejme set size frame dhe do therrasim nje metode ndihmese
	//me emrin createComponents() (metoda mund te kete cfaredolloj emri). 
	//Jashte konstruktorit krijojme metoden createComponents() dhe aty do krijojme butonin, labelin dhe do i shtojme ne panel me pas shtohet paneli.
	
	public Shembull2Libri() {
		createComponents();
		
		//nuk kemi nevoje te japim frame.setSize() por vetem setSize() mqs i kemi bere extend JFrame-it
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public void createComponents() {
		button = new JButton("Me kliko!");
		label = new JLabel ("Ky eshte nje label. ");
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		add(panel);
	}

}
