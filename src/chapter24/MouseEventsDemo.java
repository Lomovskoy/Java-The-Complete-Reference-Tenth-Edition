package chapter24;

import java.awt.*;
import java.awt.event.*;

/**
 * Класс демонстрирующий несколько обработчиков событий.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {

    String mgs = "";

    // Коардинаты положения курсора мыши
    int mouseX = 0;
    int mouseY = 0;

    public MouseEventsDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    @Override // Обработать события от щелчка кнопок мыши
    public void mouseClicked(MouseEvent me) {
        mgs = mgs + " -- click received";
        repaint();
    }

    @Override // Обработать события наведения курсора мыши
    public void mousePressed(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        mgs = "Mouse exited";
        repaint();
    }

    @Override // Обработать события отведения курсора мыши
    public void mouseReleased(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        mgs = "Mouse exited";
        repaint();
    }

    @Override // Обработать события нажатие кнопки мыши
    public void mouseEntered(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        mgs = "Mouse down";
        repaint();
    }

    @Override // Обработать события отпускания кнопки мыши
    public void mouseExited(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        mgs = "Mouse released";
        repaint();
    }

    @Override // Обработать события перетескивания курсора мыши
    public void mouseDragged(MouseEvent me) {
        // Сохранение коардинат
        mouseX = me.getX();
        mouseY = me.getY();
        mgs = "* mouse at " + mouseX + ", " + mouseY;
        repaint();
    }

    @Override // Обработать события перемещения мыши
    public void mouseMoved(MouseEvent me) {
        mgs = "Moving mouse at " + me.getX() + ", " + me.getY();
        repaint();
    }

    @Override // Вывести сообщение в окне на текущей позиции с коардинатами X, Y
    public void paint(Graphics g) {
        g.drawString(mgs, mouseX, mouseY);
    }

    public static void main(String[] args) {
        MouseEventsDemo appWin = new MouseEventsDemo();

        appWin.setSize(new Dimension(300, 300));
        appWin.setTitle("MouseEventsDemo");
        appWin.setVisible(true);
    }

    // Закрыть окно и выйти из программы при
    // нажатии экранной кнопки закрытя окна.
    class MyWindowAdapter extends WindowAdapter{

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
