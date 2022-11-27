package forms;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.*;

public class SwingForm extends JFrame implements ActionListener{
    JLabel fn, ln, email, city, pwd, gender;
    JTextField fnt, lnt, emailt, cityt, pwdt;
    JRadioButton m , f;
    JComboBox state, district;
    JButton save, clear;
    ButtonGroup bg;
    String[] states = {"Select State", "Province 1", "Madhesh_Province", "Bagmati_Province", "Gandaki_Province", "Lumbini_Province", "Karnali_Province", "Sudurpaschim_Province"};
    String[] province1 = {"Select District", "Bhojpur", "Dhankuta", "Ilam", "Jhapa", "Khotang", "Morang", "Okhaldhunga", "Panchthar", "Sankhuwasabha", "Solukhumbu", "Sunsari", "Taplejung", "Terhathum", "Udayapur"};
    String[] Madhesh_Province = {"Select District", "Parsa", "Bara", "Rautahat", "Saptari", "Siraha", "Dhanusa", "Mahottari", "Sarlahi"};
    String[] Bagmati_Province = {"Select District", "Bhaktapur", "Chitwan", "Dhading", "Dolakha", "Kathmandu", "Kavrepalanchok", "Lalitpur", "Makwanpur", "Nuwakot", "Ramechhap", "Rasuwa", "Sindhuli", "Sindhupalchok"};
    String[] Gandaki_Province = {"Select District", "Baglung", "Gorkha", "Kaski", "Lamjung", "Manang", "Mustang", "Myagdi", "Nawalparasi", "Parbat", "Syangja", "Tanahun"};
    String[] Lumbini_Province = {"Select District", "Arghakhanchi", "Banke", "Bardiya", "Dang", "Eastern_Rukum", "Gulmi", "Kapilvastu", "Parasi", "Palpa", "Pyuthan", "Rolpa", "Rupandehi", "Western_Rukum"};
    String[] Karnali_Province = {"Select District", "Dailekh", "Dolpa", "Humla", "Jajarkot", "Jumla", "Kalikot", "Mugu", "Salyan", "Surkhet", "Western_Salyan"};
    String[] Sudurpaschim_Province = {"Select District", "Achham", "Baitadi", "Bajhang", "Bajura", "Dadeldhura", "Darchula", "Doti", "Kailali", "Kanchanpur"};
    String[] empty = {"Select District"};
    SwingForm(){
        setComp();
        setCompLayout();
        setAction();
        setRadioButtons();
        setTitle("Registration Form");
        setLayout(null);
        setBounds(20, 20, 700,700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setComp(){
        fn= new JLabel("First Name");
        ln= new JLabel("Last Name");
        email= new JLabel("Email");
        city= new JLabel("City");
        pwd= new JLabel("Password");
        gender= new JLabel("Gender");
        fnt= new JTextField();
        lnt= new JTextField();
        emailt= new JTextField();
        cityt= new JTextField();
        pwdt= new JTextField();
        m= new JRadioButton("Male");
        f= new JRadioButton("Female");
        state= new JComboBox(states);
        district= new JComboBox(empty);
        save= new JButton("Save");
        clear= new JButton("Clear");
        bg= new ButtonGroup();
    }

    public void setCompLayout(){
        fn.setBounds(50, 50, 100, 30);
        ln.setBounds(50, 100, 100, 30);
        email.setBounds(50, 150, 100, 30);
        city.setBounds(50, 200, 100, 30);
        pwd.setBounds(50, 250, 100, 30);
        gender.setBounds(50, 300, 100, 30);
        fnt.setBounds(150, 50, 150, 30);
        lnt.setBounds(150, 100, 150, 30);
        emailt.setBounds(150, 150, 150, 30);
        cityt.setBounds(150, 200, 150, 30);
        pwdt.setBounds(150, 250, 150, 30);
        m.setBounds(150, 300, 100, 30);
        f.setBounds(250, 300, 100, 30);
        state.setBounds(50, 350, 100, 30);
        district.setBounds(150, 350, 100, 30);
        save.setBounds(50, 400, 100, 30);
        clear.setBounds(150, 400, 100, 30);
        add(fn);
        add(ln);
        add(email);
        add(city);
        add(pwd);
        add(fnt);
        add(lnt);
        add(emailt);
        add(cityt);
        add(pwdt);
        add(m);
        add(f);
        add(state);
        add(district);
        add(save);
        add(clear);
        add(gender);
    }
    public void setAction(){
        state.addActionListener(this);
        save.addActionListener(this);
        clear.addActionListener(this);
    }
    public void setRadioButtons(){
        bg.add(m);
        bg.add(f);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println(e.getSource() == state);
        if(e.getSource()==state){
            if(state.getSelectedItem().equals("Province 1")){
                System.out.println("here");
                for(int i=0; i<province1.length; i++){
                    district.addItem(province1[i]);
                }
            }
            else if(state.getSelectedItem().equals("Madhesh_Province")){
                for(int i=0; i<Madhesh_Province.length; i++){
                    district.addItem(Madhesh_Province[i]);
                }
            }
            else if(state.getSelectedItem().equals("Bagmati_Province")){
                for(int i=0; i<Bagmati_Province.length; i++){
                    district.addItem(Bagmati_Province[i]);
                }
            }
            else if(state.getSelectedItem().equals("Gandaki_Province")){
                for(int i=0; i<Gandaki_Province.length; i++){
                    district.addItem(Gandaki_Province[i]);
                }
            }
            else if(state.getSelectedItem().equals("Lumbini_Province")){
                for(int i=0; i<Lumbini_Province.length; i++){
                    district.addItem(Lumbini_Province[i]);
                }
            }
            else if(state.getSelectedItem().equals("Karnali_Province")){
                for(int i=0; i<Karnali_Province.length; i++){
                    district.addItem(Karnali_Province[i]);
                }
            }
            else if(state.getSelectedItem().equals("Sudurpaschim_Province")){
                System.out.println("sudurpaschim");
                for(int i=0; i<Sudurpaschim_Province.length; i++){
                    district.addItem(Sudurpaschim_Province[i]);
                }
            }
            else{
                district.removeAllItems();
                for(int i=0; i<empty.length; i++){
                    district.addItem(empty[i]);
                }
            }
        }
        else if(e.getSource()==save){
            System.out.println("Data you have Entered:");
            System.out.println(fnt.getText());
            System.out.println(lnt.getText());
            System.out.println(emailt.getText());
            System.out.println(cityt.getText());
            System.out.println(pwdt.getText());
            if(m.isSelected()){
                System.out.println(m.getText());
            }
            else if(f.isSelected()){
                System.out.println(f.getText());
            }
            System.out.println(state.getSelectedItem());
            System.out.println(district.getSelectedItem());

        }
        else if(e.getSource()==clear){
            fnt.setText("");
            lnt.setText("");
            emailt.setText("");
            cityt.setText("");
            pwdt.setText("");
            bg.clearSelection();
            state.setSelectedIndex(0);
            district.setSelectedIndex(0);
        }

    }
    public static void main(String args[]){
        new SwingForm();


    }
}