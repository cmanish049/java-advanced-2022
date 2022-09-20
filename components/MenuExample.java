package components;

import java.awt.*;

public class MenuExample extends Frame {
    MenuExample() {
        MenuBar menuBar = new MenuBar();
        Menu facultyMenu = new Menu("Faculty");
        Menu scienceMenu = new Menu("Science");
        Menu managementMenu = new Menu("Management");
        MenuItem bbmMenuItem = new MenuItem("BBM");
        MenuItem bimMenuItem = new MenuItem("BIM");
        managementMenu.add(bbmMenuItem);
        managementMenu.add(bimMenuItem);
        facultyMenu.add(scienceMenu);
        facultyMenu.add(managementMenu);
        menuBar.add(facultyMenu);
        setMenuBar(menuBar);
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
