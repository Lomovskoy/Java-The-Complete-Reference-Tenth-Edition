package chapter26;

import java.awt.*;
import java.awt.event.*;

/**
 * Класс демонстрирующий применение полос прокрутки.
 *
 * @author Ломовской К.Ю.
 * @since 05.03.2020
 */
public class SBDemo extends Frame implements AdjustmentListener {

    String msg = "";
    Scrollbar vertSB, horzSB;

    public SBDemo(){
        // Использовать диспетчер полной компановки
        setLayout(new FlowLayout());

        // Создать полосы прокрутки и
        // задать их предпочтительные размеры
        vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 200);
        vertSB.setPreferredSize(new Dimension(20, 100));

        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
        horzSB.setPreferredSize(new Dimension(100, 20));

        // Ввести полосы прокрутки в фрейм
        add(vertSB);
        add(horzSB);

        // Добавить приймники событий к полосам прокрутки
        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);

        // Ввести приёмник событий от мыши
        addMouseListener(new MouseAdapter() {
            // Обновить полосы прокрутки для отражения перемещений мыши
            @Override
            public void mouseDragged(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();
                vertSB.setValue(y);
                horzSB.setValue(x);
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
    public void adjustmentValueChanged(AdjustmentEvent e) {
        repaint();
    }

    @Override // Отобразить текущее состояние полос прокрутки
    public void paint(Graphics g) {
        msg = "Vertical: " + vertSB.getValue();
        msg += ", Horizontal: " + horzSB.getValue();
        g.drawString(msg, 20, 160);

        // Показать текущее положение перемещения мыши
        g.drawString("*", horzSB.getValue(), vertSB.getValue());
    }

    public static void main(String[] args) {
        SBDemo appWin = new SBDemo();
        appWin.setSize(new Dimension(300, 180));
        appWin.setTitle("SBDemo");
        appWin.setVisible(true);
    }
}
