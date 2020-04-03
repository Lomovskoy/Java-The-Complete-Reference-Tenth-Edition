package chapter32.jtabbedpanedemo;

import javax.swing.*;

/**
 * Создать панель которая будет
 * видна на панели выбора.
 *
 * @author Ломовской К.Ю.
 * @since 03.04.2020
 */
public class CitiesPanel extends JPanel {

    public CitiesPanel(){
        JButton b1 = new JButton("Москва");
        add(b1);
        JButton b2 = new JButton("Санкт Питербург");
        add(b2);
        JButton b3 = new JButton("Орск");
        add(b3);
        JButton b4 = new JButton("Новосибирск");
        add(b4);
    }
}
