package chapter32;

import javax.swing.*;
import java.awt.*;

/**
 * В этой программе демонстрируются
 * примение компонентов типа JLabel
 * и ImageIcon из библиотеки Swing.
 *
 * @author Ломовской К.Ю.
 * @since 02.04.2020
 */
public class JLabelDemo {

    public JLabelDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JLabelDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(260, 210);

        // Создать значёк
        ImageIcon icon = new ImageIcon("hourglass.png");

        // Созадть метку
        JLabel jLabel = new JLabel("Hourglass", icon, JLabel.CENTER);

        // Ввести метку на панели содержимого
        jFrame.add(jLabel);

        // отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JLabelDemo::new);
    }
}
