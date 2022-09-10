package awt;

import java.awt.*;
import java.awt.event.*;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f = new Frame();  
        f.setTitle("Frame Demo");

        Label firstNameLabel = new Label("First Name");
        firstNameLabel.setBounds(20, 40, 100, 32);
        f.add(firstNameLabel);

        TextField firstNameTextField = new TextField();
        firstNameTextField.setBounds(120, 40, 200, 32);
        f.add(firstNameTextField);
        
        Label lastNameLabel = new Label("Last Name");
        lastNameLabel.setBounds(20, 80, 100, 32);
        f.add(lastNameLabel);

        TextField lastNameTextField = new TextField();
        lastNameTextField.setBounds(120, 80, 200, 32);
        f.add(lastNameTextField);

        Label emailLabel = new Label("Email");
        emailLabel.setBounds(20, 120, 100, 32);
        f.add(emailLabel);

        TextField emailTextField = new TextField();
        emailTextField.setBounds(120, 120, 200, 32);
        f.add(emailTextField);

        Checkbox javaCheckbox = new Checkbox("Java");
        javaCheckbox.setBounds(20, 160, 100, 32);
        f.add(javaCheckbox);

        Checkbox phpCheckbox = new Checkbox("PHP");
        phpCheckbox.setBounds(120, 160, 100, 32);
        f.add(phpCheckbox);

        Label genderLabel = new Label("Gender");
        genderLabel.setBounds(20, 200, 100, 32);
        f.add(genderLabel);

        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", checkboxGroup, false);
        maleCheckbox.setBounds(20, 240, 100, 32);
        f.add(maleCheckbox);

        Checkbox femaleCheckbox = new Checkbox("Female", checkboxGroup, false);
        femaleCheckbox.setBounds(120, 240, 100, 32);
        f.add(femaleCheckbox);

        Choice provinceChoice = new Choice();
        provinceChoice.setBounds(20, 280, 160, 32);
        provinceChoice.add("Province 1");
        provinceChoice.add("Province 2");
        provinceChoice.add("Province 3");
        provinceChoice.add("Province 4");
        provinceChoice.add("Province 5");
        provinceChoice.add("Province 6");
        provinceChoice.add("Province 7");
        provinceChoice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String selectedProvince = provinceChoice.getSelectedItem();
                System.out.println(selectedProvince);
            }
        });
        f.add(provinceChoice);

        List studentList = new List(2, true);
        studentList.add("John");
        studentList.add("Jane");
        studentList.add("Jack");
        studentList.add("Doe");
        studentList.setBounds(20, 320, 160, 64);
        f.add(studentList);

        Button btnSave = new Button();
        btnSave.setLabel("Save");
        btnSave.setBounds(20, 440, 100, 32);
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save Button Clicked");
            }
        });
        f.add(btnSave);

        Button btnCancel = new Button();
        btnCancel.setLabel("Cancel");;
        btnCancel.setBounds(120, 440, 100, 32);
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cancel Button Clicked");
            }
        });
        f.add(btnCancel);

        f.setSize(600, 600);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.setVisible(false);
                f.dispose();
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}
