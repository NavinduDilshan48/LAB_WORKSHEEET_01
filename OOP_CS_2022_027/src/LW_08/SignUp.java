package LW_08;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SignUp extends JFrame implements ActionListener {

    private final String[] date = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private final String[] month = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
    private final String[] year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015"};

    private final JTextField nameField;
    private final JTextField emailField;
    private final JTextField SIEMField;
    private final JPasswordField PWField;
    private final JPasswordField SIPWField;
    private final JComboBox dateBox;
    private final JComboBox monthBox;
    private final JComboBox yearBox;
    private final JRadioButton maleButton;
    private final JRadioButton femaleButton;
    private final JButton SUButton;
    private final JButton SIButton;
    private final JCheckBox robot;

    public SignUp() {

        setTitle("Registration Form");
        setBounds(520, 140, 400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Container container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.white);

        JLabel SUtitle = new JLabel("Sign Up");
        SUtitle.setFont(new Font("Arial", Font.BOLD, 20));
        SUtitle.setForeground(Color.blue);
        SUtitle.setSize(400, 30);
        SUtitle.setLocation(165, 10);
        container.add(SUtitle);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        nameLabel.setSize(100, 30);
        nameLabel.setLocation(20, 55);
        container.add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 16));
        nameField.setSize(200, 30);
        nameField.setLocation(150, 55);
        container.add(nameField);

        JLabel emaiLabel = new JLabel("Email");
        emaiLabel.setFont(new Font("Arial", Font.BOLD, 16));
        emaiLabel.setSize(100, 30);
        emaiLabel.setLocation(20, 100);
        container.add(emaiLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 16));
        emailField.setSize(200, 30);
        emailField.setLocation(150, 100);
        container.add(emailField);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 16));
        genderLabel.setSize(100, 30);
        genderLabel.setLocation(20, 145);
        container.add(genderLabel);

        maleButton = new JRadioButton("Male");
        maleButton.setFont(new Font("Arial", Font.BOLD, 16));
        maleButton.setBackground(Color.white);
        maleButton.setSelected(true);
        maleButton.setSize(75, 20);
        maleButton.setLocation(150, 150);
        container.add(maleButton);

        femaleButton = new JRadioButton("Female");
        femaleButton.setFont(new Font("Arial", Font.BOLD, 16));
        femaleButton.setBackground(Color.white);
        femaleButton.setSelected(false);
        femaleButton.setSize(85, 20);
        femaleButton.setLocation(250, 150);
        container.add(femaleButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JLabel birthDayLabel = new JLabel("Birthday");
        birthDayLabel.setFont(new Font("Arial", Font.BOLD, 16));
        birthDayLabel.setSize(100, 30);
        birthDayLabel.setLocation(20, 190);
        container.add(birthDayLabel);

        dateBox = new JComboBox(date);
        dateBox.setSize(50, 25);
        dateBox.setLocation(150, 190);
        container.add(dateBox);

        monthBox = new JComboBox(month);
        monthBox.setSize(100, 25);
        monthBox.setLocation(200, 190);
        container.add(monthBox);

        yearBox = new JComboBox(year);
        yearBox.setSize(60, 25);
        yearBox.setLocation(300, 190);
        container.add(yearBox);

        JLabel PWLabel = new JLabel("Password");
        PWLabel.setFont(new Font("Arial", Font.BOLD, 16));
        PWLabel.setSize(100, 30);
        PWLabel.setLocation(20, 235);
        container.add(PWLabel);

        PWField = new JPasswordField();
        PWField.setFont(new Font("Arial", Font.PLAIN, 16));
        PWField.setSize(200, 30);
        PWField.setLocation(150, 235);
        container.add(PWField);

        robot = new JCheckBox("I am not a robot.");
        robot.setFont(new Font("Arial", Font.PLAIN, 16));
        robot.setSize(250, 30);
        robot.setLocation(15, 280);
        robot.setBackground(Color.white);
        container.add(robot);

        SUButton = new JButton("Sign Up");
        SUButton.setFont(new Font("Arial", Font.BOLD, 16));
        SUButton.setBackground(Color.blue);
        SUButton.setForeground(Color.white);
        SUButton.setSize(350, 30);
        SUButton.setLocation(20, 325);
        SUButton.addActionListener(this);
        container.add(SUButton);

        JLabel SItitle = new JLabel("Sign In");
        SItitle.setFont(new Font("Arial", Font.BOLD, 20));
        SItitle.setForeground(Color.blue);
        SItitle.setSize(400, 30);
        SItitle.setLocation(165, 370);
        container.add(SItitle);

        JLabel SIEMLabel = new JLabel("Email");
        SIEMLabel.setFont(new Font("Arial", Font.BOLD, 16));
        SIEMLabel.setSize(100, 30);
        SIEMLabel.setLocation(20, 415);
        container.add(SIEMLabel);

        SIEMField = new JTextField();
        SIEMField.setSize(200, 30);
        SIEMField.setLocation(150, 415);
        container.add(SIEMField);

        JLabel SIPWLabel = new JLabel("Password");
        SIPWLabel.setFont(new Font("Arial", Font.BOLD, 16));
        SIPWLabel.setSize(100, 30);
        SIPWLabel.setLocation(20, 460);
        container.add(SIPWLabel);

        SIPWField = new JPasswordField();
        SIPWField.setSize(200, 30);
        SIPWField.setLocation(150, 460);
        container.add(SIPWField);

        SIButton = new JButton("Sign In");
        SIButton.setFont(new Font("Arial", Font.BOLD, 16));
        SIButton.setBackground(Color.blue);
        SIButton.setForeground(Color.white);
        SIButton.setSize(350, 30);
        SIButton.setLocation(20, 505);
        SIButton.addActionListener(this);
        container.add(SIButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == SUButton) {

            if (robot.isSelected()) {

                String nameq = nameField.getText();
                String emailq = emailField.getText();

                String genderq = maleButton.isSelected() ? "Male" : "Female";

                String dobq = dateBox.getSelectedItem() + "-" +
                        monthBox.getSelectedItem() + "-" +
                        yearBox.getSelectedItem();

                String passwordq = new String(PWField.getPassword());

                if(nameq.isEmpty() || emailq.isEmpty() || passwordq.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields!");
                }else{
                    JOptionPane.showMessageDialog(null, "Sign Up Successful!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please confirm that you are not a robot.");
            }

        } else if (e.getSource() == SIButton) {
            String signUpPassword = new String(PWField.getPassword());
            String email = SIEMField.getText();
            String password = new String(SIPWField.getPassword());
            if(email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields!");
            }else if(email.equals(emailField.getText()) && password.equals(signUpPassword) ) {
                JOptionPane.showMessageDialog(null, "Sign In Successful!");
            }else{
                JOptionPane.showMessageDialog(null, "Sign In Unsuccessful!");
            }
        }
    }
}

