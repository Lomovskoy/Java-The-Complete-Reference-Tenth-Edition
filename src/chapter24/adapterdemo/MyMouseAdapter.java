package chapter24.adapterdemo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Класс демонстрирующий обработчик
 * событий только от щелчков и перемещения мыши.
 *
 * @author Ломовской К.Ю.
 * @since 01.03.2020
 */
public class MyMouseAdapter extends MouseAdapter {

    AdapterDemo adapterDemo;

    public MyMouseAdapter(AdapterDemo adapterDemo){
        this.adapterDemo = adapterDemo;
    }

    @Override // Обработать события от щелчка кнопок мыши
    public void mouseClicked(MouseEvent me) {
        adapterDemo.msg = "Mouse Clicked";
        adapterDemo.repaint();
    }

    @Override // Обработать события перетескивания курсора мыши
    public void mouseDragged(MouseEvent me) {
        adapterDemo.msg = "Mouse Dragged";
        adapterDemo.repaint();
    }

}
