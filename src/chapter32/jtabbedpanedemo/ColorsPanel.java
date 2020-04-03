package chapter32.jtabbedpanedemo;

import chapter32.JButtonDemo;

import javax.swing.*;

/**
 * Создать панель которая будет
 * видна на панели выбора.
 *
 * @author Ломовской К.Ю.
 * @since 03.04.2020
 */
public class ColorsPanel extends JPanel {

    public ColorsPanel(){
        JCheckBox checkBox1 = new JCheckBox("Красный");
        add(checkBox1);
        JCheckBox checkBox2 = new JCheckBox("Зелёный");
        add(checkBox2);
        JCheckBox checkBox3 = new JCheckBox("Синий");
        add(checkBox3);
    }
}
