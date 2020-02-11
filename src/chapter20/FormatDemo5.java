package chapter20;

import java.util.Formatter;

/**
 * Класс демонстрирующий применение
 * пробела в качестве спецификатора формата.
 *
 * @author Ломовской К.Ю.
 * @since 11.02.2020
 */
public class FormatDemo5 {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();

        formatter.format("% d", -100);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("% d", 100);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("% d", -200);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("% d", 200);
        System.out.println(formatter);
        formatter.close();
    }
}
