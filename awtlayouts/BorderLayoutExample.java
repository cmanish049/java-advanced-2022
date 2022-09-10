package awtlayouts;
import java.awt.*;
public class BorderLayoutExample {
    Frame f;
    BorderLayoutExample()
    {
        f = new Frame();

        // creating buttons
        Button b1 = new Button("NORTH");; // the button will be labeled as NORTH
        Button b2 = new Button("SOUTH");; // the button will be labeled as SOUTH
        Button b3 = new Button("EAST");; // the button will be labeled as EAST
        Button b4 = new Button("WEST");; // the button will be labeled as WEST
        Button b5 = new Button("CENTER");; // the button will be labeled as CENTER

        f.setLayout(new BorderLayout());
        f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction
        f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction
        f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction
        f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction
        f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center

        f.setSize(300, 300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
