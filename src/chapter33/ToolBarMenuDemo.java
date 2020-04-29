package chapter33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * В этой программе демонстрируются
 * простое главное меню с использованием
 * панели инструментов.
 *
 * @author Ломовской К.Ю.
 * @since 29.04.2020
 */
public class ToolBarMenuDemo implements ActionListener {

    JLabel jLabel;
    JPopupMenu jpu;

    ToolBarMenuDemo() {
        // Создать новый контейнер типа JFrame
        JFrame jFrame = new JFrame("Tool Bar Menu"); // Демонстрация меню

        // Создать метку для отображдения результатов выбора для меню
        jLabel = new JLabel();

        // Указать диспетчер потоковой компановки типа BorderLayout
        jFrame.add(jLabel, BorderLayout.CENTER);

        // Задать исхолный размеры фрейма
        jFrame.setSize(220, 200);

        // Завершить прикладную программу, как только
        // пользователь закроет её окно
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        JMenu jmOptions = new JMenu("Options");                           // Параметры

        // Создать подменю Colors используя флажки,
        // что бы пользователь мог выбрть сразу несколько цветов
        JMenu jmColors = new JMenu("Colors");                             // Цвета

        JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red");        // Красный
        JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");    // Зелёный
        JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");      // Синий

        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        // Создать меню Priority
        JMenu jmPriority = new JMenu("Priority");                           // Приоритет

        // Использовать кнопки перелючатели для установки приоритета.
        // Благодаря этому в меню не только отображается установленный
        // приоритет, но и гарантируется установка одного и только
        // одного приоритета. Исходно выбирается кнопка переключатель
        // в пункте меню High.
        JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("High", true);  // Высокий
        JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Low");                  // Низкий

        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);

        // Создать группу кнопок переключателей в
        // пунктах подменю Priority
        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiHigh);
        bg.add(jmiLow);

        // Создать пункт в меню Reset
        JMenuItem jmiReset = new JMenuItem("Reset");                       // Сбросить

        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        // Ввести всё выбираемое меню в строку меню
        menuBar.add(jmOptions);

        ImageIcon about = new ImageIcon("image/about.jpg");

        // Создать меню Help
        JMenu jmHelp = new JMenu("Help");                 // Справка
        JMenuItem jmiAbout = new JMenuItem("About", about);    // О программе

        jmHelp.add(jmiAbout);
        menuBar.add(jmHelp);

        // Создать всплывающее мен. Edit
        jpu = new JPopupMenu();

        // Создать пункты всплывающего меню
        JMenuItem jmiCut = new JMenuItem("Cut");
        JMenuItem jmiCopy = new JMenuItem("Copy");
        JMenuItem jmiPaste = new JMenuItem("Paste");

        // Ввести пункты во всплывающее меню
        jpu.add(jmiCut);
        jpu.add(jmiCopy);
        jpu.add(jmiPaste);

        // Создатьб панель инструментов Debug
        JToolBar jtb = new JToolBar("Debug");

        // Загрузить изрбражения значков экранных кнопок
        ImageIcon set = new ImageIcon("image/set.jpg");
        ImageIcon clear = new ImageIcon("image/clear.jpg");
        ImageIcon resume = new ImageIcon("image/resume.jpg");

        // Создать кнопки для панели инструментов
        // Установить точку прерывания
        JButton jbtnSet = new JButton(set);
        jbtnSet.setActionCommand("Set Breakpoint");
        jbtnSet.setToolTipText("Set Breakpoint");

        // Очистить точку прерывания
        JButton jbtnClear = new JButton(clear);
        jbtnClear.setActionCommand("Clear Breakpoint");
        jbtnClear.setToolTipText("Clear Breakpoint");

        // Возобновить выполнение программы
        JButton jbtnResume = new JButton(resume);
        jbtnResume.setActionCommand("Resume Breakpoint");
        jbtnResume.setToolTipText("Resume Breakpoint");

        // Ввести экранные кнопки на панель инструментов
        jtb.add(jbtnSet);
        jtb.add(jbtnClear);
        jtb.add(jbtnResume);

        // Ввсти приёмники действия от всплывающего меню
        jFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.isPopupTrigger())
                    jpu.show(me.getComponent(), me.getX(), me.getY());
            }

            @Override
            public void mouseReleased(MouseEvent me){
                if (me.isPopupTrigger())
                    jpu.show(me.getComponent(), me.getX(), me.getY());
            }
        });

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
        jmiCut.addActionListener(this);
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);
        jbtnSet.addActionListener(this);
        jbtnClear.addActionListener(this);
        jbtnResume.addActionListener(this);

        // Ввесчти панель инструментов в северном расположении
        // на панель содерджимого
        jFrame.add(jtb, BorderLayout.NORTH);

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
        SwingUtilities.invokeLater(ToolBarMenuDemo::new);
    }
}
