package charapter25;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий отображение
 * некоторых шрифтов.
 *
 * @author Ломовской К.Ю.
 * @since 03.03.2020
 */
public class ShowFonts extends Frame {

    String msg = "First five fonts: ";
    GraphicsEnvironment ge;

    public ShowFonts() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Получить графическую среду
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        // Получить список шрифтов
        String[] fontList = ge.getAvailableFontFamilyNames();

        // Создать символьную строку с первыми 5 шрифтами
        for (int i = 0; (i < 5) && (i < fontList.length); i++)
            msg += fontList[i] + " ";
    }

    @Override // Отобразить шрифты
    public void paint(Graphics g) {
        g.drawString(msg, 10, 60);
    }

    public static void main(String[] args) {
        ShowFonts appWin = new ShowFonts();
        appWin.setSize(new Dimension(500, 100));
        appWin.setTitle("ShowFonts");
        appWin.setVisible(true);
    }
}
