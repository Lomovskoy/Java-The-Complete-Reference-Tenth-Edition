package chapter24;

import java.awt.*;
import java.awt.event.*;

/**
 * Класс демонстрирующий обработчик
 * некоторых кодо виртуальных клавиш.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class KeyEventDemo extends Frame implements KeyListener {

    String mgs = "";
    String keyState = "";

    public KeyEventDemo(){
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    @Override
    public void keyTyped(KeyEvent key) {
        mgs += key.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        keyState = "Key Down";
        int key = ke.getKeyCode();

        switch (key){
            case KeyEvent.VK_F1:
                mgs += "<F1>";
                break;
            case KeyEvent.VK_F2:
                mgs += "<F2>";
                break;
            case KeyEvent.VK_F3:
                mgs += "<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                mgs += "<PgDn>";
                break;
            case KeyEvent.VK_PAGE_UP:
                mgs += "<PgUp>";
                break;
            case KeyEvent.VK_LEFT:
                mgs += "<Left Arrow>";
                break;
            case KeyEvent.VK_RIGHT:
                mgs += "<Right Arrow>";
                break;
        }
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
        KeyEventDemo appWin = new KeyEventDemo();

        appWin.setSize(new Dimension(200, 150));
        appWin.setTitle("KeyEventDemo");
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
