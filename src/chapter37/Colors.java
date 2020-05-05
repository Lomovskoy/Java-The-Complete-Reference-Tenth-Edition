package chapter37;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;

/**
 * В этой программе демонстрируются
 * простой компонент Java Bean.
 *
 * @author Ломовской К.Ю.
 * @since 05.05.2020
 */
public class Colors extends Canvas implements Serializable {

    // Несохраняемая переменная
    transient private Color color;
    // Сохраняемая переменная
    private boolean rectangular;

    public Colors() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent ae) {
            }
        });
        rectangular = Boolean.FALSE;
        setSize(200, 200);
    }

    public boolean getRectangular(){
        return rectangular;
    }

    public void setRectangular(boolean flag){
        this.rectangular = flag;
        repaint();
    }

    private Color randomColor(){
        int r = (int) (255 * Math.random());
        int g = (int) (255 * Math.random());
        int b = (int) (255 * Math.random());
        return new Color(r, g, b);
    }

    @Override
    public void paint(Graphics g){
        Dimension d = getSize();
        int h = d.height;
        int w = d.width;
        g.setColor(color);
        if (rectangular)
            g.fillRect(0, 0, w - 1, h - 1);
        else
            g.fillRect(0, 0, w - 1, h - 1);
    }
}
