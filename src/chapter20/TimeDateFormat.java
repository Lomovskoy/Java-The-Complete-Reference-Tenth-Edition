package chapter20;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Класс демонстрирующий способы
 * форматиролвания даты и времени.
 *
 * @author Ломовской К.Ю.
 * @since 10.02.2020
 */
public class TimeDateFormat {

    public static void main(String[] args) {

        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        // Вывести время в стандартном 12 часовом формате
        formatter.format("%tr", calendar);
        System.out.println(formatter);

        // Вывести сведения о дате и времени
        formatter = new Formatter();
        formatter.format("%tc", calendar);
        System.out.println(formatter);

        // Вывести только часы и минуты
        formatter = new Formatter();
        formatter.format("%tl:%tM", calendar, calendar);
        System.out.println(formatter);

        // Вывести название и номер месяца
        formatter = new Formatter();
        formatter.format("%tB %tb %tm", calendar, calendar, calendar);
        System.out.println(formatter);
        formatter.close();
    }
}
