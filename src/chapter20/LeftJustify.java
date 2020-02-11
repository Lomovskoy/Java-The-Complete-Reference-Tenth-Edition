package chapter20;

import java.util.Formatter;

/**
 * Класс демонстрирующий выравнивание
 * по левому краю.
 *
 * @author Ломовской К.Ю.
 * @since 11.02.2020
 */
public class LeftJustify {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        // Выровнять строку по правому рка (по умолчанию)
        formatter.format("|%10.2f|", 123.123);
        System.out.println(formatter);
        formatter.close();

        // Выровнять строку по левому рка (по умолчанию)
        formatter = new Formatter();
        formatter.format("|%-10.2f|", 123.123);
        System.out.println(formatter);
        formatter.close();
    }
}
