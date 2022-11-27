package swing;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingFrameDemo extends JFrame implements ActionListener, CaretListener {
    JLabel label;
    ImageIcon imageIcon;
    JTextField textField;
    public void makeFrame() {
//        imageIcon = new ImageIcon("/Users/manish/Desktop/images/react.png");
//        label = new JLabel("Name", imageIcon, JLabel.CENTER);
//        label.setIcon(imageIcon);
//        add(label);
        textField = new JTextField();
        textField.setBounds(20, 20, 200, 20);
        textField.addActionListener(this);
        textField.addCaretListener(this);
        add(textField);
        setTitle("Swing Frame Demo");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        SwingFrameDemo swingFrameDemo = new SwingFrameDemo();
        swingFrameDemo.makeFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("enter pressed");
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        System.out.println("cared updated");
    }
}
