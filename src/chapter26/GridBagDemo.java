package chapter26;

import java.awt.*;
import java.awt.event.*;

/**
 * В это программе демонстрируется
 * применение серчето-контейнерной компановки.
 *
 * @author Ломовской К.Ю.
 * @since 07.03.2020
 */
public class GridBagDemo extends Frame implements ItemListener {

    String msg = "";
    Checkbox windows, android, solaris, mac;

    public GridBagDemo(){

        // Использовать диспетчер сетчето-контейнерной компановки
        GridBagLayout gBag = new GridBagLayout();
        GridBagConstraints gds = new GridBagConstraints();
        setLayout(gBag);

        // Определить флажки
        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        // Определить сеточный контейнер

        // Использовать нулевой вес по умолчанию для первой строки
        gds.weightx = 1.0;
        // Использовать единичный вес для сторлбца
        gds.ipadx = 200; // Заполнить на 200 единиц
        gds.insets = new Insets(0, 6, 0, 0);
        // Сделать небольшую вставку относительно левого верхнего угла
        gds.anchor = GridBagConstraints.NORTHEAST;

        gds.gridheight = GridBagConstraints.RELATIVE;
        gBag.setConstraints(windows, gds);

        gds.gridwidth = GridBagConstraints.REMAINDER;
        gBag.setConstraints(android, gds);

        // Придать второй строке единичный вес
        gds.weighty = 1.0;

        gds.gridwidth = GridBagConstraints.RELATIVE;
        gBag.setConstraints(solaris, gds);

        gds.gridwidth = GridBagConstraints.REMAINDER;
        gBag.setConstraints(mac, gds);

        // Ввести компоненты
        add(windows);
        add(android);
        add(solaris);
        add(mac);

        // Зарегистрировать принменение событийц на комонентах
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

    // Воспроизвести повторно, когда изменится состояние флажка
    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        repaint();
    }

    // Отобразить текущее состояние флажков
    @Override
    public void paint(Graphics g){
        msg = "Current state: ";
        g.drawString(msg, 20, 100);
        msg = "  Windows: " + windows.getState();
        g.drawString(msg, 30, 120);
        msg = "  Android: " + android.getState();
        g.drawString(msg, 30, 140);
        msg = "  Solaris: " + solaris.getState();
        g.drawString(msg, 30, 160);
        msg = "  Mac: " + mac.getState();
        g.drawString(msg, 30, 180);
    }

    public static void main(String[] args) {
        GridBagDemo appWin = new GridBagDemo();
        appWin.setSize(new Dimension(300, 220));
        appWin.setTitle("GridBagDemo");
        appWin.setVisible(true);
    }
}