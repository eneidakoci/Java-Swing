import javax.swing.*;
 
/**
 * SwingSearchSortJListExample.java
 * Launches the MainFrame in the Swing worker thread
 * @author www.codejava.net
 */
public class SwingSearchSortJListExample {
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}