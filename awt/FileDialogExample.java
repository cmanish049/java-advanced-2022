package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogExample extends Frame {

    FileDialogExample() {

        Button b  = new Button("Select File");
        b.setBounds(40, 40, 100, 32);
        add(b);
        FileDialog fileDialog = new FileDialog(this);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileDialog.setVisible(true);
            }
        });
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FileDialogExample();

    }
}
