package chapter24.mousepresentdemo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * В это программе внутренние классы не применяются.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class MyMouseAdapter extends MouseAdapter {

    MousePresentDemo mousePresentDemo;

    public MyMouseAdapter(MousePresentDemo mousePresentDemo){
        this.mousePresentDemo = mousePresentDemo;
    }

    @Override // Обработать события от щелчка кнопок мыши
    public void mousePressed(MouseEvent me) {
        mousePresentDemo.msg = "Mouse Pressed";
        mousePresentDemo.repaint();
    }

}
