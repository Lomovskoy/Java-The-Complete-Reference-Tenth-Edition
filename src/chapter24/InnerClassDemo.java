package chapter24;

import chapter24.adapterdemo.AdapterDemo;
import chapter24.adapterdemo.MyMouseAdapter;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * В это программе демонстрируется
 * применение внутреннихъ классов.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class InnerClassDemo extends Frame{

    String msg = "";

    public InnerClassDemo(){
        addMouseListener(new MyMouseAdapter());
        addWindowListener(new MyWindowAdapter());
    }

    // Внутренний класс для обработки
    // событий нажатия кнопок мыши
    public class MyMouseAdapter extends MouseAdapter {

        @Override // Обработать события от щелчка кнопок мыши
        public void mousePressed(MouseEvent me) {
            msg = "Mouse Pressed";
            repaint();
        }
    }

    // Внутренний класс для обработки событий нажатия
    // экранной кнопки закрытя окна.
    class MyWindowAdapter extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    @Override // Вывести сведения о мыши
    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }

    public static void main(String[] args) {
        InnerClassDemo appWin = new InnerClassDemo();

        appWin.setSize(new Dimension(200, 150));
        appWin.setTitle("InnerClassDemo");
        appWin.setVisible(true);
    }
}
