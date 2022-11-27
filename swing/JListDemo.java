package swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo extends JFrame implements ListSelectionListener {

    String[] cities = {"Dhangadhi", "Mahendranager", "Pokhara", "Kathmandu", "Butwal", "Hetauda", "Biratnagar"};
    JList<String> jl = new JList<String>(cities);

    public void makeUi() {




        setLayout(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void valueChanged(ListSelectionEvent e) {

    }
}
