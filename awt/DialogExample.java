package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExample extends Frame {
    DialogExample() {
        Dialog d = new Dialog(this, "Dialog", true);

        Button b = new Button("Open Dialog");
        b.setBounds(40, 40, 100, 32);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setVisible(true);
            }
        });
        add(b);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogExample();
    }
}
