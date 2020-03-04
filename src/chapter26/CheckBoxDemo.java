package chapter26;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий применение флжков.
 *
 * @author Ломовской К.Ю.
 * @since 04.03.2020
 */
public class CheckBoxDemo extends Frame implements ItemListener {

    String msg = "";
    Checkbox windows, android, solaris, mac;

    public CheckBoxDemo(){

        // Использовать диспетчер поточной компановки
        setLayout(new FlowLayout());

        // Создать флаги
        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        // Ввести флажуи в фрейм
        add(windows);
        add(android);
        add(solaris);
        add(mac);

        // Ввести приёмники событий в отдельных элементах
        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    @Override // Отобразить текуцщее состояние флажков
    public void paint(Graphics g) {
        msg = "Current state: ";
        g.drawString(msg, 20, 120);
        msg = "Windows: " + windows.getState();
        g.drawString(msg, 20, 140);
        msg = "Android: " + android.getState();
        g.drawString(msg, 20, 160);
        msg = "Solaris: " + solaris.getState();
        g.drawString(msg, 20, 180);
        msg = "Mac OS: " + mac.getState();
        g.drawString(msg, 20, 200);
    }

    public static void main(String[] args) {
        CheckBoxDemo appWin = new CheckBoxDemo();
        appWin.setSize(new Dimension(240, 220));
        appWin.setTitle("CheckBoxDemo");
        appWin.setVisible(true);
    }
}
