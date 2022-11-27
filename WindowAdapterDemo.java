
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;

public class WindowAdapterDemo {
    public Frame f;

    public void prepareWindow() {
        f = new Frame("Adapter demo");
        // f.setTitle("Adapter demo");
        f.setSize(400, 400);
        // MyHandler handler = new MyHandler();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.setVisible(false);
                f.dispose();
            }
        });
        f.setVisible(true);
    }

    public static void main(String[] args) {
        WindowAdapterDemo wad = new WindowAdapterDemo();
        wad.prepareWindow();
    }

    // public class MyHandler extends WindowAdapter {
    //     public void windowClosing(WindowEvent e) {
    //         f.setVisible(false);
    //         f.dispose();
    //     }
    // }
}
