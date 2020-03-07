package chapter27;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * В это программе демонстрируется
 * применение внеэкранного буфера изображений изображений.
 *
 * @author Ломовской К.Ю.
 * @since 07.03.2020
 */
public class DoubleBuffer extends Frame {
    int gap = 3;
    int mx, my;
    boolean flicker = true;
    Image buffer = null;
    int w = 1000, h = 1000;

    public DoubleBuffer(){

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                mx = me.getX();
                my = me.getY();
                flicker = false;
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                mx = me.getX();
                my = me.getY();
                flicker = true;
                repaint();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g){
        Graphics screengc = null;

        if (!flicker){
            screengc = g;
            g = buffer.getGraphics();
        }

        g.setColor(Color.blue);
        g.fillRect(0, 0, w, h);

        g.setColor(Color.red);
        for (int i = 0; i < w; i += gap)
            g.drawLine(i, 0, w - i, h);
        for (int i = 0; i < h; i += gap)
            g.drawLine(0, i, w, h - i);

        g.setColor(Color.black);
        g.drawString("Press mouse button to double buffer", 10, h / 2);
        g.setColor(Color.yellow);
        g.fillOval(mx - gap, my - gap, gap * 2 + 1, gap * 2 + 1);

        if (!flicker){
            screengc.drawImage(buffer, 0, 0, null);
        }
    }

    @Override
    public void update(Graphics g){
        paint(g);
    }

    public static void main(String[] args) {
        DoubleBuffer appWin = new DoubleBuffer();
        appWin.setSize(new Dimension(1000, 1000));
        appWin.setTitle("DoubleBuffer");
        appWin.setVisible(true);
    }
}
