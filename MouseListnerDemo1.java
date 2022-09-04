/**
 * Program to demostrate MouseListener using applet
 */
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class MouseListnerDemo1 extends Applet implements MouseListener {
    
    String message= "";
    public void init()
    {
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        showStatus("Mouse Clicked");
        message = "Mouse Clicked";
        repaint();
    }

    public void mouseExited(MouseEvent e)
    {
        showStatus("Mouse Exited");
        message = "Mouse Exited";
        repaint();
    }
    public void mousePressed(MouseEvent e)
    {
        showStatus("Mouse Pressed");
        message = "Mouse Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {
        showStatus("Mouse Released");
        message = "Mouse Released";
        repaint();
    }
    public void mouseEntered(MouseEvent e)
    {
        showStatus("Mouse Entered");
        message = "Mouse Entered";
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(message, 50 ,50);
    }
}
/*<applet code="MouseListnerDemo1" height="400" width="400"></applet>
 */