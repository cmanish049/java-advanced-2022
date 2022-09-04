import java.awt.event.WindowAdapter;
import java.awt.Frame;
import java.awt.event.WindowEvent;
public class WindowEventWithAdapterAnnonymousInnerClassDemo {
    public Frame f;

    public void prepareWindow() {
        f = new Frame();
        f.setTitle("Frame Demo with Inner class Adapter");
        f.setSize(400, 400);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.setVisible(true);
    }

    public static void main(String[] args) {
        WindowEventWithAdapterAnnonymousInnerClassDemo wed = new WindowEventWithAdapterAnnonymousInnerClassDemo();
        wed.prepareWindow();
    }
}
