package chapter26;

import java.awt.*;
import java.awt.event.*;

/**
 * В это программе демонстрируется применение меню.
 *
 * @author Ломовской К.Ю.
 * @since 07.03.2020
 */
public class MenuDemo extends Frame{

    String msg = "";
    CheckboxMenuItem debug, test;

    public MenuDemo(){

        // Создать строку меню и ввести её в фрейм
        MenuBar mBar = new MenuBar();
        setMenuBar(mBar);

        // Создать пункты меню
        Menu file = new Menu("File");
        MenuItem item1, item2, item3, item4, item5;
        file.add(item1 = new MenuItem("New..."));
        file.add(item2 = new MenuItem("Open..."));
        file.add(item3 = new MenuItem("Close"));
        file.add(item4 = new MenuItem("-"));
        file.add(item5 = new MenuItem("Quit..."));
        mBar.add(file);

        Menu edit = new Menu("Edit");
        MenuItem item6, item7, item8, item9;
        edit.add(item6 = new MenuItem("Cut"));
        edit.add(item7 = new MenuItem("Copy"));
        edit.add(item8 = new MenuItem("Paste"));
        edit.add(item9 = new MenuItem("-"));
        mBar.add(edit);

        Menu sub = new Menu("Spetial");
        MenuItem item10, item11, item12;
        sub.add(item10 = new MenuItem("First"));
        sub.add(item11 = new MenuItem("Second"));
        sub.add(item12 = new MenuItem("Third"));
        mBar.add(sub);

        // Создать отмеаемые пункты меню
        debug = new CheckboxMenuItem("Debug");
        edit.add(debug);
        test = new CheckboxMenuItem("Testing");
        edit.add(test);

        mBar.add(edit);

        // Создать объект для обработки событий действия
        // и событий для элементов
        MyMenuHandler handler = new MyMenuHandler();

        // Зарегистрировать этот объект для прёма событий
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);
        item5.addActionListener(handler);
        item6.addActionListener(handler);
        item7.addActionListener(handler);
        item8.addActionListener(handler);
        item9.addActionListener(handler);
        item10.addActionListener(handler);
        item11.addActionListener(handler);
        item12.addActionListener(handler);
        debug.addActionListener(handler);
        test.addActionListener(handler);

        // Воспользоваться лямбда-выражением для
        // обработки выбора варианта выхода из программы
        item5.addActionListener((ae) -> System.exit(0));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g){
        g.drawString(msg, 10, 220);

        if (debug.getState())
            g.drawString("Debug is on.", 10, 240);
        else
            g.drawString("Debug is off.", 10, 240);

        if (test.getState())
            g.drawString("Testing is on.", 10, 260);
        else
            g.drawString("Testing is off.", 10, 260);
    }

    public static void main(String[] args) {
        MenuDemo appWin = new MenuDemo();
        appWin.setSize(new Dimension(250, 300));
        appWin.setTitle("MenuDemo");
        appWin.setVisible(true);
    }

    // Внутренний класс для обработки событий действия
    // в пунктах меню
    class MyMenuHandler implements ActionListener, ItemListener{

        @Override // Обработать события действия
        public void actionPerformed(ActionEvent ae) {
            msg = "You selected ";
            String arg = ae.getActionCommand();
            if (arg.equals("New..."))
                msg += "New.";
            else if (arg.equals("Open..."))
                msg += "Open.";
            else if (arg.equals("Close"))
                msg += "Close.";
            else if (arg.equals("Edit"))
                msg += "Edit.";
            else if (arg.equals("Cut"))
                msg += "Cut.";
            else if (arg.equals("Copy"))
                msg += "Copy.";
            else if (arg.equals("Paste"))
                msg += "Paste";
            else if (arg.equals("First"))
                msg += "First.";
            else if (arg.equals("Second"))
                msg += "Second.";
            else if (arg.equals("Third"))
                msg += "Third.";
            else if (arg.equals("Debug"))
                msg += "Debug.";
            else if (arg.equals("Testing"))
                msg += "Testing";

            repaint();
        }

        @Override // Обработать события в пунктах меню
        public void itemStateChanged(ItemEvent ie) {
            repaint();
        }
    }
}