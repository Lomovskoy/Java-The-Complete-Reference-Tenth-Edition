package chapter24.mousepresentdemo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Закрыть окно и выйти из программы при
 * нажатии экранной кнопки закрытя окна.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class MyWindowAdapter extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
