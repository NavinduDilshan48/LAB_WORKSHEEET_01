package LW_10;

import javax.swing.*;
import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        String[][] data = {
                {"Amal", "CS/2022/020", "85"},
                {"Nimali", "ET/2022/014", "77"},
                {"Kamal", "CT/2022/011", "92"}
        };

        String[] columnNames = {"Name", "ID", "Marks"};


        JTable table = new JTable(data, columnNames);


        table.setDefaultEditor(Object.class, null);


        JScrollPane scrollPane = new JScrollPane(table);


        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(500, 400);
        frame.setVisible(true);
    }

}