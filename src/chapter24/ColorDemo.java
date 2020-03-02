package chapter24;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * В это программе демонстрируется работа с цветом.
 *
 * @author Ломовской К.Ю.
 * @since 02.03.2020
 */
public class ColorDemo extends Frame {

    public ColorDemo(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {

        Color c1 = new Color(255, 100, 100);
        Color c2 = new Color(100, 255, 100);
        Color c3 = new Color(100, 100, 255);

        g.setColor(c1);
        g.drawLine(20, 40, 100, 100);
        g.drawLine(20, 100, 100, 20);

        g.setColor(c2);
        g.drawLine(40, 45, 250, 180);
        g.drawLine(75, 90, 400, 400);

        g.setColor(c3);
        g.drawLine(20, 150, 400, 40);
        g.drawLine(25, 290, 80, 19);

        g.setColor(Color.red);
        g.drawLine(20, 40, 50, 50);
        g.drawLine(70, 90, 140, 100);

        g.setColor(Color.blue);
        g.drawLine(190, 40, 90, 60);
        g.drawLine(40, 40, 55, 50);

        g.setColor(Color.cyan);
        g.drawLine(100, 40, 60, 70);
        g.drawRoundRect(190, 40, 60, 60, 15, 15);
    }

    public static void main(String[] args) {
        ColorDemo appWin = new ColorDemo();
        appWin.setSize(new Dimension(340, 260));
        appWin.setTitle("ColorDemo");
        appWin.setVisible(true);
    }
}
