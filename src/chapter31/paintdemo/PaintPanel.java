package chapter31.paintdemo;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Этот класс расширяет класс JPanel.
 * В нем переопределется метод paintComponent(),
 * чтобы произвольно рисовать лини на панели.
 *
 * @author Ломовской К.Ю.
 * @since 01.04.2020
 */
public class PaintPanel extends JPanel {

    // Служит для хранения размеров груниц панели
    Insets ins;

    // Служит для генерации случайных чисел
    Random rand;

    // Создать панель
    PaintPanel(){

        // Разместить рамку вокруг панели,
        // определить ей границы
        setBorder(BorderFactory.createLineBorder(Color.RED, 5));

        rand = new Random();
    }

    // Переопределить метод paintComponent()
    @Override
    protected void paintComponent(Graphics g){
        // Вызывать всегда первым метод из суперкласса
        super.paintComponent(g);

        int x, y, x2, y2;

        // получить высоту и ширину компонента
        int height = getHeight();
        int width = getWidth();

        // Получить размеры границ понели
        ins = getInsets();

        // Нарисовать десять линий, конечные точки
        // которых формируются произвольно
        for (int i = 0; i < 10; i++){
            // Получить произвольные коардинаты
            // определяющие конечные точки каждой линии
            x = rand.nextInt(width - ins.left);
            y = rand.nextInt(height - ins.bottom);
            x2 = rand.nextInt(width - ins.left);
            y2 = rand.nextInt(width - ins.bottom);
            // Нарисовать линию
            g.drawLine(x, y, x2, y2);
        }
    }
}
