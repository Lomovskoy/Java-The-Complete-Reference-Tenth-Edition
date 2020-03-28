package chapter30;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * В этой программе демонстрируются
 * различные форматы времени.
 *
 * @author Ломовской К.Ю.
 * @since 28.03.2020
 */
public class TimeFormatDemo {

    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat;

        dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Япония: " + dateFormat.format(date));

        dateFormat = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
        System.out.println("Велиобритания: " + dateFormat.format(date));

        dateFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CANADA);
        System.out.println("Канада: " + dateFormat.format(date));
    }
}
