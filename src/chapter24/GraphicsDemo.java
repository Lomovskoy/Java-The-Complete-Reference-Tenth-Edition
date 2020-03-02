package chapter24;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * В это программе демонстрируется
 * графические элементы.
 *
 * @author Ломовской К.Ю.
 * @since 02.03.2020
 */
public class GraphicsDemo extends Frame {

    public GraphicsDemo(){
        // Анонимныйц внутренний класс для обработки
        // событий закрытия экрана
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {

        // Нарисовать линии
        g.drawLine(20, 40, 100, 90);
        g.drawLine(20, 90, 100, 40);
        g.drawLine(40, 45, 250, 80);

        // Нарисовать прямоугольники
        g.drawRect(20, 150, 60, 50);
        g.fillRect(110, 150, 60, 50);
        g.drawRoundRect(200, 150, 60, 50, 15, 15);
        g.fillRoundRect(290, 150, 60, 50, 30, 40);

        // Нарисовать элипсы и окружности
        g.drawOval(20, 250, 50, 50);
        g.fillOval(100, 250, 75, 50);
        g.drawOval(200, 260, 100, 40);

        // нарисовать дуги
        g.drawArc(20, 350, 70, 70, 0, 180);
        g.fillArc(70, 350, 70, 70, 0, 75);

        // Нарисовать многоугольник
        int[] xPoints = {20, 200, 20, 200, 20};
        int[] yPoints = {450, 450, 650, 650, 450};
        int num = 5;
        g.drawPolygon(xPoints, yPoints, num);
    }

    public static void main(String[] args) {
        GraphicsDemo appWin = new GraphicsDemo();
        appWin.setSize(new Dimension(370, 700));
        appWin.setTitle("GraphicsDemo");
        appWin.setVisible(true);
    }
}
