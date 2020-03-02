package chapter24;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * В это программе демонстрируется изменение размеров
 * графики с целью вписать её в текущие размеры окна.
 *
 * @author Ломовской К.Ю.
 * @since 02.03.2020
 */
public class ResizeMe extends Frame {

    final int inc = 25;
    int max = 500;
    int min = 200;
    Dimension d;

    public ResizeMe(){
        // Анонимный внутренний класс для обработки
        // событий отпускания кнопок мыши
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int w = (d.width = inc) > max ? min : (d.width + inc);
                int h = (d.height = inc) > max ? min : (d.height + inc);
                setSize(new Dimension(w, h));
            }
        });

        // Анонимный внутренний класс для
        // обработки события закрытя окна.
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Insets i = getInsets();
        d = getSize();

        g.drawLine(i.left, i.top, d.width - i.right, d.height - i.bottom);
        g.drawLine(i.left, d.height - i.bottom, d.width - i.right, i.top);
    }

    public static void main(String[] args) {
        ResizeMe appWin = new ResizeMe();
        appWin.setSize(new Dimension(200, 200));
        appWin.setTitle("ResizeMe");
        appWin.setVisible(true);
    }
}
