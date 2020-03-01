package chapter24.mousepresentdemo;

import java.awt.*;

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
