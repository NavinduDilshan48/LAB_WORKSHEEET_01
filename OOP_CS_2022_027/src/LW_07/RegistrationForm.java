package LW_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
    private final String[] date = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private final String[] month = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
    private final String[] year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015"};
    private JTextField nameField;
    private JTextField mobileField;
    private JRadioButton maleButton;
    private JRadioButton femaleButton;
    private JComboBox dateBox;
    private JComboBox monthBox;
    private JComboBox yearBox;
    private JTextArea addressArea;
    private JCheckBox robot;
    private JTextArea outputForm;
    private JButton submit;
    private JButton reset;


    public RegistrationForm() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setBackground(Color.white);
        setBounds(100, 100, 760, 600);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        JLabel regForm = new JLabel("Registration Form");
        regForm.setFont(new Font("arial",Font.BOLD,26));
        regForm.setSize(400,30);
        regForm.setLocation(280,10);
        contentPane.add(regForm);

        JLabel regName = new JLabel("Name");
        regName.setFont(new Font("arial",Font.PLAIN,16));
        regName.setSize(120,25);
        regName.setLocation(50,80);
        contentPane.add(regName);

        nameField = new JTextField();
        nameField.setFont(new Font("arial",Font.PLAIN,16));
        nameField.setSize(200,25);
        nameField.setLocation(140,80);
        contentPane.add(nameField);

        JLabel regEmail = new JLabel("Email");
        regEmail.setFont(new Font("arial",Font.PLAIN,16));
        regEmail.setSize(120,25);
        regEmail.setLocation(50,125);
        contentPane.add(regEmail);

        mobileField = new JTextField();
        mobileField.setFont(new Font("arial",Font.PLAIN,16));
        mobileField.setSize(200,25);
        mobileField.setLocation(140,125);
        contentPane.add(mobileField);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("arial",Font.PLAIN,16));
        gender.setSize(120,25);
        gender.setLocation(50,170);
        contentPane.add(gender);

        maleButton = new JRadioButton("Male");
        maleButton.setFont(new Font("arial",Font.PLAIN,16));
        maleButton.setSize(80,25);
        maleButton.setLocation(140,170);
        contentPane.add(maleButton);

        femaleButton = new JRadioButton("Female");
        femaleButton.setFont(new Font("arial",Font.PLAIN,16));
        femaleButton.setSize(80,25);
        femaleButton.setLocation(220,170);
        contentPane.add(femaleButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JLabel DOB = new JLabel("DOB");
        DOB.setFont(new Font("arial",Font.PLAIN,16));
        DOB.setSize(120,25);
        DOB.setLocation(50,215);
        contentPane.add(DOB);

        dateBox = new JComboBox(date);
        dateBox.setFont(new Font("arial",Font.PLAIN,16));
        dateBox.setSize(50,25);
        dateBox.setLocation(140,215);
        contentPane.add(dateBox);

        monthBox = new JComboBox(month);
        monthBox.setFont(new Font("arial",Font.PLAIN,16));
        monthBox.setSize(90,25);
        monthBox.setLocation(190,215);
        contentPane.add(monthBox);

        yearBox = new JComboBox(year);
        yearBox.setFont(new Font("arial",Font.PLAIN,16));
        yearBox.setSize(70,25);
        yearBox.setLocation(280,215);
        contentPane.add(yearBox);

        JLabel addressForm = new JLabel("Address");
        addressForm.setFont(new Font("arial",Font.PLAIN,16));
        addressForm.setSize(120,25);
        addressForm.setLocation(50,260);
        contentPane.add(addressForm);

        addressArea = new JTextArea();
        addressArea.setFont(new Font("arial",Font.PLAIN,16));
        addressArea.setSize(200,100);
        addressArea.setLocation(140,260);
        addressArea.setLineWrap(true);
        contentPane.add(addressArea);

        robot = new JCheckBox("Accept Terms And Conditions.");
        robot.setFont(new Font("arial",Font.PLAIN,16));
        robot.setSize(250,25);
        robot.setLocation(120,380);
        contentPane.add(robot);

        outputForm = new JTextArea();
        outputForm.setFont(new Font("arial",Font.PLAIN,16));
        outputForm.setSize(260,400);
        outputForm.setLocation(420,80);
        outputForm.setLineWrap(true);
        contentPane.add(outputForm);

        submit = new JButton("Submit");
        submit.setFont(new Font("arial",Font.PLAIN,16));
        submit.setSize(90,25);
        submit.setLocation(140,440);
        submit.addActionListener(this);
        contentPane.add(submit);

        reset = new JButton("Reset");
        reset.setFont(new Font("arial",Font.PLAIN,16));
        reset.setSize(90,25);
        reset.setLocation(250,440);
        reset.addActionListener(this);
        contentPane.add(reset);
    }

    public void actionPerformed(ActionEvent e){
        String name = nameField.getText();
        String mobile = mobileField.getText();
        String genderSelect = "";

        if(maleButton.isSelected()){
            genderSelect = "Male";
        }else{
            genderSelect = "Female";
        }

        String DOBSelect = dateBox.getSelectedItem()+"/"+monthBox.getSelectedItem()+"/"+yearBox.getSelectedItem();
        String adress = addressArea.getText();

        String outputData = "Name : "+ name +"\nMobile : "+ mobile +"\nGender : "+ genderSelect +"\nDOB : "+ DOBSelect +"\nAdress : "+adress;

        JButton selectedButton = (JButton) e.getSource();
        if(selectedButton == submit){
            if(robot.isSelected()){
                System.out.println("Printing the details.");
                outputForm.setText(outputData);
            }else{
                JOptionPane.showMessageDialog(this,"Please accept the terms and conditions to submit");
            }
        }else if(selectedButton == reset){
            System.out.println("Reseting everything");
            nameField.setText("");
            mobileField.setText("");
            maleButton.setSelected(true);
            femaleButton.setSelected(true);
            dateBox.setSelectedIndex(0);
            yearBox.setSelectedIndex(0);
            monthBox.setSelectedIndex(0);
            addressArea.setText("");
            robot.setSelected(false);
            outputForm.setText("");
        }
    }
}

