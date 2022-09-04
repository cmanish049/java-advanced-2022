import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAdapterExample  extends Applet {
    String message= "";
    public void init()
    {
        addMouseListener(new MouseHandler());
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 50);
    }

    public class MouseHandler extends MouseAdapter {
        public void mouseEntered(MouseEvent e) {
            message = "Mouse Entered";
            showStatus("Mouse Entered");
            repaint();
        }
        public void mouseClicked(MouseEvent e) {
            message = "Mouse Clicked";
            showStatus("Mouse Clicked");
            repaint();
        }

        public void mousePressed(MouseEvent e) {
            message = "Mouse Pressed";
            showStatus("Mouse Pressed");
            repaint();
        }
    }
}
/*
 <applet code="MouseListenerAdapterExample" width="400" height="400"></applet>
 */