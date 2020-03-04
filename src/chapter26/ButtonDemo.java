package chapter26;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий применение
 * экранных кнопок.
 *
 * @author Ломовской К.Ю.
 * @since 04.03.2020
 */
public class ButtonDemo extends Frame implements ActionListener {

    String msg = "";
    Button yes, no, maybe;

    public ButtonDemo(){

        // Использовать диспетчер поточной компановки
        setLayout(new FlowLayout());
        // Создать экранные кнопки
        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Maybe");

        // ВВести экранные кнопки в фрейм
        add(yes);
        add(no);
        add(maybe);

        // Ввести приймноко дейтвий для кнопки
        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override // Обработать события действия
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        if (str.equals("Yes")){
            msg = "You pressed Yes";
        } else if (str.equals("No")){
            msg = "You pressed No";
        } else {
            msg = "You pressed Maybe";
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }

    public static void main(String[] args) {
        ButtonDemo appWin = new ButtonDemo();
        appWin.setSize(new Dimension(250, 150));
        appWin.setTitle("ButtonDemo");
        appWin.setVisible(true);
    }
}
