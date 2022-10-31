package swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class JToggleButtonExample extends JFrame implements ItemListener {
    public static void main(String[] args) {
        new JToggleButtonExample();
    }
    private JToggleButton button;
    JToggleButtonExample() {
        setTitle("JToggleButton with ItemListener Example");
        button = new JToggleButton("ON");
        add(button);
        button.setBounds(50, 50, 80, 40);
        button.addItemListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent eve) {
        if (button.isSelected())
            button.setText("OFF");
        else
            button.setText("ON");
    }
}