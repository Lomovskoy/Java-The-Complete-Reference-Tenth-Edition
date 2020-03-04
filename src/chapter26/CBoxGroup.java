package chapter26;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий применение кнопок переключателей.
 *
 * @author Ломовской К.Ю.
 * @since 04.03.2020
 */
public class CBoxGroup extends Frame implements ItemListener {

    String msg = "";
    Checkbox windows, android, solaris, mac;
    CheckboxGroup cbg;

    public CBoxGroup(){

        // Использовать диспетчер поточной компановки
        setLayout(new FlowLayout());

        // Создать кнопки переключатели
        cbg = new CheckboxGroup();

        // Создать флаги
        windows = new Checkbox("Windows", cbg, true);
        android = new Checkbox("Android", cbg, false);
        solaris = new Checkbox("Solaris", cbg, false);
        mac = new Checkbox("Mac OS", cbg, false);

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
        msg = "Current selection: ";
        msg += cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 20, 120);
    }

    public static void main(String[] args) {
        CBoxGroup appWin = new CBoxGroup();
        appWin.setSize(new Dimension(240, 180));
        appWin.setTitle("CBoxGroup");
        appWin.setVisible(true);
    }
}
