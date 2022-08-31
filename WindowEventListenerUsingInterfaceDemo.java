import java.awt.event.*;
import java.awt.Frame;

public class WindowEventListenerUsingInterfaceDemo implements WindowListener {

    public Frame f;
    
    public static void main(String[] args) {
        WindowEventListenerUsingInterfaceDemo weld = new WindowEventListenerUsingInterfaceDemo();
        weld.prepareWindow();
    }
    
    private void prepareWindow() {
        f = new Frame();
        f.setSize(400, 400);
        f.addWindowListener(this); // I missed this in class, this is an important code, always rememeber to write this line, It registers the listener to the component or class itself.
        f.setVisible(true);
    }
    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        f.setVisible(false);
        f.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
