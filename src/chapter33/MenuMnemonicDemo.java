package chapter33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * В этой программе демонстрируются
 * простое главное меню с использованием мнемоников.
 *
 * @author Ломовской К.Ю.
 * @since 29.04.2020
 */
public class MenuMnemonicDemo implements ActionListener {

    JLabel jLabel;

    MenuMnemonicDemo() {
        // Создать новый контейнер типа JFrame
        JFrame jFrame = new JFrame("Main Menu Mnemonic"); // Демонстрация меню

        // Указать диспетчер потоковой компановки типа FlowLayout
        jFrame.setLayout(new FlowLayout());

        // Задать исхолный размеры фрейма
        jFrame.setSize(220, 200);

        // Завершить прикладную программу, как только
        // пользователь закроет её окно
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Создать метку для отображдения результатов выбора для меню
        jLabel = new JLabel();

        // Создать строку меню
        JMenuBar menuBar = new JMenuBar();

        // Создать меню File
        JMenu jmFile = new JMenu("File");                                // Файл
        jmFile.setMnemonic(KeyEvent.VK_F);

        JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_O);      // Открыть
        jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jmiClose = new JMenuItem("Close", KeyEvent.VK_C);    // Закрыть
        jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jmiSave = new JMenuItem("Save", KeyEvent.VK_S);      // Сохранить
        jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

        JMenuItem jmiExit = new JMenuItem("Exit", KeyEvent.VK_E);      // Выйти
        jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));

        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        menuBar.add(jmFile);

        // Создать меню Options
        JMenu jmOptions = new JMenu("Options");           // Параметры

        // Создать подменю Colors
        JMenu jmColors = new JMenu("Colors");             // Цвета
        JMenuItem jmiRed = new JMenuItem("Red");        // Красный
        JMenuItem jmiGreen = new JMenuItem("Green");    // Зелёный
        JMenuItem jmiBlue = new JMenuItem("Blue");      // Синий

        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        // Создать меню Priority
        JMenu jmPriority = new JMenu("Priority");         // Приоритет
        JMenuItem jmiHigh = new JMenuItem("High");      // Высокий
        JMenuItem jmiLow = new JMenuItem("Low");        // Низкий

        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);

        // Создать пункт в меню Reset
        JMenuItem jmiReset = new JMenuItem("Reset");    // Сбросить

        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        // Ввести всё выбираемое меню в строку меню
        menuBar.add(jmOptions);

        // Создать меню Help
        JMenu jmHelp = new JMenu("Help");                 // Справка
        JMenuItem jmiAbout = new JMenuItem("About");    // О программе

        jmHelp.add(jmiAbout);
        menuBar.add(jmHelp);

        // Ввсти приёмники действия от пунктов меню
        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
        jmiAbout.addActionListener(this);

        // Ввести метку на панель содержимого
        jFrame.add(jLabel);

        // Ввести строку меню во фрейм
        jFrame.setJMenuBar(menuBar);

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    // Обработать события действия пунктов меню
    @Override
    public void actionPerformed(ActionEvent ae) {

        // Получить команду действия из выбранного меню
        String comStr = ae.getActionCommand();

        // Выйти их программы, есчли пользователь
        // выберет пункт EXIT
        if (comStr.equals("Exit")) System.exit(0);

        // В протином случае отобразить результат
        // выбора из меню
        jLabel.setText(comStr + " Selected"); // Выбранно указанное
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(MenuMnemonicDemo::new);
    }
}
