import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventWithAdapterInnerClassDemo {
    public Frame f;

    public void prepareWindow() {
        f = new Frame();
        f.setTitle("Frame Demo with Inner class Adapter");
        f.setSize(400, 400);
        MyHandler mh = new MyHandler();
        f.addWindowListener(mh);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        WindowEventWithAdapterInnerClassDemo wed = new WindowEventWithAdapterInnerClassDemo();
        wed.prepareWindow();
    }

    public class MyHandler extends WindowAdapter {

        public void windowClosing(WindowEvent e) {
            f.dispose();
        }

    }
}
