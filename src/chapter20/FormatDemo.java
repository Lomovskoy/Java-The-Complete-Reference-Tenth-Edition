package chapter20;

import java.util.Formatter;

/**
 * Класс демонстрирующий применение
 * класса Formatter.
 *
 * @author Ломовской К.Ю.
 * @since 09.02.2020
 */
public class FormatDemo {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        formatter.format("Форматировать %s просто: %d %f", "средствами Java", 10, 98.6);

        System.out.println(formatter);
        formatter.close();
    }
}
