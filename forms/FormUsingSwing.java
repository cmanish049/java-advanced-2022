package forms;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class FormUsingSwing implements ActionListener {
    JFrame jf;
    JRadioButton rb1,rb2, rb3; 
    JTextField jtf;
    JTextField tf,tf2,tf3,tf4,tf5;


    FormUsingSwing(){
        jf=new JFrame("Registration Form");

        JLabel l=new JLabel();
        l.setText("First Name");
        l.setBounds(10, 10, 100, 20);
        jf.add(l);

        tf=new JTextField();
        tf.setBounds(110, 10, 100, 20);
        jf.add(tf);

        JLabel l2=new JLabel();
        l2.setText("Last Name");
        l2.setBounds(10, 40, 100, 20);
        jf.add(l2);

        tf2=new JTextField();
        tf2.setBounds(110, 40, 100, 20);
        jf.add(tf2);

        JLabel l3=new JLabel();
        l3.setText("Email ");
        l3.setBounds(10, 70, 100, 20);
        jf.add(l3);

        tf3=new JTextField();
        tf3.setBounds(110, 70, 100, 20);
        jf.add(tf3);

        JLabel l4=new JLabel("Gender ");
        l4.setBounds(10, 100, 100, 20);
        jf.add(l4);

        rb1= new JRadioButton("Male");
        rb1.setBounds(110, 100, 100, 20);

        rb2= new JRadioButton("Female");
        rb2.setBounds(210, 100, 100, 20);
        
        ButtonGroup bg=new ButtonGroup();   
        bg.add(rb1); bg.add(rb2);
        jf.add(rb1);
        jf.add(rb2);

        JLabel l5=new JLabel("Provinces  ");
        l5.setBounds(10, 130, 100, 20);
        jf.add(l5);

        String[] provinces={"Province No. 1","madhesh Province","Bagmati province","Gandaki province","Lumbini Province","Karnali Province","SudurPaschim province"};
        JComboBox<String> jcb=new JComboBox<String>(provinces);
        jcb.setBounds(110, 130, 150, 20);
        jf.add(jcb);


        JLabel l6=new JLabel("District  ");
        l6.setBounds(10, 160, 100, 20);
        jf.add(l6);

        String[] district={"Kanchanpur","Kailali","Doti","Dadeldhura","Bajhang","Bajura","Baitadi","Darchula","Achham"};
        JComboBox<String> jcb2=new JComboBox<String>(district);
        jcb2.setBounds(110, 160, 150, 20);
        jf.add(jcb2);

        JLabel l7=new JLabel("City  ");
        l7.setBounds(10, 190, 100, 20);
        jf.add(l7);

        tf4=new JTextField();
        tf4.setBounds(110, 190, 100, 20);
        jf.add(tf4);


        JLabel l8=new JLabel("Password ");
        l8.setBounds(10, 220, 100, 20);
        jf.add(l8);

        tf5=new JTextField();
        tf5.setBounds(110, 220, 100, 20);
        jf.add(tf5);


        JButton jb1=new JButton("Register");
        jb1.setBounds(50, 270, 100, 20);
        jb1.addActionListener((ActionListener) this);
        jb1.setActionCommand("REGISTER");
        jf.add(jb1);

        JButton jb2=new JButton("Clear");
        jb2.setBounds(200, 270, 100, 20);
        jb2.addActionListener((ActionListener) this);
        jb2.setActionCommand("CLEAR");
        jf.add(jb2);


        jtf=new JTextField("Please enter full information.");
        jtf.setBounds(50, 300, 100, 50);
        jtf.setBackground(Color.GRAY);
        jf.add(jtf);




        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);

    }
    public static void main(String[] args) {

        FormUsingSwing fus=new FormUsingSwing();
    
    }
    String cmd;
    @Override
    public void actionPerformed(ActionEvent e) {
        cmd=e.getActionCommand();
        System.out.println(cmd);
        if(cmd=="REGISTER"){
            jtf.setText("WELCOME");
        }
        if(cmd=="CLEAR"){
            tf.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            jtf.setText("");
            jf.add(jtf);
        }

    }    



}
