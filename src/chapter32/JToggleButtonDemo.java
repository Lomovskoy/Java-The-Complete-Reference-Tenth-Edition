package chapter32;

import javax.swing.*;
import java.awt.*;

/**
 * В этой программе демонстрируются
 * примение компонента JToggleButton.
 *
 * @author Ломовской К.Ю.
 * @since 03.04.2020
 */
public class JToggleButtonDemo {

    public JToggleButtonDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JToggleButtonDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(200, 100);

        // Создать метку
        JLabel jLabel = new JLabel("Button is off.");

        // Создать переключатель
        JToggleButton button = new JToggleButton("On/Off");

        // Ввести приёмник событий от переключателя
        button.addItemListener(e -> {
            if (button.isSelected()) {
                jLabel.setText("Button is on.");
            } else {
                jLabel.setText("Button is off.");
            }
        });

        // Вывести переключатель и метку на панель содержимого
        jFrame.add(button);
        jFrame.add(jLabel);

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JToggleButtonDemo::new);
    }
}
