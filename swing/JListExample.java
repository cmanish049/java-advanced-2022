package swing;

import javax.swing.*;
import javax.swing.event.*;

public class JListExample implements ListSelectionListener {
    JFrame f = new JFrame("JList Demo");
    JList<String> jlst;
    JLabel l;
    JScrollPane p;
    //creating an array of cities
    String[] cities = {"Kathmandu", "Pokhara", "Hetauda", "Birgunj",
            "Dharan", "Biratnagar", "Butwal", "Dhangadhi", "Nepalgunj",
            "Damak", "Dharan", "Bharatpur", "Janakpur", "Itahari"};

    void makeGUI() {
        jlst = new JList<String>(cities);
        //setting the list selection mode
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //adding the list to scroll pane
        p = new JScrollPane(jlst);
        //setting size of scroll pane
        p.setSize(150, 200);
        //making label that displays the selection
        l = new JLabel("Choose a city");
        //adding selection listener for the list
        jlst.addListSelectionListener(this);
        //adding scroll pane and label to frame
        f.add(p);
        f.add(l);
        f.setSize(400, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //handling list selection event
    @Override
    public void valueChanged(ListSelectionEvent lse) {
        //get the index of the changed item
        int idx = jlst.getSelectedIndex();
        jlst.getSelectedValuesList();
        //display selection if item was selected
        if (idx != -1)
            l.setText("Current City : " + cities[idx]);
        else
            l.setText("Choose a city");
    }

    public static void main(String[] args) {
        JListExample jd = new JListExample();
        jd.makeGUI();
    }
}