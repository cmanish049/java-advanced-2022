/*
 * This Program shows example of how we implement key listener
 * uses Applet to demonstrate
 */
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class KeyEventDemo extends Applet implements KeyListener {

    String message = "";

    public void init() {
        addKeyListener(this); // this registers KeyListener to KeyEventDemo Applet class
    }

    public void keyTyped(KeyEvent e) {
        showStatus("Key Typed");
        message = message + e.getKeyChar();
        repaint(); // repaints the component (i.e. applet in this example) on each key typed event triggered
    }

    public void keyPressed(KeyEvent e) {
        showStatus("Key Pressed"); // shows them text in status bar of applet        
    }

    public void keyReleased(KeyEvent e) {
        showStatus("Ley Released");
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 50);
    }
}

/*
 <applet code="KeyEventDemo" height="400" width="400" ></applet>
 */