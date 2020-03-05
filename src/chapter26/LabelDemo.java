package chapter26;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс демонстрирующий применение меток.
 *
 * @author Ломовской К.Ю.
 * @since 04.03.2020
 */
public class LabelDemo extends Frame {

    public LabelDemo(){
        // Использовать диспетчер полной компановки
        setLayout(new FlowLayout());

        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");

        // Ввести метки в фрейм
        add(one);
        add(two);
        add(three);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        LabelDemo appWin = new LabelDemo();
        appWin.setSize(new Dimension(300, 100));
        appWin.setTitle("LabelDemo");
        appWin.setVisible(true);
    }
}
