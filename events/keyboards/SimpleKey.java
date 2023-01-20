package keyboards;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleKey extends Frame implements KeyListener {
    String msg = "";
    String keyState = "";

    public SimpleKey() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    public void keyPressed (KeyEvent ke) {
        keyState = "key down";
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        keyState = "key up";
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
    }

    public static void main(String[] args) {
        SimpleKey simKey = new SimpleKey();

        simKey.setSize(new Dimension(200, 150));
        simKey.setTitle("Simple Key");
        simKey.setVisible(true);
    }
}


class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}