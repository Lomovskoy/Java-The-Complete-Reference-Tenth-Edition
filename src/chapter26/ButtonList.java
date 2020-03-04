package chapter26;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий распознавание
 * типо Button.
 *
 * @author Ломовской К.Ю.
 * @since 04.03.2020
 */
public class ButtonList extends Frame implements ActionListener {

    String msg = "";
    Button[] bList = new Button[3];

    public ButtonList(){

        // Использовать диспетчер поточной компановки
        setLayout(new FlowLayout());

        // Создать экранные кнопки
        Button yes = new Button("Yes");
        Button no = new Button("No");
        Button maybe = new Button("Maybe");

        // Сохраним ссылки на экранные кнопки
        // по мере их ввода в фрейм
        bList[0] = (Button) add(yes);
        bList[1] = (Button) add(no);
        bList[2] = (Button) add(maybe);

        // Зарегистрировать приёмник событий действия
        for (int i = 0; i < 3; i++){
            bList[i].addActionListener(this);
        }

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override // Обработать события действия экранных кнопок
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < 3; i++){
            if (ae.getSource() == bList[i]){
                msg = "You pressed " + bList[i].getLabel();
            }
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }

    public static void main(String[] args) {
        ButtonList appWin = new ButtonList();
        appWin.setSize(new Dimension(250, 150));
        appWin.setTitle("ButtonList");
        appWin.setVisible(true);
    }
}
