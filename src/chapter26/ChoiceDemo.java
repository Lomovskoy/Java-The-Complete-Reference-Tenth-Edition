package chapter26;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий применение
 * раскрывающихся списков.
 *
 * @author Ломовской К.Ю.
 * @since 05.03.2020
 */
public class ChoiceDemo extends Frame implements ItemListener {

    Choice os, browser;
    String msg = "";

    public ChoiceDemo(){

        // Использовать диспетчер полной компановки
        setLayout(new FlowLayout());
        
        // Создать раскрывающиеся списки
        os = new Choice();
        browser = new Choice();

        // Ввести элементы в список os
        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("Mac OS");

        // Ввести элементы в список browser
        browser.add("Internet Explorer");
        browser.add("Firefox");
        browser.add("Chrome");

        // Ввести раскрывающиеся списки в окно
        add(os);
        add(browser);

        // Ввести приёмнткти событий в отдельных элементах
        os.addItemListener(this);
        browser.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    @Override // Отобразить текуцщее варианты выбора
    public void paint(Graphics g) {
        msg = "Current OS: ";
        msg += os.getSelectedItem();
        g.drawString(msg, 20, 120);
        msg = "Current Browser: ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 20, 140);
    }

    public static void main(String[] args) {
        ChoiceDemo appWin = new ChoiceDemo();
        appWin.setSize(new Dimension(240, 180));
        appWin.setTitle("ChoiceDemo");
        appWin.setVisible(true);
    }
}
