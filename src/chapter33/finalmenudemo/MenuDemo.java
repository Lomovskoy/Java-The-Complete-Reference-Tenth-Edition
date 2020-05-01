package chapter33.finalmenudemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * В этой программе демонстрируются
 * окончательный вариант программы меню.
 *
 * @author Ломовской К.Ю.
 * @since 01.05.2020
 */
public class MenuDemo implements ActionListener {

    JLabel jlab;
    JMenuBar jmb;
    JToolBar jtb;
    JPopupMenu jpu;

    DebugAction setAct;
    DebugAction clearAct;
    DebugAction resumeAct;

    MenuDemo() {
        // Создать новый контейнер типа JFrame
        JFrame jfrm = new JFrame("Complete Bar Menu"); // Демонстрация меню

        // Задать исхолный размеры фрейма
        jfrm.setSize(360, 200);

        // Завершить прикладную программу, как только
        // пользователь закроет её окно
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать метку для отображдения результатов выбора для меню
        jlab = new JLabel();

        // Создать строку меню
        jmb = new JMenuBar();

        // Создфть меню Файл
        makeFileMenu();

        // Создфть меню отладчик
        makeActions();

        // Создфть панель инструментов
        makeToolBar();

        // Создфть меню Опций
        makeOptionsMenu();

        // Создфть меню справка
        makeHelpMenu();

        // Создфть меню изменить
        makeEditPUMenu();

        // Ввсти приёмники действия от всплывающего меню
        jfrm.addMouseListener(new MouseAdapter() {
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

        // Ввести етку в центр панели содержимого
        jfrm.add(jlab, SwingConstants.CENTER);

        // Ввесчти панель инструментов в северном расположении
        jfrm.add(jtb, BorderLayout.NORTH);

        // Ввести строку меню во фрейм
        jfrm.setJMenuBar(jmb);

        // Отобразить в фрейм
        jfrm.setVisible(Boolean.TRUE);
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
        jlab.setText(comStr + " Selected"); // Выбранно указанное
    }

    /** Класс действий для подменю и панели инструментов Debug. */
    public class DebugAction extends AbstractAction{

        public DebugAction(String name, Icon image, int mnem, int accel, String tTip){
            super(name, image);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accel, InputEvent.CTRL_DOWN_MASK));
            putValue(MNEMONIC_KEY, mnem);
            putValue(SHORT_DESCRIPTION, tTip);
        }

        // Обработать события как на панели инструментов,
        // так и вы меню Debug
        @Override
        public void actionPerformed(ActionEvent ae) {
            String comStr = ae.getActionCommand();

            jlab.setText(comStr + " Selected");

            // Изменить разрешонное состояние выбора
            // режимоврежимов уставноки и очистки точек прирывания
            if (comStr.equals("Set Breakpoint")){
                clearAct.setEnabled(Boolean.TRUE);
                setAct.setEnabled(Boolean.FALSE);
            } else if (comStr.equals("Clear Breakpoint")){
                clearAct.setEnabled(Boolean.FALSE);
                setAct.setEnabled(Boolean.TRUE);
            }
        }
    }

    // Создать меню Файл с мнемоникой и оперативными клавишами
    void makeFileMenu(){
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
        jmb.add(jmFile);

        // Ввсти приёмники действия от пунктов меню
        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
    }

    // Создать меню Опции
    void makeOptionsMenu(){

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
        jmb.add(jmOptions);

        // Ввсти приёмники действия от пунктов меню
        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
    }

    // Создать меню справка
    void makeHelpMenu(){
        ImageIcon icon = new ImageIcon("image/about.jpg");

        // Создать меню Help
        JMenu jmHelp = new JMenu("Help");                                   // Справка
        JMenuItem jmiAbout = new JMenuItem("About", icon);                // О программе
        jmiAbout.setToolTipText("Info about the Menu Demo program.");

        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        // Ввсти приёмники действия от пунктов меню
        jmiAbout.addActionListener(this);
    }

    // Создать действия для управлениыя подменю и понелью инструментов Debug
    void makeActions(){
        // Загрузить изображения для отображения действий
        ImageIcon setIcon = new ImageIcon("image/set.jpg");
        ImageIcon clearIcon = new ImageIcon("image/clear.jpg");
        ImageIcon resumeIcon = new ImageIcon("image/resume.jpg");

        // Создать действия
        // Установить точку прерывания
        setAct = new DebugAction(
                "Set Breakpoint",
                setIcon,
                KeyEvent.VK_S,
                KeyEvent.VK_B,
                "Set a break point");

        // Очистить точку прерывания
        clearAct = new DebugAction(
                "Clear Breakpoint",
                clearIcon,
                KeyEvent.VK_C,
                KeyEvent.VK_L,
                "Clear a break point");

        // Возобновить выполнение программы
        resumeAct = new DebugAction(
                "Resume Breakpoint",
                resumeIcon,
                KeyEvent.VK_R,
                KeyEvent.VK_R,
                "Resume a break point");

        // Сделать изначально недостыпным вариант Очистить точку прерывания
        clearAct.setEnabled(Boolean.FALSE);
    }

    // Создать панель инструментов Дебаг
    void makeToolBar(){

        // Создать кнопки для панели инструментов
        // используя соответствующие действия
        JButton jbtnSet = new JButton(setAct);
        JButton jbtnClear = new JButton(clearAct);
        JButton jbtnResume = new JButton(resumeAct);

        // Создатьб панель инструментов Debug
        jtb = new JToolBar("Breakpoint");

        // Ввести экранные кнопки на панель инструментов
        jtb.add(jbtnSet);
        jtb.add(jbtnClear);
        jtb.add(jbtnResume);

        // Ввсти приёмники действия от пунктов меню
        jbtnSet.addActionListener(this);
        jbtnClear.addActionListener(this);
        jbtnResume.addActionListener(this);
    }

    // Создать всплывающее меню изменить
    void makeEditPUMenu(){

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

        // Ввсти приёмники действия от пунктов меню
        jmiCut.addActionListener(this);
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке деспетчиризации событий
        SwingUtilities.invokeLater(MenuDemo::new);
    }
}
