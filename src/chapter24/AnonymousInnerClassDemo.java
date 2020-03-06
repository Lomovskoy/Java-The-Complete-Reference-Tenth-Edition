package chapter24;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * В это программе демонстрирующая
 * применение анонимных внутренних классов.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class AnonymousInnerClassDemo extends Frame{

    String msg = "";

    public AnonymousInnerClassDemo(){
        // Анонимный внутренний класс для обработки
        // событий нажатия кнопок мыши
        addMouseListener(new MyMouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me) {
                msg = "Mouse Pressed";
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

    // Внутренний класс для обработки
    // событий нажатия кнопок мыши
    public class MyMouseAdapter extends MouseAdapter {

        @Override // Обработать события от щелчка кнопок мыши
        public void mousePressed(MouseEvent me) {
            msg = "Mouse Pressed";
            repaint();
        }
    }

    @Override // Вывести сведения о мыши
    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }

    public static void main(String[] args) {
        AnonymousInnerClassDemo appWin = new AnonymousInnerClassDemo();

        appWin.setSize(new Dimension(200, 150));
        appWin.setTitle("AnonymousInnerClassDemo");
        appWin.setVisible(true);
    }
}
