package chapter32.jtabbedpanedemo;

import javax.swing.*;

/**
 * Создать панель которая будет
 * видна на панели выбора.
 *
 * @author Ломовской К.Ю.
 * @since 03.04.2020
 */
public class FlavorsPanel extends JPanel {

    public FlavorsPanel(){
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Ваниль");
        comboBox.addItem("Шоколад");
        comboBox.addItem("Клубника");
        add(comboBox);
    }
}
