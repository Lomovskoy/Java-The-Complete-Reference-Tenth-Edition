package chapter32;

import javax.swing.*;
import java.awt.*;

/**
 * В этой программе демонстрируются
 * примение компонента JScrollPane.
 *
 * @author Ломовской К.Ю.
 * @since 03.04.2020
 */
public class JScrollPaneDemo {

    public JScrollPaneDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JScrollPaneDemo");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(400, 200);

        // Создать панель и ввести на ней 400 экранных кнопок
        JPanel jP = new JPanel();
        jP.setLayout(new GridLayout(20, 20));

        int b = 0;
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++) {
                jP.add(new JButton("Button " + b));
                ++b;
            }
        }

        // Создать панель с полосами прокрутки
        JScrollPane jsp = new JScrollPane(jP);

        // Ввести панель с полосами прокрутки на панели
        // содержимого. По умолчанию выполняется граничная
        // компоновка, и поэтому вводимая панель с полосами
        // прокрутки располагается по центру.
        jFrame.add(jsp, BorderLayout.CENTER);

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JScrollPaneDemo::new);
    }
}
