package swing;

import javax.swing.*;

public class JTabbedPaneExample {
    JFrame f;
    JPanel p1, p2, p3;
    JLabel l1, l2, l3;

    void makeMyTabbedPane() {
        f = new JFrame("TabbedPane Example");

        //Creating Panels and adding labels to them
        p1 = new JPanel();
        l1 = new JLabel("Welcome to Dashboard");
        p1.add(l1);
        p2 = new JPanel();
        l2 = new JLabel("Your Profile");
        p2.add(l2);
        p3 = new JPanel();
        l3 = new JLabel("Help Section");
        p3.add(l3);
        //Creating JTabbedPane
        JTabbedPane tp = new JTabbedPane();
        //setting position
        tp.setBounds(50, 10, 400, 200);
        //adding components
        tp.add("Dashboard", p1);
        tp.add("Profile", p2);
        tp.add("Help", p3);
        //adding TabbedPane to frame
        f.add(tp);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JTabbedPaneExample tpd = new JTabbedPaneExample();
        tpd.makeMyTabbedPane();
    }
}