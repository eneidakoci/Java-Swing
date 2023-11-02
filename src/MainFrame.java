import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
 
 
/**
 * MainFrame.java
 * This is the main user interface of the application.
 * @author www.codejava.net
 */
public class MainFrame extends JFrame {
    protected JButton buttonAdd = new JButton("Add New Person");
    protected JButton buttonSearch = new JButton("Search Persons");
    protected JButton buttonSort = new JButton("Sort Persons");
 
    protected JList<Person> listPerson = new JList<>();
    protected CustomListModel<Person> listModel;
    protected java.util.List<Person> persons = new ArrayList<>();
 
    public MainFrame() {
        super("Swing Search & Sort Example");
 
        initComponents();
 
        setSize(600, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    protected void initComponents() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JPanel panelButton = new JPanel();
        panelButton.setLayout(new FlowLayout(FlowLayout.CENTER));
 
        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addPerson();
            }
        });
 
        buttonSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sortPersons();
            }
        });
 
        buttonSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                searchPersons();
            }
        });
 
        panelButton.add(buttonAdd);
        panelButton.add(buttonSearch);
        panelButton.add(buttonSort);
 
        add(panelButton);
 
        listPerson.setPreferredSize(new Dimension(400, 360));
 
        listModel = new CustomListModel<Person>(persons);
        listPerson.setModel(listModel);
 
        add(listPerson);
    }
 
    private void addPerson() {
        String personName = JOptionPane.showInputDialog(this, "Enter person name");
        if (personName != null) {
            listModel.addElement(new Person(personName));
        }
    }
 
    private void sortPersons() {
        Collections.sort(persons);
        listModel.fireDataChanged();
    }
 
    private void searchPersons() {
        String personName = JOptionPane.showInputDialog(this, "Enter person name to search for:");
 
        if (personName == null) {
            return;
        }
 
        Collections.sort(persons);
 
        int foundIndex = Collections.binarySearch(persons, new Person(personName));
 
        if (foundIndex >= 0) {
            listPerson.setSelectedIndex(foundIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Could not find the person " + personName);
        }
    }
}