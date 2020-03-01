package chapter24.adapterdemo;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий обработчик
 * событий только от щелчков и перемещения мыши.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class AdapterDemo extends Frame {

    String msg = "";

    public AdapterDemo(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    @Override // Вывести сведения о мыши
    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }

    public static void main(String[] args) {
        AdapterDemo appWin = new AdapterDemo();

        appWin.setSize(new Dimension(200, 150));
        appWin.setTitle("AdapterDemo");
        appWin.setVisible(true);
    }

    // Закрыть окно и выйти из программы при
    // нажатии экранной кнопки закрытя окна.
    class MyWindowAdapter extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
