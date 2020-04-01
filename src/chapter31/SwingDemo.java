package chapter31;

import javax.swing.*;

/**
 * В этой программе демонстрируются
 * простое прилодение на Swing.
 *
 * @author Ломовской К.Ю.
 * @since 01.04.2020
 */
public class SwingDemo {

    SwingDemo(){

        // Создать новый контейнер типа JFrame
        JFrame jFrame = new JFrame("A Simple Swing Application");
        // Простое Swing приложение

        // Задать исходные размеры фрейма
        jFrame.setSize(275, 100);

        // Завершить работу, если пользователь
        // закрывает окно
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать метку с текстом прилодения
        JLabel jLabel = new JLabel("Swing means powerful GUIs.");
        // Swing - это мощное ГПИ

        // Ввести метку в панель приложения
        jFrame.add(jLabel);

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Созадть фрейм в потоке диспетчиризации событий
        SwingUtilities.invokeLater(SwingDemo::new);
    }
}
