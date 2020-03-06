package chapter25;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий вывод
 * многострочного текста.
 *
 * @author Ломовской К.Ю.
 * @since 03.03.2020
 */
public class MultiLine extends Frame {
    // Текущая позиция
    int cutX = 20;
    int curY = 40;

    public MultiLine(){
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();

        nextLine("This is on line one.", g);
        nextLine("This is on line two.", g);
        sameLine(" This is on same line.", g);
        sameLine(" This, too.", g);
        nextLine("This is on line three.", g);

        // Установить коардинаты в исходное состояние
        // перед следующим воспроизведением
        cutX = 20;
        curY = 40;
    }

    // перейти на следующую строку
    void nextLine(String s, Graphics g){
        FontMetrics fm = g.getFontMetrics();
        curY += fm.getHeight(); // перейти на следующую строку
        cutX = 20;
        g.drawString(s, cutX, curY);

        // Перейти в конец строки
        cutX += fm.stringWidth(s);
    }

    // Отобразить текст на той же самой строке
    void sameLine(String s, Graphics g){
        FontMetrics fm = g.getFontMetrics();

        g.drawString(s, cutX, curY);

        // Перейти в конец строки
        cutX += fm.stringWidth(s);
    }

    public static void main(String[] args) {
        MultiLine appWin = new MultiLine();
        appWin.setSize(new Dimension(310, 120));
        appWin.setTitle("MultiLine");
        appWin.setVisible(true);
    }
}
