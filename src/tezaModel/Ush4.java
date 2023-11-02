package tezaModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.*;

public class Ush4 {
    private static void draw() {
        var frame = new JFrame();
        frame.setLayout(new BorderLayout());

        var topPanel = new JPanel();

        final FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Skedar Tekst (.txt)", "txt");

        final var fileChooser = new JFileChooser();
        fileChooser.setFileFilter(fileFilter);

        var fileBtn = new JButton("Selekto File");
        var fileNameLabel = new JLabel();

        var resultsTA = new JTextArea();
        resultsTA.setColumns(20);
        resultsTA.setRows(10);

        var scrollTA = new JScrollPane(resultsTA, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        fileBtn.addActionListener((e) -> {
            File f1, f2;

            fileChooser.setDialogTitle("Skedari i pare");
            int returnVal = fileChooser.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION)
                f1 = fileChooser.getSelectedFile();
            else
                return;

            fileChooser.setDialogTitle("Skedari i dyte");
            returnVal = fileChooser.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION)
                f2 = fileChooser.getSelectedFile();
            else
                return;

            fileNameLabel.setText("Skedari 1: " + f1.getName() + "  |  " + "Skedari 2: " + f2.getName());

            Scanner f1s, f2s;

            try {
                f1s = new Scanner(f1);
                f2s = new Scanner(f2);
            } catch (FileNotFoundException exc) {
                exc.printStackTrace();
                return;
            }

            String buffer, match;
            String[] line;
            int lineCnt = 0;

            while (f1s.hasNextLine() && f2s.hasNextLine()) {
                buffer = f1s.nextLine();
                line = buffer.split("\\s");
                buffer = f2s.nextLine();

                match = ++lineCnt + ":  ";

                for (int i = 0; i < line.length; i++) {
                    if (buffer.contains(line[i])) {
                        match += line[i] + "\t";
                    }
                }

                if (!match.equals(lineCnt + ":  "))
                    resultsTA.append(match + "\n");

            }

            f1s.close();
            f2s.close();
        });

        topPanel.add(fileBtn);
        topPanel.add(fileNameLabel);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollTA, BorderLayout.CENTER);

        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        draw();
    }
}
