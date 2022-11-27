import java.awt.event.*;
import java.awt.*;

public class WindowEventDemo extends Frame {

    public void prepareWindow() {
        setTitle("Window event in AWT frame");
        setSize(400, 400);
        setVisible(true);
        MyHandler mh = new MyHandler();
        addWindowListener(mh);
    }

    public class MyHandler extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent we) {
            setVisible(false);
            dispose();
        }
    }

    public static void main(String[] args) {
        WindowEventDemo wad = new WindowEventDemo();
        wad.prepareWindow();
    }
}
