package LW_10;

import javax.swing.*;
import java.awt.*;

public class Q4 {
    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("GUI");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());

        JMenuBar mainMenuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        mainMenuBar.add(menuFile);

        JMenuItem menuOpen = new JMenuItem("Open");
        JMenuItem menuExit = new JMenuItem("Exit");

        menuFile.add(menuOpen);
        menuFile.add(menuExit);

        mainFrame.setJMenuBar(mainMenuBar);

        menuOpen.setEnabled(false);
        menuExit.addActionListener(e -> System.exit(0));

        String[][] tableData = {
                {"Amal", "CS/2022/020", "85"},
                {"Nimali", "ET/2022/014", "77"},
                {"Kamal", "CT/2022/011", "92"}
        };

        String[] tableColumns = {"Name", "ID", "Marks"};

        JTable studentTable = new JTable(tableData, tableColumns);
        studentTable.setDefaultEditor(Object.class, null);

        JScrollPane tableScrollPane = new JScrollPane(studentTable);
        mainFrame.add(tableScrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton btnSave = new JButton("Save");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");

        buttonPanel.add(btnSave);
        buttonPanel.add(btnUpdate);
        buttonPanel.add(btnDelete);

        buttonPanel.setBackground(Color.LIGHT_GRAY);

        mainFrame.add(buttonPanel, BorderLayout.SOUTH);

        mainFrame.setSize(500, 350);
        mainFrame.setVisible(true);
    }
}
