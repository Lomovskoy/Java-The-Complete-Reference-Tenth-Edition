package chapter32;

import javax.swing.*;
import java.awt.*;

/**
 * В этой программе демонстрируются
 * примение компонентов типа JTextField.
 *
 * @author Ломовской К.Ю.
 * @since 02.04.2020
 */
public class JTextFieldDemo {

    public JTextFieldDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JTextFieldDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(260, 120);

        // Ввести текстовое поле в панель содержимого
        JTextField jTextField = new JTextField(15);
        jFrame.add(jTextField);

        // Ввести метку
        JLabel jLabel = new JLabel();
        jFrame.add(jLabel);

        // Обработать события действия. Отобразить
        // текст, когда пользовательно нажмёт ввод
        jTextField.addActionListener(e -> jLabel.setText(jTextField.getText()));

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JTextFieldDemo::new);
    }
}
