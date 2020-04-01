package chapter31;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * В этой программе демонстрируются
 * обработка событий в Swing приложении.
 *
 * @author Ломовской К.Ю.
 * @since 01.04.2020
 */
public class EventDemo {

    JLabel jLabel;

    EventDemo(){

        // Создать новый контейнер типа JFrame
        JFrame jFrame = new JFrame("An Event Example");
        // Пример обработки событий

        // Определить диспетчер поточной
        // компоновки типа FlowLayout
        jFrame.setLayout(new FlowLayout());

        // Задать исходные размеры фрейма
        jFrame.setSize(220, 90);

        // Завершить работу, если пользователь
        // закрывает окно
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать 2 кнопки
        JButton alphaBtn = new JButton("Alpha");
        JButton betaBtn = new JButton("Beta");

        // Ввести приёмник событий для кнопки Alpha
        alphaBtn.addActionListener(e -> jLabel.setText("Alpha was pressed."));
        // Нажата кнопка Alpha

        // Ввести приёмник событий для кнопки Beta
        betaBtn.addActionListener(e -> jLabel.setText("Beta was pressed."));
        // Нажата кнопка Beta

        // Ввести кнопки на панели содержимого
        jFrame.add(alphaBtn);
        jFrame.add(betaBtn);

        // Создать текстовую метку
        jLabel = new JLabel("Press a button.");
        // Метка "Нажмите кнопку"

        // Ввести метку на панели содержимого
        jFrame.add(jLabel);

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Созадть фрейм в потоке диспетчиризации событий
        SwingUtilities.invokeLater(EventDemo::new);
    }
}
