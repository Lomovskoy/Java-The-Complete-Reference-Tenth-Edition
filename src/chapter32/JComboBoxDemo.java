package chapter32;

import javax.swing.*;
import java.awt.*;

/**
 * В этой программе демонстрируются
 * примение компонента JComboBox.
 *
 * @author Ломовской К.Ю.
 * @since 04.04.2020
 */
public class JComboBoxDemo {

    String[] timepieces = {
            "Песочные часы", "Аналоговые часы",
            "Цифровые часы", "Секундомер"
    };

    public JComboBoxDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JComboBoxDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(400, 250);

        // Получить экземпляр объекта комбинированного
        // списка и ввести его на панели содержимого
        JComboBox<String> jcb = new JComboBox<>(timepieces);
        jFrame.add(jcb);

        // Создать метку и ввести её на панели содержимого
        JLabel jLabel = new JLabel(new ImageIcon("hourglass.png"));
        jFrame.add(jLabel);

        // Обработать события выбора элементов из списка
        jcb.addActionListener(e -> {
            String s = (String) jcb.getSelectedItem();
            jLabel.setIcon(new ImageIcon(s + ".png"));
        });

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JComboBoxDemo::new);
    }
}
