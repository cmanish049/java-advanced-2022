import java.applet.Applet;
import java.awt.*;

public class AppletFrame extends Applet {
    Frame f;

    public void init() {
        f = new Frame("A Frame Window");
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public void start() {
        f.setVisible(true);
    }

    public void stop() {
        f.setVisible(false);
    }

    public void paint(Graphics g) {
        g.drawString("This is an applet Window", 25, 25);
    }
}

/* <applet code="AppletFrame" width="500" height="500"></applet> */