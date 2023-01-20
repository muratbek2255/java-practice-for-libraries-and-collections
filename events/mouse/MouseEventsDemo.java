package mouse;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX = 0, mouseY = 0;

    public MouseEventsDemo () {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    public void mouseClicked(MouseEvent me) {
        msg = msg + "-- click received";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse entered";
        repaint();
    }

    public void  mouseExited(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse exited";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button down";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button Released";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*" + " mouse at " + mouseX + " , " + me.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        msg = "Moving mouse at " + me.getX() + " , " + me.getY();
    }

    public void paint(Graphics b) {
        b.drawString(msg, mouseX, mouseY);
    }

    public static void main(String[] args) {
        MouseEventsDemo appwin = new MouseEventsDemo();

        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("MouseEvents");
        appwin.setVisible(true);
    }
}


class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent  we) {
        System.exit(0);
    }
}
