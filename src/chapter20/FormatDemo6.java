package chapter20;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Класс демонстрирующий использование относительных индексов,
 * что бы упростить создание пользовательских форматов даты и времени.
 *
 * @author Ломовской К.Ю.
 * @since 11.02.2020
 */
public class FormatDemo6 {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        formatter.format("Today is day %te of %<tB %<tY", calendar);
        System.out.println(formatter);
        formatter.close();
    }
}
