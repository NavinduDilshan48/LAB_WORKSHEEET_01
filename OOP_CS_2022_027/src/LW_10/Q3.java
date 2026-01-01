package LW_10;

import javax.swing.*;
import java.awt.*;

public class Q3 extends JFrame {

    public Q3() {

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btnSave = new JButton("Save");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");

        panel.add(btnSave);
        panel.add(btnUpdate);
        panel.add(btnDelete);

        panel.setBackground(Color.LIGHT_GRAY);

        add(panel);

        setTitle("JPanel Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3();
    }
}

