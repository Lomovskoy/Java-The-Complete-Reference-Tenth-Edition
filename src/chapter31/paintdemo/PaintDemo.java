package chapter31.paintdemo;

import javax.swing.*;

/**
 * В этой программе демонстрируются
 * рисование на экране.
 *
 * @author Ломовской К.Ю.
 * @since 01.04.2020
 */
public class PaintDemo {

    PaintPanel pp;

    PaintDemo(){

        // Создать новый контейнер типа JFrame
        JFrame jFrame = new JFrame("Paint Demo");

        // Задать исходные размеры фрейма
        jFrame.setSize(200, 150);

        // Завершить работу, если пользователь закрывает окно
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать панель для рисования
        pp = new PaintPanel();

        // Ввести эту панель на панели содержимого.
        // В данном случае применяется граничения
        // компановки, поэтому размеры панели будут
        // автоматически подгоняться таким образом,
        // чтобы она заняла центральную область
        jFrame.add(pp);

        // Отобразить фрейм
        jFrame.setVisible(Boolean.TRUE);
    }

    public static void main(String[] args) {
        // Созадть фрейм в потоке диспетчиризации событий
        SwingUtilities.invokeLater(PaintDemo::new);
    }
}
