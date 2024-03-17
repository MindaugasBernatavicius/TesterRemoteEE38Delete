package cf.mindaugas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleDesktopApp extends JFrame implements KeyListener {
    private int circleX = 100;
    private int circleY = 100;
    private int circleSize = 50;

    public SimpleDesktopApp() {
        setTitle("Circle Mover");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(circleX, circleY, circleSize, circleSize);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_LEFT -> circleX -= 10;
            case KeyEvent.VK_RIGHT -> circleX += 10;
            case KeyEvent.VK_UP -> circleY -= 10;
            case KeyEvent.VK_DOWN -> circleY += 10;
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleDesktopApp::new);
    }
}