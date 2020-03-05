package chapter26;

import java.awt.*;
import java.awt.event.*;

/**
 * Класс демонстрирующий применение списков.
 *
 * @author Ломовской К.Ю.
 * @since 05.03.2020
 */
public class ListDemo extends Frame implements ActionListener {

    List os, browser;
    String msg = "";

    public ListDemo(){
        // Использовать диспетчер полной компановки
        setLayout(new FlowLayout());

        // Создать список с множественным выбором
        os = new List(4, true);

        // Создать список с одинарным выбором
        browser = new List(4);

        // Ввести элементы в список os
        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("Mac OS");

        // Ввести элементы в список browser
        browser.add("Internet Explorer");
        browser.add("Firefox");
        browser.add("Chrome");

        // Сделать первоначальный выбор
        browser.select(1);
        os.select(0);

        // Ввести списки в окно
        add(os);
        add(browser);

        // Ввести приёмнткти событий в отдельных элементах
        os.addActionListener(this);
        browser.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override // Отобразить текуцщее варианты выбора
    public void paint(Graphics g) {
        int[] idx;

        msg = "Current OS: ";
        idx = os.getSelectedIndexes();

        for (int i : idx)
            msg += os.getItem(i) + " ";

        g.drawString(msg, 6, 120);
        msg = "Current Browser: ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 6, 140);
    }

    public static void main(String[] args) {
        ListDemo appWin = new ListDemo();
        appWin.setSize(new Dimension(300, 180));
        appWin.setTitle("ListDemo");
        appWin.setVisible(true);
    }
}
