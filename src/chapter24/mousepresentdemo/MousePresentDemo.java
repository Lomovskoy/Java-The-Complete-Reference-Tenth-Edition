package chapter24.mousepresentdemo;

import java.awt.*;

/**
 * В это программе внутренние классы не применяются.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class MousePresentDemo extends Frame {

    String msg = "";

    public MousePresentDemo(){
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }

    public static void main(String[] args) {
        MousePresentDemo appWin = new MousePresentDemo();

        appWin.setSize(new Dimension(200, 150));
        appWin.setTitle("MousePresentDemo");
        appWin.setVisible(true);
    }

}
