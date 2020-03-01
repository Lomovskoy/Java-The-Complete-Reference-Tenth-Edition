package chapter24;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий обработчики
 * событий от клавиатуры.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class SimpleKey extends Frame implements KeyListener {

    String mgs = "";
    String keyState = "";

    public SimpleKey(){
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    @Override // Обработать события от ввода с клавиатуры
    public void keyTyped(KeyEvent key) {
        mgs += key.getKeyChar();
        repaint();
    }

    @Override // Обработать события от нажатия клавиши
    public void keyPressed(KeyEvent key) {
        keyState = "Key Down";
        repaint();
    }

    @Override // Обработать события от отпускания клавиши
    public void keyReleased(KeyEvent key) {
        keyState = "Key Up";
        repaint();
    }

    @Override // Вывести нажатия клавиш
    public void paint(Graphics g) {
        g.drawString(mgs, 20, 100);
        g.drawString(keyState, 20, 50);
    }

    public static void main(String[] args) {
        SimpleKey appWin = new SimpleKey();

        appWin.setSize(new Dimension(200, 150));
        appWin.setTitle("SimpleKey");
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
