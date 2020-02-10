package chapter20;

import java.util.Formatter;

/**
 * Класс демонстрирующий применение
 * спецификаторов формата %n и %%.
 *
 * @author Ломовской К.Ю.
 * @since 10.02.2020
 */
public class FormatDemo3 {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        formatter.format("Копирование файла%nПередача завершена на %d%%", 88);
        System.out.println(formatter);

        formatter.close();
    }
}
