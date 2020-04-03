package chapter32.jtabbedpanedemo;

import javax.swing.*;
import java.awt.*;

/**
 * В этой программе демонстрируются
 * примение компонента JTabbedPane.
 *
 * @author Ломовской К.Ю.
 * @since 03.04.2020
 */
public class JTabbedPaneDemo {

    public JTabbedPaneDemo(){
        // Установить фрейм средствами класаса JFrame
        JFrame jFrame = new JFrame("JTabbedPaneDemo");
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(400, 200);

        // Создать панель с вкладками
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Города", new CitiesPanel());
        tabbedPane.addTab("Цвета", new ColorsPanel());
        tabbedPane.addTab("Запахи", new FlavorsPanel());
        jFrame.add(tabbedPane);

        // Отобразить фреймы
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(JTabbedPaneDemo::new);
    }
}
