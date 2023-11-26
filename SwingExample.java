import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample extends JFrame {

    private JTextField firstNameField, lastNameField, ageField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup genderGroup;

    public SwingExample() {

        setTitle("Swing Shoib");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel genderLabel = new JLabel("Gender:");


        firstNameField = new JTextField();
        lastNameField = new JTextField();
        ageField = new JTextField();


        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);


        JButton saveButton = new JButton("Save");
        JButton resaveButton = new JButton("Resave");


        firstNameLabel.setBounds(20, 20, 80, 25);
        firstNameField.setBounds(120, 20, 200, 25);
        lastNameLabel.setBounds(20, 50, 80, 25);
        lastNameField.setBounds(120, 50, 200, 25);
        ageLabel.setBounds(20, 80, 80, 25);
        ageField.setBounds(120, 80, 200, 25);
        genderLabel.setBounds(20, 110, 80, 25);
        maleRadioButton.setBounds(120, 110, 80, 25);
        femaleRadioButton.setBounds(200, 110, 100, 25);
        saveButton.setBounds(120, 140, 80, 25);
        resaveButton.setBounds(220, 140, 80, 25);


        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(ageLabel);
        add(ageField);
        add(genderLabel);
        add(maleRadioButton);
        add(femaleRadioButton);
        add(saveButton);
        add(resaveButton);


        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                saveData();
            }
        });

        resaveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resaveData();
            }
        });


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(saveMenuItem);

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);

        JMenuItem resaveMenuItem = new JMenuItem("Resave");
        editMenu.add(resaveMenuItem);

        saveMenuItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                saveData();
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        resaveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resaveData();
            }
        });

        setVisible(true);
    }

    private void saveData() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String age = ageField.getText();
        String gender = maleRadioButton.isSelected() ? "Male" : "Female";

        System.out.println("Data saved: " + firstName + " " + lastName + ", Age: " + age + ", Gender: " + gender);
    }

    private void resaveData() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String age = ageField.getText();
        String gender = maleRadioButton.isSelected() ? "Male" : "Female";

        System.out.println("Data resaved: " + firstName + " " + lastName + ", Age: " + age + ", Gender: " + gender);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}
